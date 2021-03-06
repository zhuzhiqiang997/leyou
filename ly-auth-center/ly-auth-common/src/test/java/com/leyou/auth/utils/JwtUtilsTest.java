package com.leyou.auth.utils;


import com.leyou.auth.entity.UserInfo;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author zhuzhiqiang997
 * @date 2018/10/1
 */
public class JwtUtilsTest {

    private static final String publicKeyPath = "D:/tmp/rsa/id_rsa.pub";
    private static final String privateKeyPath = "D:/tmp/rsa/id_rsa.pri";

    private PrivateKey privateKey;
    private PublicKey publicKey;


    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(publicKeyPath, privateKeyPath, "234");
    }

    @Before
    public void testGetRsa() throws Exception {
        privateKey = RsaUtils.getPrivateKey(privateKeyPath);
        publicKey = RsaUtils.getPublicKey(publicKeyPath);
    }

    @org.junit.Test
    public void generateToken() {
        //生成Token
        String s = JwtUtils.generateToken(new UserInfo(20L, "Rose"), privateKey, 5);
        System.out.println("s = " + s);
    }


    @org.junit.Test
    public void parseToken() {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiUm9zZSIsImV4cCI6MTU1OTk2MTg0MX0.N8R79s2aRkek8DZDgLrb0zGMZMycNTP_bwUdyJJ32wisZiJwKkh54HASxyaqnsx2j_H34v_3lrCuKGyhE8fYqOgtFAaWOkxZM-OYK7MZpUd012FSSvBWb7cUHa7BXt2MSvPkXY_v6HHcKiJ9kQrwZiIcjCtiqzVSLlm3y-K6E2Q";
        UserInfo userInfo = JwtUtils.getUserInfo(publicKey, token);
        System.out.println("id:" + userInfo.getId());
        System.out.println("name:" + userInfo.getName());
    }

    @org.junit.Test
    public void parseToken1() {
    }

    @org.junit.Test
    public void getUserInfo() {
    }

    @org.junit.Test
    public void getUserInfo1() {
    }
}
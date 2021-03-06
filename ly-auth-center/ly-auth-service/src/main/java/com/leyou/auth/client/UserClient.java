package com.leyou.auth.client;

import api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhuzhiqiang997
 * @date 2018/10/1
 */
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}

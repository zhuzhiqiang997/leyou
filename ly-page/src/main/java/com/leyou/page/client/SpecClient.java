package com.leyou.page.client;

import com.leyou.item.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhuzhiqiang997
 * @date 2018/9/22
 */
@FeignClient("item-service")
public interface SpecClient extends SpecApi {
}

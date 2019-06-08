package com.leyou.service.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author zhuzhiqiang997
 * @date 2018/9/15
 */
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category, Long> {
}

package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhuzhiqiang997
 * @date 2018/9/22
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}

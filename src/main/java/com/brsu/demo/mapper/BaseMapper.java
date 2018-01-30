package com.brsu.demo.mapper;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 */
public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>, IdsMapper<T>, InsertListMapper<T> {

}

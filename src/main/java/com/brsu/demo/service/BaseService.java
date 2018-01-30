package com.brsu.demo.service;

import com.brsu.demo.dto.BaseResponse;
import com.brsu.demo.dto.PageView;

import java.util.List;

/**
 * BaseService 层 基础接口，其他Service 接口 请继承该接口
 */
public interface BaseService<T> {

    BaseResponse save(T entity);//持久化

    BaseResponse save(List<T> entity);//批量持久化

    BaseResponse deleteById(Integer id);//通过主鍵刪除

    BaseResponse deleteByIds(String ids);//批量刪除 eg：ids -> “1,2,3,4”

    BaseResponse delete(List<T> entity);//批量删除

    BaseResponse update(T entity);//更新

    BaseResponse update(List<T> entity);//批量更新

    T queryById(Integer id);//通过ID查找

    T queryOneByCondition(T entity);

    List<T> queryByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”

    List<T> queryByCondition(T entity);//根据条件查找

    List<T> queryAll();//获取所有

    PageView<T> queryPageByCondition(PageView<T> pageView);//分页根据条件查找

}

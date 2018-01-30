package com.brsu.demo.service.Impl;

import java.util.List;

import com.brsu.demo.dto.PageView;
import com.brsu.demo.mapper.BaseMapper;
import com.brsu.demo.dto.BaseResponse;
import com.brsu.demo.service.BaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected BaseMapper<T> mapper;

    public BaseResponse save(T entity) {
        mapper.insertSelective(entity);
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("保存成功");
        return resp;
    }

    public BaseResponse save(List<T> entity) {
        mapper.insertList(entity);
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("批量保存成功");
        return resp;
    }

    public BaseResponse deleteById(Integer id) {
        mapper.deleteByPrimaryKey(id);
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("删除成功");
        return resp;
    }

    public BaseResponse deleteByIds(String ids) {
        mapper.deleteByIds(ids);
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("批量删除成功");
        return resp;
    }

    @Override
    public BaseResponse delete(List<T> entity) {
        for(T t : entity){
            mapper.delete(t);
        }
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("批量删除成功");
        return resp;
    }

    public BaseResponse update(T entity) {
        mapper.updateByPrimaryKeySelective(entity);
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("修改成功");
        return resp;
    }

    @Override
    public BaseResponse update(List<T> entity) {
        for(T t : entity){
            mapper.updateByPrimaryKeySelective(t);
        }
        BaseResponse resp = new BaseResponse();
        resp.setRespCode("00");
        resp.setRespMessage("批量修改成功");
        return resp;
    }

    public T queryById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public T queryOneByCondition(T entity) {
        return mapper.selectOne(entity);
    }

    public List<T> queryByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    public List<T> queryByCondition(T entity) {
        return mapper.select(entity);
    }

    public List<T> queryAll() {
        return mapper.selectAll();
    }

    public PageView<T> queryPageByCondition(PageView<T> pageView) {
        PageHelper.startPage(pageView.getPageNum(), pageView.getPageSize());
        List<T> list = mapper.select(pageView.getEntity());
        long total = ((Page) list).getTotal();
        pageView.setPageRows(list);
        pageView.setPageTotal(total);
        pageView.setRespCode(200);
        pageView.setRespMessage("分页查询成功");
        return pageView;
    }
}

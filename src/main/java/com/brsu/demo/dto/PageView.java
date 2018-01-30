package com.brsu.demo.dto;

import java.util.List;

/**
 * Created by brsu on 2018/1/29.
 */
public class PageView<T> {

    //request
    private Integer pageSize;
    private Integer pageNum;
    private T entity;
    //response
    private Integer respCode;
    private String respMessage;
    private Long pageTotal;
    private List<T> pageRows;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public Integer getRespCode() {
        return respCode;
    }

    public void setRespCode(Integer respCode) {
        this.respCode = respCode;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }

    public Long getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Long pageTotal) {
        this.pageTotal = pageTotal;
    }

    public List<T> getPageRows() {
        return pageRows;
    }

    public void setPageRows(List<T> pageRows) {
        this.pageRows = pageRows;
    }
}

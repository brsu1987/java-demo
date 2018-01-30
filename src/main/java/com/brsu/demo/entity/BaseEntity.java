package com.brsu.demo.entity;

import javax.persistence.*;

/**
 * Created by brsu on 2017/7/18.
 */
public class BaseEntity {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

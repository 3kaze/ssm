package com.wzw.repository;

import com.wzw.entity.People;

import java.util.List;

/**
 * @author wei
 * @Date 2021/7/30
 */
public interface PeopleRepository {
    public List<People> findAll();
}

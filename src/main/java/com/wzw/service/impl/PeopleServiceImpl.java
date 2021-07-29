package com.wzw.service.impl;

import com.wzw.entity.People;
import com.wzw.repository.PeopleRepository;
import com.wzw.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wei
 * @Date 2021/7/30
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public List<People> findAll() {
        return peopleRepository.findAll();
    }
}

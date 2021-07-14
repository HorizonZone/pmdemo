package com.horizon.pmdemo.service;

import com.horizon.pmdemo.mapper.PMMapper;
import com.horizon.pmdemo.model.PM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PMService {
    @Autowired
    PMMapper pmMapper;
    public Integer addPMs(List<PM> list) {
        return pmMapper.addPMs(list);
    }
}

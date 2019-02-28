package com.hai.service.impl;

import com.hai.mapper.DeptMapper;
import com.hai.pojo.Dept;
import com.hai.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl implements QueryService {

    @Autowired
    private DeptMapper deptMapper;
    
    @Override
    public List<Dept> qeuryAllDept() {
        return deptMapper.selectAll();
    }
}

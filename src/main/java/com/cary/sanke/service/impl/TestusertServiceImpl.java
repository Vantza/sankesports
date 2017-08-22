package com.cary.sanke.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cary.sanke.dao.TestusertDao;
import com.cary.sanke.pojo.Testusert;
import com.cary.sanke.service.TestusertService;

@Service("Testusert")
public class TestusertServiceImpl implements TestusertService{
	@Resource
	private TestusertDao userDao;  
	
    public Testusert getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }
}

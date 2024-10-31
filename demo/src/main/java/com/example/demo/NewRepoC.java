package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NewRepoC {
	
	    @Autowired
	    private JdbcTemplate jb;
	    
	    public List<Map<String, Object>> getAlltable()
	    {
	    	List<Map<String, Object>> newList=jb.queryForList("select * from corana");
	    	return newList;
	    }

}

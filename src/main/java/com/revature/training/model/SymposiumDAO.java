package com.revature.training.model;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.training.util.SympoappUtil;

public class SymposiumDAO {
	public void save(Symposium  symp){
		JdbcTemplate jdbctemplate = SympoappUtil.getJdbcTemplate();

		String sql="insert into student(name,classpost) values (?,?)";

		Object[] params = {symp.getName(),symp.getClasspost()};
		int rows=jdbctemplate.update(sql,params);
		System.out.println(rows);
}
}

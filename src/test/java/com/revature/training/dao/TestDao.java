package com.revature.training.dao;

import com.revature.training.model.Symposium;
import com.revature.training.model.SymposiumDAO;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stubEmployee employee = new Employee();
	Symposium symp = new Symposium();
		symp.setId(1);
		symp.setName("ANGEL");
	//
		symp.setClasspost("classrep");
	
		SymposiumDAO sympdao=new SymposiumDAO();
		sympdao.save(symp);

	}

}

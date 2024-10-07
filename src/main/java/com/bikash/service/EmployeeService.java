package com.bikash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikash.dao.IEmployeeDao;
import com.bikash.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDao dao;
	@Override
	public String registerEmployee(Employee emp) throws Exception {
		//Calling Dao class method
		String msg=dao.insertEmployee(emp);
		return msg;
	}

}

package com.example.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springmvc.model.Unit;
import com.example.springmvc.repository.UnitRepository;

/*
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private UnitRepository employeeDAO;
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") UnitRepository theEmployeeDAO) {
		employeeDAO = theEmployeeDAO;
	}
	
	@Override
	@Transactional
	public List<Unit> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Unit findById(int theId) {
		return null;
		//return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Unit theEmployee) {
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		//employeeDAO.deleteById(theId);
	}

}*/
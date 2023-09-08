package com.xyz.service;

import com.xyz.beans.Employee;
import com.xyz.dao.EmployeeAlreadyExistsException;

public interface EmployeeService {
	public void createEmployee(Employee employee) throws EmployeeAlreadyExistsException;

	public void registerEmployeeForTraining(int employeeIdToRegister, int trainingIdToRegister);
}

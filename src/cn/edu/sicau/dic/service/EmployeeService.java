package cn.edu.sicau.dic.service;

import java.util.List;

import cn.edu.sicau.dic.bean.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public void update(Employee employee);
	public Employee find(String username);
	public void delete(String... usernames);
	public List<Employee> list();
}

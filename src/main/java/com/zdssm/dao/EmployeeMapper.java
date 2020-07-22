package com.zdssm.dao;

import com.zdssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    int addEmployee(Employee employee);
    int deleteEmployee(int id);
    int updateEmployee(Employee employee);
    Employee queryEmployee(int id);
    List<Employee>queryAllEmployee();
}

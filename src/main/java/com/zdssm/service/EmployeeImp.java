package com.zdssm.service;

import com.zdssm.dao.EmployeeMapper;
import com.zdssm.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zd
 * @Date 2020/7/22 10:21
 **/
@Service
public class EmployeeImp implements EmployeeService {


    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeImp(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    public int deleteEmployee(int id) {
        return employeeMapper.deleteEmployee(id);
    }

    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    public Employee queryEmployee(int id) {
        return employeeMapper.queryEmployee(id);
    }

    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }
}

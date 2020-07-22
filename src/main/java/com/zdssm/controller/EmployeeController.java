package com.zdssm.controller;

import com.zdssm.common.responses.BaseResponseStatus;
import com.zdssm.common.responses.HttpResponses;
import com.zdssm.common.responses.BaseResponse;
import com.zdssm.pojo.Employee;
import com.zdssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author zd
 * @Date 2020/7/22 14:53
 **/

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/add")
    public BaseResponse addEmployee(@RequestParam("name") String name,
                                     @RequestParam("age") int age,
                                    @RequestParam("sex") String sex,
                                    @RequestParam("adress") String adress){

        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setSex(sex);
        employee.setAddress(adress);
        employeeService.addEmployee(employee);

        return HttpResponses.baseResponse(BaseResponseStatus.SUCCESS_CREATE.status,employee);
    }


    @GetMapping("/del/{id}")
    public BaseResponse delById(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
        return HttpResponses.baseResponse(BaseResponseStatus.SUCCESS_DEL.status);
    }


    @PostMapping("/update/{id}")
    public BaseResponse updateEmployee(@RequestParam("name") String name,
                                       @RequestParam("age") int age,
                                       @RequestParam("sex") String sex,
                                       @RequestParam("adress") String adress){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setAge(age);
        employee.setSex(sex);
        employee.setAddress(adress);
        employeeService.updateEmployee(employee);
        return HttpResponses.baseResponse(BaseResponseStatus.SUCCESS_CREATE.status);
    }

    @GetMapping("/allEmployee")
    public BaseResponse list(){
        List<Employee> list = employeeService.queryAllEmployee();
        return HttpResponses.baseResponse(BaseResponseStatus.SUCCESS_SELECT.status,list);
    }



}

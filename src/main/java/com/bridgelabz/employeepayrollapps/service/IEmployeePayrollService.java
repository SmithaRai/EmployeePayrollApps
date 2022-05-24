package com.bridgelabz.employeepayrollapps.service;

import com.bridgelabz.employeepayrollapps.DTO.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapps.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();
    EmployeePayrollData getEmployeePayrollDataById(int empId);
    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId ,EmployeePayrollDTO empPayrollDTO);
    void deleteEmployeePayrollData(int empId);

}

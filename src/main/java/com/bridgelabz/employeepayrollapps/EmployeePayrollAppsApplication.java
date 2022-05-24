package com.bridgelabz.employeepayrollapps;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class EmployeePayrollAppsApplication {

    public static void main(String[] args) {
         SpringApplication.run(EmployeePayrollAppsApplication.class, args);


    }
}

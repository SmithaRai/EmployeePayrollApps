package com.bridgelabz.employeepayrollapps;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Slf4j
public class EmployeePayrollAppsApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppsApplication.class, args);

        log.info("Employee Payroll App Started in {} Environment", context.getEnvironment().getProperty("environment"));

    }
}

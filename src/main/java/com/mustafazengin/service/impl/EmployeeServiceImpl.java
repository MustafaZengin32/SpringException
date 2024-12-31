package com.mustafazengin.service.impl;

import com.mustafazengin.dto.DtoDepartment;
import com.mustafazengin.dto.DtoEmployee;
import com.mustafazengin.exception.BaseException;
import com.mustafazengin.exception.ErrorMessage;
import com.mustafazengin.exception.MessageType;
import com.mustafazengin.model.Department;
import com.mustafazengin.model.Employee;
import com.mustafazengin.repository.EmployeeRepository;
import com.mustafazengin.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id) {
        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);

        if(optional.isEmpty()) {

            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }

        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }

}

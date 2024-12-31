package com.mustafazengin.service;

import com.mustafazengin.dto.DtoEmployee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(Long id);
}

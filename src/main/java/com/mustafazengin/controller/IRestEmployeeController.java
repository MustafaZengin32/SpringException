package com.mustafazengin.controller;

import com.mustafazengin.dto.DtoEmployee;

public interface IRestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}

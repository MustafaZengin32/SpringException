package com.mustafazengin.dto;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {

    private Long id;

    private String name;

    private DtoDepartment department;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(DtoDepartment department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DtoDepartment getDepartment() {
        return department;
    }
}

package com.mustafazengin.dto;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
public class DtoDepartment {

    private Long id;

    private String name;

    private String location;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

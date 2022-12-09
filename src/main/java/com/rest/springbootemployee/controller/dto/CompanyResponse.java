package com.rest.springbootemployee.controller.dto;

import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

public class CompanyResponse {
    @MongoId(FieldType.OBJECT_ID)
    private String id;
    private String name;
    private Integer employeesCount;

    public CompanyResponse(String id, String name, Integer employeesCount) {
        this.id = id;
        this.name = name;
        this.employeesCount = employeesCount;
    }

    public CompanyResponse() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(Integer employeesCount) {
        this.employeesCount = employeesCount;
    }
}
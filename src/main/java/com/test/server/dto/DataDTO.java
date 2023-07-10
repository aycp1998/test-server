package com.test.server.dto;

public class DataDTO {

    private Long id;
    private String name;
    private Integer age;
    private String country;

    public DataDTO() {
    }

    public DataDTO(String name, Integer age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public DataDTO(Long id, String name, Integer age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

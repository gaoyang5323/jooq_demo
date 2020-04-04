/*
 * This file is generated by jOOQ.
 */
package com.example.dao.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Student implements Serializable {

    private static final long serialVersionUID = -1592141079;

    private Integer id;
    private String  name;
    private Long    score;
    private String  class_;
    private Integer age;

    public Student() {}

    public Student(Student value) {
        this.id = value.id;
        this.name = value.name;
        this.score = value.score;
        this.class_ = value.class_;
        this.age = value.age;
    }

    public Student(
        Integer id,
        String  name,
        Long    score,
        String  class_,
        Integer age
    ) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.class_ = class_;
        this.age = age;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScore() {
        return this.score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getClass_() {
        return this.class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(score);
        sb.append(", ").append(class_);
        sb.append(", ").append(age);

        sb.append(")");
        return sb.toString();
    }
}
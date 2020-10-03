package com.iitu.kz.builderFactoryPattern;


public class StudentBuilder implements UserBuilder{
    private Student student = new Student();

    @Override
    public UserBuilder setId(int id) {
        this.student.setId(id);
        return this;
    }

    @Override
    public UserBuilder setUsername(String username) {
        this.student.setUsername(username);
        return this;
    }

    @Override
    public UserBuilder setMembership(Boolean membership) {
        this.student.setMembership(membership);
        return this;
    }

    @Override
    public UserBuilder setAge(int age) {
        this.student.setAge(age);
        return this;
    }

    @Override
    public User build() {
        return student;
    }

}

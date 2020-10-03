package com.iitu.kz.builderFactoryPattern;

public interface UserBuilder {
    UserBuilder setId(int id);
    UserBuilder setUsername(String username);
    UserBuilder setMembership(Boolean membership);
    UserBuilder setAge(int age);
    User build();
}

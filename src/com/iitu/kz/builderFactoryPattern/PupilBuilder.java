package com.iitu.kz.builderFactoryPattern;


public class PupilBuilder implements UserBuilder{

    private Pupil pupil = new Pupil();

    @Override
    public UserBuilder setId(int id) {
        this.pupil.setId(id);
        return this;
    }

    @Override
    public UserBuilder setUsername(String username) {
        this.pupil.setUsername(username);
        return this;
    }

    @Override
    public UserBuilder setMembership(Boolean membership) {
        this.pupil.setMembership(membership);
        return this;
    }

    @Override
    public UserBuilder setAge(int age) {
        this.pupil.setAge(age);
        return this;
    }

    @Override
    public User build() {
        return pupil;
    }

    @Override
    public String toString() {
        return "PupilBuilder{" +
                "pupil=" + pupil +
                '}';
    }
}

package com.alaershov.toothpickintro;

public interface UserRepository {

    User getUser();

    void saveUser(User user);
}

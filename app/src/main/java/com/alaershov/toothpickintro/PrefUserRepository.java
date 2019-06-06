package com.alaershov.toothpickintro;


import android.content.SharedPreferences;

import javax.inject.Inject;

public final class PrefUserRepository implements UserRepository {

    private static final String KEY_NAME = "KEY_NAME";
    private static final String KEY_EMAIL = "KEY_EMAIL";

    private final SharedPreferences sharedPreferences;

    @Inject
    public PrefUserRepository(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    @Override
    public User getUser() {
        return new User(
                sharedPreferences.getString(KEY_NAME, ""),
                sharedPreferences.getString(KEY_EMAIL, "")
        );
    }

    @Override
    public void saveUser(User user) {
        sharedPreferences.edit()
                .putString(KEY_NAME, user.getName())
                .putString(KEY_EMAIL, user.getEmail())
                .apply();
    }
}

package com.alaershov.toothpickintro;

import android.os.Bundle;

import com.alaershov.toothpickintro.di.Scopes;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import toothpick.Scope;
import toothpick.Toothpick;

public final class UserActivity extends AppCompatActivity {

    @Inject
    UserRepository userRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Scope appScope = Toothpick.openScope(Scopes.APP);
        Toothpick.inject(this, appScope);

        if (savedInstanceState == null) {
            loadUser();
        }
    }

    private void loadUser() {
        showUser(userRepository.getUser());
    }

    private void showUser(User user) {

    }

    private void saveUser(User user) {

    }
}

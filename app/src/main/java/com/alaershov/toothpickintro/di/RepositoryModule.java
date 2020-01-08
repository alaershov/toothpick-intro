package com.alaershov.toothpickintro.di;

import android.content.Context;
import android.content.SharedPreferences;

import com.alaershov.toothpickintro.PrefUserRepository;
import com.alaershov.toothpickintro.UserRepository;

import toothpick.config.Module;

import static android.content.Context.MODE_PRIVATE;

public final class RepositoryModule extends Module {

    public RepositoryModule(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("app.prefs", MODE_PRIVATE);
        bind(SharedPreferences.class).toInstance(sharedPreferences);

        bind(UserRepository.class)
                .to(PrefUserRepository.class)
                .singleton();
    }
}

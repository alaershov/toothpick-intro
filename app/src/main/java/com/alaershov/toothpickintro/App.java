package com.alaershov.toothpickintro;

import android.app.Application;

import com.alaershov.toothpickintro.di.RepositoryModule;
import com.alaershov.toothpickintro.di.Scopes;

import toothpick.Scope;
import toothpick.Toothpick;


public final class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Scope appScope = Toothpick.openScope(Scopes.APP);
        appScope.installModules(new RepositoryModule(getApplicationContext()));
    }
}

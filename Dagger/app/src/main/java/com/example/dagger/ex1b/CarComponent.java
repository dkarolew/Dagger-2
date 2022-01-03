package com.example.dagger.ex1b;

import dagger.Component;

@Component
public interface CarComponent {

    void inject(MainActivity mainActivity);
}

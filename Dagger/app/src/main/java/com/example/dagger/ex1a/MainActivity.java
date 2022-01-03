package com.example.dagger.ex1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger.R;

// Exercise 1a - Constructor injection

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();

//        Wheels wheels = new Wheels();
//        Engine engine = new Engine();
//        Car car = new Car(engine, wheels);

        car = component.getCar();
        car.drive();
    }
}
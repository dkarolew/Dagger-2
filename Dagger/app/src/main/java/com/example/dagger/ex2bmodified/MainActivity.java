package com.example.dagger.ex2bmodified;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger.R;

import javax.inject.Inject;

// Exercise 2b - Inject interface + passing argument in runtime + solution

public class MainActivity extends AppCompatActivity {
    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car.drive();
    }
}
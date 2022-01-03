package com.example.dagger.ex3a;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }
}

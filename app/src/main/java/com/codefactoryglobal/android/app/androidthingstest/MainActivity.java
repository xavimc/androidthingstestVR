package com.codefactoryglobal.android.app.androidthingstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		// Diapositivas https://docs.google.com/presentation/d/10QCu_vK11EsbIl7Hy4YPxslJP1Z4YnRAUxlL-s0A7o4/edit#slide=id.g1d5f510fb4_0_117
		//https://developer.android.com/things/sdk/index.html
		
        final Button btnRed = new Button("IO2", Button.LogicState.PRESSED_WHEN_LOW);
        btnRed.setOnButtonEventListener((button, pressed) -> Timber.d("button[%s]: %s", button, pressed));  // Timber log android


        private final PeripheralManagerService svc = new PeripheralManagerService();
        svc.getGpioList()
    }
}

package com.example.animacionestransiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titulo= findViewById(R.id.Titulo);
        Animation miprimeraAnimacion= AnimationUtils.loadAnimation
                (getApplicationContext(),R.anim.fade_out);
        View myView= findViewById(R.id.Titulo);
        myView.startAnimation(miprimeraAnimacion);
    }
}
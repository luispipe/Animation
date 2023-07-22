package com.example.animacionestransiciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    int splashTimeOut= 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Carga la imagen que colocamos en el layout
        ImageView arbol= findViewById(R.id.imageViewArbol);
        //Genera un animación que cominza a mostrar un elemento de 0 a 100
        Animation fadeIn= new AlphaAnimation(0,1);
        // Asignamos el tiempo a la animación
        fadeIn.setDuration(2000);
        // Le agregamos la animación a la imagen
        arbol.startAnimation(fadeIn);

        /*Una función una tarea que va a aplicar la animación y despues
          me cambiara de interfaz es decir pasamo del layout de Splash
          al layout del MAIN
        */
        arbol.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Decir de donde hacia donde ire
                Intent main= new Intent(SplashActivity.this, MainActivity.class);
                // Se activa el cambio de interfaz
                startActivity(main);
                // Se concluye la acción
                finish();
            }
        },splashTimeOut);

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        //limpiar mi app para evitar perdidas de memoria
        ImageView arbol=findViewById(R.id.imageViewArbol);
        arbol.removeCallbacks(null);
    }


}
package com.example.primenko_david_introduccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class JuegoMemoria_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_memoria);

        ImageButton img0, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, img17, img18, img19, img20;

        img0 = (ImageButton) findViewById(R.id.img0);
        img1 = (ImageButton) findViewById(R.id.img1);
        img2 = (ImageButton) findViewById(R.id.img2);
        img3 = (ImageButton) findViewById(R.id.img3);
        img4 = (ImageButton) findViewById(R.id.img4);
        img5 = (ImageButton) findViewById(R.id.img5);
        img6 = (ImageButton) findViewById(R.id.img6);
        img7 = (ImageButton) findViewById(R.id.img7);
        img8 = (ImageButton) findViewById(R.id.img8);
        img9 = (ImageButton) findViewById(R.id.img9);
        img10 = (ImageButton) findViewById(R.id.img10);
        img11 = (ImageButton) findViewById(R.id.img11);
        img12 = (ImageButton) findViewById(R.id.img12);
        img13 = (ImageButton) findViewById(R.id.img13);
        img14 = (ImageButton) findViewById(R.id.img14);
        img15 = (ImageButton) findViewById(R.id.img15);
        img16 = (ImageButton) findViewById(R.id.img16);
        img17 = (ImageButton) findViewById(R.id.img17);
        img18 = (ImageButton) findViewById(R.id.img18);
        img19 = (ImageButton) findViewById(R.id.img19);
    }

    public void darVuelta (View v) {
        ImageButton btn = (ImageButton) v;

        btn.setImageResource(R.drawable.centos);
    }
}

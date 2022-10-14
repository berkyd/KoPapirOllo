package com.example.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView sajatValasztas;
    private TextView aTeValasztasod;
    private ImageView gepValasztas;
    private TextView aGepValasztasa;
    private TextView eredmeny;
    private TextView ember;
    private TextView computer;
    private Button ko;
    private Button papir;
    private Button ollo;
    private int tipp;
    private Random rnd;
    private int youwon;
    private int computerwon;
    private int yourscore;
    private int computerscore;
    private int draw;
    private AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sajatValasztas.setImageResource(R.drawable.rock);
                tipp = rnd.nextInt(3) + 1;
                youwon = 0;
                computerwon = 0;
                if(yourscore==3|computerscore==3){

                }
                switch (tipp) {
                    case 1:
                        gepValasztas.setImageResource(R.drawable.rock);
                        draw++;
                        break;
                    case 2:
                        gepValasztas.setImageResource(R.drawable.paper);
                        computerscore++;
                        break;
                    case 3:
                        gepValasztas.setImageResource(R.drawable.scissors);
                        yourscore++;
                        break;
                }
                if (youwon == 1) {
                    Toast.makeText(MainActivity.this,
                            "Nyertél!", Toast.LENGTH_SHORT).show();
                    youwon++;
                    ad.setTitle("Győzelem");
                    ad.create().show();
                } else if (computerwon == 1) {
                    Toast.makeText(MainActivity.this,
                            "Vesztettél", Toast.LENGTH_SHORT).show();
                    computerwon++;
                    ad.setTitle("Vereség");
                    ad.create().show();
                }
            }
        });
        papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sajatValasztas.setImageResource(R.drawable.paper);
                tipp = rnd.nextInt(3) + 1;
                switch (tipp) {
                    case 1:
                        gepValasztas.setImageResource(R.drawable.rock);
                        yourscore++;
                        break;
                    case 2:
                        gepValasztas.setImageResource(R.drawable.paper);
                        draw++;
                        break;
                    case 3:
                        gepValasztas.setImageResource(R.drawable.scissors);
                        computerscore++;
                        break;
                }
                if (youwon == 1) {
                    Toast.makeText(MainActivity.this,
                            "Nyertél!", Toast.LENGTH_SHORT).show();
                    youwon++;
                    ad.setTitle("Győzelem");
                    ad.create().show();
                } else if (computerwon == 1) {
                    Toast.makeText(MainActivity.this,
                            "Vesztettél", Toast.LENGTH_SHORT).show();
                    computerwon++;
                    ad.setTitle("Vereség");
                    ad.create().show();
                }
            }
        });
        ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sajatValasztas.setImageResource(R.drawable.scissors);
                tipp = rnd.nextInt(3) + 1;
                switch (tipp) {
                    case 1:
                        gepValasztas.setImageResource(R.drawable.rock);
                        computerscore++;
                        break;
                    case 2:
                        gepValasztas.setImageResource(R.drawable.paper);
                        yourscore++;
                        break;
                    case 3:
                        gepValasztas.setImageResource(R.drawable.scissors);
                        draw++;
                        break;
                }
                if (youwon == 1) {
                    Toast.makeText(MainActivity.this,
                            "Nyertél!", Toast.LENGTH_SHORT).show();
                    youwon++;
                    ad.setTitle("Győzelem");
                    ad.create().show();
                } else if (computerwon == 1) {
                    Toast.makeText(MainActivity.this,
                            "Vesztettél", Toast.LENGTH_SHORT).show();
                    computerwon++;
                    ad.setTitle("Vereség");
                    ad.create().show();
                }
            }
        });

    }
        private void init(){
            sajatValasztas.findViewById(R.id.sajatValasztas);
            aTeValasztasod.findViewById((R.id.aTeValasztasod));
            gepValasztas.findViewById(R.id.gepValasztas);
            aGepValasztasa.findViewById(R.id.aGepValasztasa);
            eredmeny.findViewById((R.id.eredmeny));
            ember.findViewById(R.id.ember);
            computer.findViewById(R.id.computer);
            ko.findViewById(R.id.ko);
            papir.findViewById(R.id.papir);
            ollo.findViewById(R.id.ollo);
            rnd = new Random();
            ad = new AlertDialog.Builder(MainActivity.this);
            ad.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            ad.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    
                }
            });
            ad.create();
        }
}
package cat.dam.jaume.majormenorigual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import  java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView resu,cont;
    ImageButton igual,major,menor;


    LinearLayout ll_dalt,ll_baix;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Random r = new Random();
        int numA = r.nextInt(10) + 1;
        LinearLayout ll_dalt = (LinearLayout) findViewById(R.id.ll_dalt);
        for (int i = 0; i < numA; i++) {
            ImageView n = new ImageView(MainActivity.this);
            n.setImageResource(R.drawable.mono);
            n.setAdjustViewBounds(true);
            int alt = 100, ample = 100;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ample, alt);
            n.setLayoutParams(params);
            ll_dalt.addView(n);
        }

            int numB = r.nextInt(10) + 1;
            LinearLayout ll_baix = (LinearLayout) findViewById(R.id.ll_baix);
            for (int i = 0; i < numB; i++) {
                ImageView n = new ImageView(MainActivity.this);
                n.setImageResource(R.drawable.lleo);
                n.setAdjustViewBounds(true);
                int alt = 100, ample = 100;
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ample, alt);
                n.setLayoutParams(params);
                ll_baix.addView(n);

            }
        resu =(TextView) findViewById(R.id.resu);
        igual = (ImageButton) findViewById(R.id.igual);
        major = (ImageButton) findViewById(R.id.major);
        menor = (ImageButton) findViewById(R.id.menor);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numA == numB){

                    resu.setText("Correcte!");
                }else {resu.setText("Incorrecte");}
            }
        });

        major.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(numA > numB){
                    resu.setText("Correcte!");
                }else {resu.setText("Incorrecte");}
            }
        });

        menor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numA < numB){
                    resu.setText("Correcte!");
                } else {resu.setText("Incorrecte");}
            }
        });
    }

    }









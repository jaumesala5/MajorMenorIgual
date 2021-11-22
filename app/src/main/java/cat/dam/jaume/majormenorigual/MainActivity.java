package cat.dam.jaume.majormenorigual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import  java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        int numA = r.nextInt(10)+1;

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.monos);
        for (int i = 0; i <numA; i++) {
            ImageView n = new ImageView(MainActivity.this);
            n.setImageResource(R.drawable.mono);
            n.setAdjustViewBounds(true);
            int alt = 100, ample=100;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ample, alt);
            n.setLayoutParams(params);
            linearLayout.addView(n);
        }
    }
}
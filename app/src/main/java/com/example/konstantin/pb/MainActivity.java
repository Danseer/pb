package com.example.konstantin.pb;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pb;
    private ConstraintLayout cl;
    private LinearLayout n;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Display display = ((WindowManager) getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
        Toast.makeText(this, width + "," + height, Toast.LENGTH_LONG).show();

int vote=9654;


        cl = findViewById(R.id.cl);
        n = findViewById(R.id.n);



tv=findViewById(R.id.textView);

double max;

if (vote<10) max=10;
else max=(int)vote+vote*0.2;
        tv.setWidth((int) (width*vote/max));
        tv.setText(String.valueOf(vote));



    }


}

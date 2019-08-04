package com.example.qi.paediatricstroketriagetool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculatorNIHSS extends AppCompatActivity {

    private TextView ViewNIHSS;
    int NIHSSscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_nihss);

        ViewNIHSS = (TextView)findViewById(R.id.editText);

        Intent intent1 = getIntent();

        int LOC = intent1.getIntExtra("LOC",0);
        int dysarthria = intent1.getIntExtra("dysarthria",0);
        int extinction = intent1.getIntExtra("extinction",0);
        int language = intent1.getIntExtra("language",0);
        int bestgaze = intent1.getIntExtra("bestgaze",0);
        int consciousness = intent1.getIntExtra("consciousness",0);
        int facialpalsy = intent1.getIntExtra("facialpalsy",0);
        int leftarm = intent1.getIntExtra("leftarm",0);
        int leftleg = intent1.getIntExtra("leftleg",0);
        int limbataxia = intent1.getIntExtra("limbataxia",0);
        int LOCcommands = intent1.getIntExtra("LOCcommands",0);
        int rightleg = intent1.getIntExtra("LOCcommands",0);
        int rightarm = intent1.getIntExtra("rightarm",0);
        int sensory = intent1.getIntExtra("sensory",0);
        int visual = intent1.getIntExtra("visual",0);

        NIHSSscore = LOC+dysarthria+extinction+language+bestgaze+consciousness+facialpalsy+leftarm+leftleg+limbataxia+LOCcommands+rightleg+rightarm+sensory+visual;

        ViewNIHSS.setText("The PeDNIHSS score is " + NIHSSscore);

    }
}

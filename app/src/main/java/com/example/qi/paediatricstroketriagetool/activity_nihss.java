package com.example.qi.paediatricstroketriagetool;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class activity_nihss extends AppCompatActivity {
    private Button btnNIHSS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nihss);

        btnNIHSS = (Button) findViewById(R.id.button_calPEDNIHSS);

        View.OnClickListener listener2 = null;
        listener2 = new View.OnClickListener() {
            public void onClick(View v) {

                SharedPreferences NIHSSPreferences = getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = NIHSSPreferences.edit();

                RadioGroup consciousnessgroup = (RadioGroup) findViewById(R.id.consciousnessgroup);
                int checkRadioButtonID_consciousness = consciousnessgroup.getCheckedRadioButtonId();
                int consciousnesstrans = 0;
                switch (checkRadioButtonID_consciousness) {
                    case R.id.consciousness0:
                        consciousnesstrans = 0;
                        break;
                    case R.id.cousciousness1:
                        consciousnesstrans = 1;
                        break;
                    case R.id.cousciousness2:
                        consciousnesstrans = 2;
                        break;
                    case R.id.cousciousness3:
                        consciousnesstrans = 3;
                        break;
                }

                RadioGroup LOCgroup = (RadioGroup) findViewById(R.id.locquestiongroup);
                int checkRadioButtionID_LOC = LOCgroup.getCheckedRadioButtonId();
                int LOCtrans = 0;
                switch (checkRadioButtionID_LOC) {
                    case R.id.locquestion0:
                        LOCtrans = 0;
                        break;
                    case R.id.locquestion1:
                        LOCtrans = 1;
                        break;
                    case R.id.locquestion2:
                        LOCtrans = 2;
                        break;
                }

                RadioGroup LOCcommandsgroup = (RadioGroup) findViewById(R.id.loccommandgroup);
                int checkRadioButtonID_LOCcommands = LOCcommandsgroup.getCheckedRadioButtonId();
                int LOCcommandstrans = 0;
                switch (checkRadioButtonID_LOCcommands) {
                    case R.id.loccommand0:
                        LOCcommandstrans = 0;
                        break;
                    case R.id.loccommand1:
                        LOCcommandstrans = 1;
                        break;
                    case R.id.loccommand2:
                        LOCcommandstrans = 2;
                        break;
                }

                RadioGroup Bestgazegroup = (RadioGroup) findViewById(R.id.bestgazegroup);
                int checkRadioButtonID_Bestgaze = Bestgazegroup.getCheckedRadioButtonId();
                int Bestgazetrans = 0;
                switch (checkRadioButtonID_Bestgaze) {
                    case R.id.bestgaze0:
                        Bestgazetrans = 0;
                        break;
                    case R.id.bestgaze1:
                        Bestgazetrans = 1;
                        break;
                    case R.id.bestgaze2:
                        Bestgazetrans = 2;
                        break;
                }

                RadioGroup visualgroup = (RadioGroup) findViewById(R.id.visualgroup);
                int checkRadioBUttonID_visualgroup = visualgroup.getCheckedRadioButtonId();
                int visualtrans = 0;
                switch (checkRadioBUttonID_visualgroup) {
                    case R.id.visual0:
                        visualtrans = 0;
                        break;
                    case R.id.visual1:
                        visualtrans = 1;
                        break;
                    case R.id.visual2:
                        visualtrans = 2;
                        break;
                    case R.id.visual3:
                        visualtrans = 3;
                        break;
                }

                RadioGroup facialpalsygroup = (RadioGroup) findViewById(R.id.facialpalsy);
                int checkRadioButtonID_facialpalsy = facialpalsygroup.getCheckedRadioButtonId();
                int facialpalsytrans = 0;
                switch (checkRadioButtonID_facialpalsy) {
                    case R.id.facialpalsy0:
                        facialpalsytrans = 0;
                        break;
                    case R.id.facialpalsy1:
                        facialpalsytrans = 1;
                        break;
                    case R.id.facialpalsy2:
                        facialpalsytrans = 2;
                        break;
                    case R.id.facialpalsy3:
                        facialpalsytrans = 3;
                        break;
                }

                RadioGroup leftarmgroup = (RadioGroup) findViewById(R.id.leftarm);
                int checkRadioButtonID_leftarm = leftarmgroup.getCheckedRadioButtonId();
                int leftarmtrans = 0;
                switch (checkRadioButtonID_leftarm) {
                    case R.id.leftarm0:
                        leftarmtrans = 0;
                        break;
                    case R.id.leftarm1:
                        leftarmtrans = 1;
                        break;
                    case R.id.leftarm2:
                        leftarmtrans = 2;
                        break;
                    case R.id.leftarm3:
                        leftarmtrans = 3;
                        break;
                    case R.id.leftarm4:
                        leftarmtrans = 4;
                        break;
                    case R.id.leftarm5:
                        leftarmtrans = 0;
                        break;
                }

                RadioGroup rightarmgroup = (RadioGroup) findViewById(R.id.rightarm);
                int checkRadioButtonID_rightarm = rightarmgroup.getCheckedRadioButtonId();
                int rightarmtrans = 0;
                switch (checkRadioButtonID_rightarm) {
                    case R.id.rightarm0:
                        rightarmtrans = 0;
                        break;
                    case R.id.rightarm1:
                        rightarmtrans = 1;
                        break;
                    case R.id.rightarm2:
                        rightarmtrans = 2;
                        break;
                    case R.id.rightarm3:
                        rightarmtrans = 3;
                        break;
                    case R.id.rightarm4:
                        rightarmtrans = 4;
                        break;
                    case R.id.rightarm5:
                        rightarmtrans = 0;
                        break;
                }

                RadioGroup leftleggroup = (RadioGroup) findViewById(R.id.leftleg);
                int checkRadioButtonID_leftleg = leftleggroup.getCheckedRadioButtonId();
                int leftlegtrans = 0;
                switch (checkRadioButtonID_leftarm) {
                    case R.id.leftleg0:
                        leftlegtrans = 0;
                        break;
                    case R.id.leftleg1:
                        leftlegtrans = 1;
                        break;
                    case R.id.leftleg2:
                        leftlegtrans = 2;
                        break;
                    case R.id.leftleg3:
                        leftlegtrans = 3;
                        break;
                    case R.id.leftleg4:
                        leftlegtrans = 4;
                        break;
                    case R.id.leftleg5:
                        leftlegtrans = 0;
                        break;
                }

                RadioGroup rightleggroup = (RadioGroup) findViewById(R.id.rightleg);
                int checkRadioButtonID_rightleg = rightleggroup.getCheckedRadioButtonId();
                int rightlegtrans= 0;
                switch (checkRadioButtonID_rightleg) {
                    case R.id.rightleg0:
                        rightlegtrans = 0;
                        break;
                    case R.id.rightleg1:
                        rightlegtrans = 1;
                        break;
                    case R.id.rightleg2:
                        rightlegtrans = 2;
                        break;
                    case R.id.rightleg3:
                        rightlegtrans = 3;
                        break;
                    case R.id.rightleg4:
                        rightlegtrans = 4;
                        break;
                    case R.id.rightleg5:
                        rightlegtrans = 0;
                        break;
                }

                RadioGroup limbataxiagroup = (RadioGroup) findViewById(R.id.limbataxia);
                int checkRadioButtonID_limbataxia = limbataxiagroup.getCheckedRadioButtonId();
                int limbataxiatrans = 0;
                switch (checkRadioButtonID_limbataxia) {
                    case R.id.limbataxia0:
                        limbataxiatrans = 0;
                        break;
                    case R.id.limbataxia1:
                        limbataxiatrans = 1;
                        break;
                    case R.id.limbataxia2:
                        limbataxiatrans = 2;
                        break;
                }

                RadioGroup sensorygroup = (RadioGroup) findViewById(R.id.sensory);
                int checkRadioButtonID_sensory = sensorygroup.getCheckedRadioButtonId();
                int sensorytrans = 0;
                switch (checkRadioButtonID_sensory) {
                    case R.id.sensory0:
                        sensorytrans = 0;
                        break;
                    case R.id.sensory1:
                        sensorytrans = 1;
                        break;
                    case R.id.sensory2:
                        sensorytrans = 2;
                        break;
                }

                RadioGroup languagegroup = (RadioGroup) findViewById(R.id.language);
                int checkRadioButton_language = languagegroup.getCheckedRadioButtonId();
                int languagetrans = 0;
                switch (checkRadioButton_language) {
                    case R.id.language0:
                        languagetrans = 0;
                        break;
                    case R.id.language1:
                        languagetrans = 1;
                        break;
                    case R.id.language2:
                        languagetrans = 2;
                        break;
                }

                RadioGroup dysarthriagroup = (RadioGroup) findViewById(R.id.dysarthriatext);
                int checkRadioButton_dysarthria = dysarthriagroup.getCheckedRadioButtonId();
                int dysarthriatrans = 0;
                switch (checkRadioButton_dysarthria) {
                    case R.id.dysarthria0:
                        dysarthriatrans = 0;
                        break;
                    case R.id.dysarthria1:
                        dysarthriatrans = 1;
                        break;
                    case R.id.dysarthria2:
                        dysarthriatrans = 2;
                        break;
                    case R.id.dysarthria3:
                        dysarthriatrans = 3;
                        break;
                }

                RadioGroup extinctiongroup = (RadioGroup) findViewById(R.id.extinction_text);
                int checkRadioButton_extinction = extinctiongroup.getCheckedRadioButtonId();
                int extinctiontrans = 0 ;
                switch (checkRadioButton_extinction) {
                    case R.id.extinction0:
                        extinctiontrans = 0;
                        break;
                    case R.id.rightleg2:
                        extinctiontrans = 1;
                        break;
                    case R.id.extinction2:
                        extinctiontrans = 2;
                        break;
                }

                Intent intent = new Intent();
                intent.setClass(activity_nihss.this, calculatorNIHSS.class);
                intent.putExtra("LOC", LOCtrans);
                intent.putExtra("dysarthria", dysarthriatrans);
                intent.putExtra("extinction", extinctiontrans);
                intent.putExtra("language", languagetrans);
                intent.putExtra("bestgaze", Bestgazetrans);
                intent.putExtra("consciousness", consciousnesstrans);
                intent.putExtra("facialpalsy", facialpalsytrans);
                intent.putExtra("leftarm", leftarmtrans);
                intent.putExtra("leftleg", leftlegtrans);
                intent.putExtra("limbataxia", limbataxiatrans);
                intent.putExtra("LOCcommands", LOCcommandstrans);
                intent.putExtra("rightarm", rightarmtrans);
                intent.putExtra("rightleg", rightlegtrans);
                intent.putExtra("sensory", sensorytrans);
                intent.putExtra("visual", visualtrans);
                intent.putExtra("consciousness", consciousnesstrans);
                startActivity(intent);

            }
        };
        btnNIHSS.setOnClickListener(listener2);
    }
}












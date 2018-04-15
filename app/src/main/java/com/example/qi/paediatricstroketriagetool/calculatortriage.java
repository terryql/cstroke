package com.example.qi.paediatricstroketriagetool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class calculatortriage extends AppCompatActivity {

    private TextView View1;
    private TextView View2;
    private TextView View3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatortriage);
        View1 = (TextView)findViewById(R.id.Viewtest);
        View2 = (TextView)findViewById(R.id.isch_triage);
        View3 = (TextView)findViewById(R.id.hae_triage);

        Intent intent = getIntent();
        int vertigo_triage = intent.getIntExtra("vertigo",0);
        int headace_triage  = intent.getIntExtra("headace", 0);
        int vomit_triage  = intent.getIntExtra("vomit", 0);
        int dizziness_triage  = intent.getIntExtra("dizziness", 0);
        int speechloss_triage  = intent.getIntExtra("speechloass", 0);
        int focalnumb_triage  = intent.getIntExtra("focalnumb", 0);
        int focalweek_triage  = intent.getIntExtra("focalweek", 0);
        int seizure_triage  = intent.getIntExtra("seizure", 0);
        int mentalstate_triage  = intent.getIntExtra("mentalstate", 0);
        int loc_triage  = intent.getIntExtra("loc", 0);
        int vision_triage  = intent.getIntExtra("vision", 0);
        int other_triage  = intent.getIntExtra("other", 0);
        int gender_triage  = intent.getIntExtra("gender",0);
        int age_triage  = intent.getIntExtra ("age",0);
        int pmhx_triage  = intent.getIntExtra("pmhx", 0);
        int sudden_triage  = intent.getIntExtra("sudden",0);
        int medicaltransport_triage = intent.getIntExtra("medicaltransport", 0);
        int woke_triage  = intent.getIntExtra("woke", 0);
        int wellweekb4_triage  = intent.getIntExtra("wellweekb4", 0);

        double prob_ischaemic = 0;
        double prob_haemorrhagic = 0;
        double prob_mimics = 0;

        //CART model used to calculate probability of stroke mimics;
         if(other_triage == 0){
            if(medicaltransport_triage == 1){
                if(seizure_triage == 0){
                    if(dizziness_triage == 0){
                        if (pmhx_triage == 0){
                            prob_mimics = 0.06;
                        } else{
                            prob_mimics = 0.58;
                        }
                    }else{
                        if(mentalstate_triage == 1){
                            prob_mimics = 0.17;
                        }else{
                            prob_mimics = 0.83;
                        }
                    }
                }else{
                    if(age_triage >= 7) {
                        if (dizziness_triage == 0) {
                            prob_mimics = 0.2;
                        } else {
                            prob_mimics = 0.88;
                        }
                    }else{
                                prob_mimics = 0.93;
                            }
                        }
                    }else{
                        if(age_triage < 5)
                        {
                          if(headace_triage == 1){
                         prob_mimics = 0.14;
                    }else{
                          if(age_triage < 0.71){
                         prob_mimics = 0.2;
                        }else{
                        prob_mimics = 0.74;
                        }
                    }
                }else{
                            prob_mimics = 0.84;
                        }
                      }
         }else{
            prob_mimics = 0.98;
        }

        //CART model used to calculate probability of ischaemic stroke;
        if(focalweek_triage == 0){
            if(age_triage >= 11){
                prob_ischaemic = 0;
            } else {
                if (other_triage  == 1) {
                    prob_ischaemic = 0;
                } else {
                    if (pmhx_triage  == 0) {
                        prob_ischaemic = 0.13;
                    } else {
                        if(age_triage >= 3.9) {
                            prob_ischaemic = 0.25;
                        } else {
                            prob_ischaemic = 0.67;
                        }
                    }
                }
            }
        } else {
            if(other_triage  == 1) {
                prob_ischaemic = 0;
            } else {
                if (speechloss_triage  == 0) {
                    if (sudden_triage  == 0 ){
                        prob_ischaemic = 0;
                    } else {
                        if (age_triage  >= 5.3) {
                            prob_ischaemic = 0.2;
                        } else {
                            prob_ischaemic = 0.52;
                        }
                    }
                } else {
                    if (vomit_triage  == 1) {
                        prob_ischaemic = 0.27;
                    } else {
                        prob_ischaemic = 0.72;
                    }
                }
            }
        }

        //CART model used to calculate probability of haemorrhagic stroke;
        if (medicaltransport_triage == 0) {
            prob_haemorrhagic = 0.03;
        } else {
            if (age_triage < 5.8)
            {
                prob_haemorrhagic = 0;
            } else {
                if (loc_triage == 0 ){
                    prob_haemorrhagic = 0.24;
                } else {
                    if (dizziness_triage == 1){
                        prob_haemorrhagic = 0;
                    } else {
                        prob_haemorrhagic = 0.86;
                    }
                }
            }
        }

        View1.setText("The probability of stroke mimics is " + prob_mimics);
        View2.setText("The probability of ischaemic stroke is " + prob_ischaemic);
        View3.setText("The probability of haemorrhagic stroke is " + prob_haemorrhagic);

        //SharedPreferences preferences = this.getSharedPreferences("variables", 0);
      // int genderx = preferences.getInt("gender",0);
       // String test1 = preferences.getString("test",null);

       // View1.setText("OK"+test1);
      /* TextView View1 =new TextView(this); */

    }
}

/* Codes about how to transfer data from one fragment to another activity.
    SecondActivity activity = (SecondActivity) getActivity();
    String data= activity.getIntent().getExtras().getString("message");
*/
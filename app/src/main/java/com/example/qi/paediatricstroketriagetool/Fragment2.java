package com.example.qi.paediatricstroketriagetool;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    private Button btn1;
    private TextView tv1;

    public Fragment2(){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment2, null);
        btn1 = (Button) rootView.findViewById(R.id.testb);

        View.OnClickListener listener0 = null;
        listener0 = new View.OnClickListener() {
            public void onClick(View v) {

                RadioGroup gender_group = (RadioGroup) getActivity().findViewById(R.id.gender_group);
                int checkRadioButtonId_gender = gender_group.getCheckedRadioButtonId();
                int gender = 0;
                switch (checkRadioButtonId_gender) {
                    case R.id.male:
                        gender = 1;
                        break;
                    case R.id.female:
                        gender = 0;
                        break;
                }

                RadioGroup pmhx_group = (RadioGroup) getActivity().findViewById(R.id.pmhx_group);
                int checkRadioButtonId_pmhx = pmhx_group.getCheckedRadioButtonId();
                int pmhx = 0;
                switch (checkRadioButtonId_pmhx) {
                    case R.id.pmhx_y:
                        pmhx = 1;
                        break;
                    case R.id.pmhx_n:
                        pmhx = 0;
                        break;
                }


                RadioGroup wellwakeb4_group = (RadioGroup) getActivity().findViewById(R.id.wellweekb4_group);
                int checkRadioButtonId_wellwakeb4 = wellwakeb4_group.getCheckedRadioButtonId();
                int wellwakeb4 = 0;
                switch (checkRadioButtonId_wellwakeb4) {
                    case R.id.wellweekb4_y:
                        wellwakeb4 = 1;
                        break;
                    case R.id.wellweekb4_n:
                        wellwakeb4 = 0;
                        break;
                }

                RadioGroup medicaltransport_group = (RadioGroup) getActivity().findViewById(R.id.medicaltransport_group);
                int checkRadioButtonId_medicaltransport = medicaltransport_group.getCheckedRadioButtonId();
                int medicaltransport = 0;
                switch (checkRadioButtonId_medicaltransport) {
                    case R.id.medicaltransport_y:
                        medicaltransport = 1;
                        break;
                    case R.id.medicaltransport_n:
                        medicaltransport = 0;
                        break;
                }


                RadioGroup woke_group = (RadioGroup) getActivity().findViewById(R.id.woke_group);
                int checkRadioButtonId_woke = woke_group.getCheckedRadioButtonId();
                int woke = 0;
                switch (checkRadioButtonId_woke) {
                    case R.id.woke_y:
                        woke = 1;
                        break;
                    case R.id.woke_n:
                        woke = 0;
                        break;
                }

                RadioGroup vertigo_group = (RadioGroup) getActivity().findViewById(R.id.vertigo_group);
                int checkRadioButtonId_vertigo = vertigo_group.getCheckedRadioButtonId();
                int vertigovalue = 0;
                switch (checkRadioButtonId_vertigo) {
                    case R.id.vertigo_y:
                        vertigovalue = 1;
                        break;
                    case R.id.vertigo_n:
                        vertigovalue = 0;
                        break;
                }

                RadioGroup headache_group = (RadioGroup) getActivity().findViewById(R.id.headache_group);
                int checkRadioButtonId_headache = headache_group.getCheckedRadioButtonId();
                int headacevalue = 0;
                switch (checkRadioButtonId_headache) {
                    case R.id.headache_y:
                        headacevalue = 1;
                        break;
                    case R.id.headache_n:
                        headacevalue = 0;
                        break;
                }

                RadioGroup vomit_group = (RadioGroup) getActivity().findViewById(R.id.vomit_group);
                int checkRadioButtonId_vomit = vomit_group.getCheckedRadioButtonId();
                int vomitvalue = 0;
                switch (checkRadioButtonId_vomit) {
                    case R.id.vomit_y:
                        vomitvalue = 1;
                        break;
                    case R.id.vomit_n:
                        vomitvalue = 0;
                        break;
                }

                RadioGroup dizziness_group = (RadioGroup) getActivity().findViewById(R.id.dizziness_group);
                int checkRadioButtonId_dizziness = dizziness_group.getCheckedRadioButtonId();
                int dizzinessvalue = 0;
                switch (checkRadioButtonId_dizziness) {
                    case R.id.dizziness_y:
                        dizzinessvalue = 1;
                        break;
                    case R.id.dizziness_n:
                        dizzinessvalue = 0;
                        break;
                }

                RadioGroup speechloss_group = (RadioGroup) getActivity().findViewById(R.id.speechloss_group);
                int checkRadioButtonId_speechloss = speechloss_group.getCheckedRadioButtonId();
                int speechlossvalue = 0;
                switch (checkRadioButtonId_speechloss) {
                    case R.id.speechloss_y:
                        speechlossvalue = 1;
                        break;
                    case R.id.speechloss_n:
                        speechlossvalue = 0;
                        break;
                }

                RadioGroup focalnumb_group = (RadioGroup) getActivity().findViewById(R.id.focalnumb_group);
                int checkRadioButtonId_focalnumb = focalnumb_group.getCheckedRadioButtonId();
                int focalnumbvalue = 0;
                switch (checkRadioButtonId_focalnumb) {
                    case R.id.focalnumb_y:
                        focalnumbvalue = 1;
                        break;
                    case R.id.focalnumb_n:
                        focalnumbvalue = 0;
                        break;
                }

                RadioGroup focalweak_group = (RadioGroup) getActivity().findViewById(R.id.focalweak_group);
                int checkRadioButtonId_focalweek = focalweak_group.getCheckedRadioButtonId();
                int focalweekvalue = 0;
                switch (checkRadioButtonId_focalweek) {
                    case R.id.focalweak_y:
                        focalweekvalue = 1;
                        break;
                    case R.id.focalnumb_n:
                        focalweekvalue = 0;
                        break;
                }

                RadioGroup seizure_group = (RadioGroup) getActivity().findViewById(R.id.seizure_group);
                int checkRadioButtonId_seizure = seizure_group.getCheckedRadioButtonId();
                int seizurevalue = 0;
                switch (checkRadioButtonId_seizure) {
                    case R.id.seizure_y:
                        seizurevalue = 1;
                        break;
                    case R.id.seizure_n:
                        seizurevalue = 0;
                        break;
                }

                RadioGroup mentalstate_group = (RadioGroup) getActivity().findViewById(R.id.mentalstate_group);
                int checkRadioButtonId_mentalstate = mentalstate_group.getCheckedRadioButtonId();
                int mentalstatevalue = 0;
                switch (checkRadioButtonId_mentalstate) {
                    case R.id.mentalstate_y:
                        seizurevalue = 1;
                        break;
                    case R.id.mentalstate_n:
                        seizurevalue = 0;
                        break;
                }

                RadioGroup loc_group = (RadioGroup) getActivity().findViewById(R.id.loc_group);
                int checkRadioButtonId_loc = loc_group.getCheckedRadioButtonId();
                int locvalue = 0;
                switch (checkRadioButtonId_loc) {
                    case R.id.loc_y:
                        locvalue = 1;
                        break;
                    case R.id.loc_n:
                        locvalue = 0;
                        break;
                }

                RadioGroup vision_group = (RadioGroup) getActivity().findViewById(R.id.vision_group);
                int checkRadioButtonId_vision = vision_group.getCheckedRadioButtonId();
                int visionvalue = 0;
                switch (checkRadioButtonId_vision) {
                    case R.id.vision_y:
                        visionvalue = 1;
                        break;
                    case R.id.vision_n:
                        visionvalue = 0;
                        break;
                }

                RadioGroup ataxia_group = (RadioGroup) getActivity().findViewById(R.id.ataxia_group);
                int checkRadioButtonId_ataxia = ataxia_group.getCheckedRadioButtonId();
                int ataxiavalue = 0;
                switch (checkRadioButtonId_ataxia) {
                    case R.id.ataxia_y:
                        ataxiavalue = 1;
                        break;
                    case R.id.ataxia_n:
                        ataxiavalue = 0;
                        break;
                }

                RadioGroup other_group = (RadioGroup) getActivity().findViewById(R.id.other_group);
                int checkRadioButtonId_other = other_group.getCheckedRadioButtonId();
                int othervalue = 0;
                switch (checkRadioButtonId_other) {
                    case R.id.other_y:
                        othervalue = 1;
                        break;
                    case R.id.other_n:
                        othervalue = 0;
                        break;
                }

                tv1 = (TextView)rootView.findViewById(R.id.headache);
                SharedPreferences fragmentpreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
               // int gender = fragmentpreferences.getInt("gender",0);
               // int pmhx = fragmentpreferences.getInt("pmhx",0);
               // int woke = fragmentpreferences.getInt("woke",0);
               // int wellwakeb4 =fragmentpreferences.getInt("wellwakeb4",0);
               // int medicaltransport = fragmentpreferences.getInt("medicaltransport",0);

             /*   int gender_value = 0;
                if (gender == 1){
                    gender_value = 1;
                }else{
                    gender_value = 0;
                }

                int pmhx_value = 0;
                if (pmhx == 1){
                    pmhx_value = 1;
                }else{
                    pmhx_value = 0;
                }

                int woke_value  = 0;
                if (woke == 1){
                    woke_value  = 1;
                }else{
                    woke_value  = 0;
                }

                int wellwakeb4_value  = 0;
                if(wellwakeb4 == 1){
                    wellwakeb4_value  = 1;
                }else{
                    wellwakeb4_value  = 0;
                }

                int medicaltransport_value  = 0;
                if (medicaltransport == 1){
                    medicaltransport_value  = 1;
                }else{
                    medicaltransport_value  = 0;
                }
*/
                    Intent intent = new Intent(getActivity(), calculatortriage.class);
                    intent.putExtra("vertigo", vertigovalue);
                    intent.putExtra("headace", headacevalue);
                    intent.putExtra("vomit", vomitvalue);
                    intent.putExtra("dizziness", dizzinessvalue);
                    intent.putExtra("speechloss", speechlossvalue);
                    intent.putExtra("focalnumb", focalnumbvalue);
                    intent.putExtra("focalweek", focalweekvalue);
                    intent.putExtra("seizure", seizurevalue);
                    intent.putExtra("mentalstate", mentalstatevalue);
                    intent.putExtra("loc", locvalue);
                    intent.putExtra("vision", visionvalue);
                    intent.putExtra("ataxia",ataxiavalue);
                    intent.putExtra("other",othervalue);
                    intent.putExtra("gender",gender);
                    intent.putExtra("pmhx",pmhx);
                    intent.putExtra("woke",woke);
                    intent.putExtra("wellwakeb4",wellwakeb4);
                    intent.putExtra("medicaltransport",medicaltransport);

                    startActivity(intent);
                }
            };
        btn1.setOnClickListener(listener0);
        return rootView;
        }
    }

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

public class fragment_stroke3 extends Fragment {

    private Button btn5;
    public fragment_stroke3(){}

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView2 = inflater.inflate(R.layout.fragment_stroke3, null);
        btn5 = (Button) rootView2.findViewById(R.id.button4);

        View.OnClickListener listener1 = null;
        listener1 = new View.OnClickListener() {
            public void onClick(View v) {

                RadioGroup vertigo_group = (RadioGroup) getActivity().findViewById(R.id.vertigo_group);
                int checkRadioButtonId_vertigo = vertigo_group.getCheckedRadioButtonId();
                int vertigoshared  = 0;
                switch (checkRadioButtonId_vertigo) {
                    case R.id.vertigo_y:
                        vertigoshared = 1;
                        break;
                    case R.id.vertigo_n:
                        vertigoshared  = 0;
                        break;
                }

                RadioGroup pupils_group = (RadioGroup) getActivity().findViewById(R.id.pupils_group);
                int checkRadioButtonId_pupils = pupils_group.getCheckedRadioButtonId();
                int pupilsshared = 0;
                switch (checkRadioButtonId_pupils) {
                    case R.id.pupils_y:
                        pupilsshared= 1;
                        break;
                    case R.id.pupils_n:
                        pupilsshared = 0;
                        break;
                }

                RadioGroup lowGCS_group = (RadioGroup) getActivity().findViewById(R.id.lowGCS_group);
                int checkRadioButtonId_lowGCS = lowGCS_group.getCheckedRadioButtonId();
                int lowGCSshared = 0;
                switch (checkRadioButtonId_lowGCS) {
                    case R.id.less9:
                        lowGCSshared = 1;
                        break;
                    case R.id.higher9:
                        lowGCSshared = 0;
                        break;
                }

              RadioGroup grsi_abngcs_group = (RadioGroup) getActivity().findViewById(R.id.grsi_abngcs_group);
                int checkRadioButtonId_grsi_abngcs =grsi_abngcs_group.getCheckedRadioButtonId();
                int grsi_abngcsshared = 0;
                switch (checkRadioButtonId_grsi_abngcs) {
                    case R.id.grsi_abngcs_y:
                        grsi_abngcsshared = 1;
                        break;
                    case R.id.wellweekb4_n:
                        grsi_abngcsshared = 0;
                        break;
                }

                RadioGroup walknotokcrf2_group = (RadioGroup) getActivity().findViewById(R.id.walknotokcrf2_group);
                int checkRadioButtonId_walknotokcrf2 = walknotokcrf2_group.getCheckedRadioButtonId();
                int walknotokcrf2shared = 0;
                switch (checkRadioButtonId_walknotokcrf2){
                    case R.id.walknotokcrf2_y:
                        walknotokcrf2shared = 1;
                        break;
                    case R.id.walknotokcrf2_n:
                        walknotokcrf2shared= 0;
                        break;
                }

                RadioGroup weakarm_group = (RadioGroup) getActivity().findViewById(R.id.weakarm_group);
                int checkRadioButtonId_weakarm = weakarm_group.getCheckedRadioButtonId();
                int weakarmshared = 0;
                switch (checkRadioButtonId_weakarm) {
                    case R.id.weakarm_y:
                        weakarmshared= 1;
                        break;
                    case R.id.weakarm_n:
                        weakarmshared = 0;
                        break;
                }

                RadioGroup weakhand_group = (RadioGroup) getActivity().findViewById(R.id.weakhand_group);
                int checkRadioButtonId_weakhand = weakhand_group.getCheckedRadioButtonId();
                int weakhandshared = 0;
                switch (checkRadioButtonId_weakhand) {
                    case R.id.weakhand_y:
                        weakhandshared = 1;
                        break;
                    case R.id.weakhand_n:
                        weakhandshared = 0;
                        break;
                }

                RadioGroup weakface_group = (RadioGroup) getActivity().findViewById(R.id.weakface_group);
                int checkRadioButtonId_weakface = weakface_group.getCheckedRadioButtonId();
                int weakfaceshared = 0;
                switch (checkRadioButtonId_weakface) {
                    case R.id.weakface_y:
                        weakfaceshared = 1;
                        break;
                    case R.id.weakface_n:
                        weakfaceshared = 0;
                        break;
                }

                RadioGroup weakleg_group = (RadioGroup) getActivity().findViewById(R.id.weakleg_group);
                int checkRadioButtonId_weakleg = weakleg_group.getCheckedRadioButtonId();
                int weaklegshared= 0;
                switch (checkRadioButtonId_weakleg) {
                    case R.id.weakleg_y:
                        weaklegshared= 1;
                        break;
                    case R.id.weakleg_n:
                        weaklegshared = 0;
                        break;
                }


                RadioGroup headache_group = (RadioGroup) getActivity().findViewById(R.id.headache_group);
                int checkRadioButtonId_headache = headache_group.getCheckedRadioButtonId();
                int headaceshared  = 0;
                switch (checkRadioButtonId_headache) {
                    case R.id.headache_y:
                        headaceshared  = 1;
                        break;
                    case R.id.headache_n:
                        headaceshared  = 0;
                        break;
                }

                RadioGroup dizziness_group = (RadioGroup) getActivity().findViewById(R.id.dizziness_group);
                int checkRadioButtonId_dizziness = dizziness_group.getCheckedRadioButtonId();
                int dizzinessshared  = 0;
                switch (checkRadioButtonId_dizziness) {
                    case R.id.dizziness_y:
                        dizzinessshared  = 1;
                        break;
                    case R.id.dizziness_n:
                        dizzinessshared  = 0;
                        break;
                }

                RadioGroup focalnumb_group = (RadioGroup) getActivity().findViewById(R.id.focalnumb_group);
                int checkRadioButtonId_focalnumb = focalnumb_group.getCheckedRadioButtonId();
                int focalnumbshared  = 0;
                switch (checkRadioButtonId_focalnumb) {
                    case R.id.focalnumb_y:
                        focalnumbshared  = 1;
                        break;
                    case R.id.focalnumb_n:
                        focalnumbshared = 0;
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

                RadioGroup sensearm_group = (RadioGroup) getActivity().findViewById(R.id.sensearm_group);
                int checkRadioButtonId_sensearm = sensearm_group.getCheckedRadioButtonId();
                int sensearmshared= 0;
                switch (checkRadioButtonId_sensearm) {
                    case R.id.sensearm_y:
                        sensearmshared = 1;
                        break;
                    case R.id.sensearm_n:
                        sensearmshared = 0;
                        break;
                }

                RadioGroup senseleg_group = (RadioGroup) getActivity().findViewById(R.id.senseleg_group);
                int checkRadioButtonId_senseleg = senseleg_group.getCheckedRadioButtonId();
                int senselegshared = 0;
                switch (checkRadioButtonId_senseleg) {
                    case R.id.senseleg_y:
                        senselegshared = 1;
                        break;
                    case R.id.senseleg_n:
                        senselegshared = 0;
                        break;
                }

                RadioGroup senseface_group = (RadioGroup) getActivity().findViewById(R.id.senseface_group);
                int checkRadioButtonId_senseface = senseface_group.getCheckedRadioButtonId();
                int sensefaceshared = 0;
                switch (checkRadioButtonId_senseface) {
                    case R.id.senseface_y:
                        sensefaceshared = 1;
                        break;
                    case R.id.senseface_n:
                        sensefaceshared = 0;
                        break;
                }


                RadioGroup other2_group = (RadioGroup) getActivity().findViewById(R.id.other2_group);
                int checkRadioButtonId_other2 = other2_group.getCheckedRadioButtonId();
                int other2shared= 0;
                switch (checkRadioButtonId_other2) {
                    case R.id.other2_y:
                        other2shared = 1;
                        break;
                    case R.id.other2_n:
                        other2shared = 0;
                        break;
                }

                RadioGroup ataxia1_group = (RadioGroup) getActivity().findViewById(R.id.ataxia1_group);
                int checkRadioButtonId_ataxia1= ataxia1_group.getCheckedRadioButtonId();
                int ataxia1shared = 0;
                switch (checkRadioButtonId_ataxia1) {
                    case R.id.ataxia1_y:
                        ataxia1shared = 1;
                        break;
                    case R.id.ataxia1_n:
                        ataxia1shared = 0;
                        break;
                }

                RadioGroup noneuro_group = (RadioGroup) getActivity().findViewById(R.id.noneuro_group);
                int checkRadioButtonId_noneuro= noneuro_group.getCheckedRadioButtonId();
                int noneuroshared = 0;
                switch (checkRadioButtonId_noneuro) {
                    case R.id.noneuro_y:
                        noneuroshared = 1;
                        break;
                    case R.id.noneuro_n:
                        noneuroshared= 0;
                        break;
                }

              RadioGroup speechloss_group = (RadioGroup) getActivity().findViewById(R.id.speechloss_group);
                int checkRadioButtonId_speechloss = speechloss_group.getCheckedRadioButtonId();
                int speechlossshared  = 0;
                switch (checkRadioButtonId_speechloss) {
                    case R.id.speechloss_y:
                        speechlossshared  = 1;
                        break;
                    case R.id.speechloss_n:
                        speechlossshared  = 0;
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

              RadioGroup eyemovement_group = (RadioGroup) getActivity().findViewById(R.id.eyemovement_group);
                int checkRadioButtonId_eyemovement = eyemovement_group.getCheckedRadioButtonId();
                int eyemovementshared = 0;
                switch (checkRadioButtonId_eyemovement) {
                    case R.id.eyemovement_y:
                        eyemovementshared = 1;
                        break;
                    case R.id.eyemovement_n:
                        eyemovementshared = 0;
                        break;
                }

                RadioGroup dysarthria_group = (RadioGroup) getActivity().findViewById(R.id.dysarthria_group);
                int checkRadioButtonId_dysarthria = dysarthria_group.getCheckedRadioButtonId();
                int dysarthriashared = 0;
                switch (checkRadioButtonId_dysarthria) {
                    case R.id.dysarthria_y:
                        dysarthriashared = 1;
                        break;
                    case R.id.dysarthria_n:
                        dysarthriashared = 0;
                        break;
                }

                RadioGroup dysphasia_group = (RadioGroup) getActivity().findViewById(R.id.dysphasia_group);
                int checkRadioButtonId_dysphasia = dysphasia_group.getCheckedRadioButtonId();
                int dysphasiashared = 0;
                switch (checkRadioButtonId_dysphasia) {
                    case R.id.dysphasia_y:
                        dysphasiashared= 1;
                        break;
                    case R.id.dysphasia_n:
                        dysphasiashared = 0;
                        break;
                }

                RadioGroup visualdef_group = (RadioGroup) getActivity().findViewById(R.id.visualdef_group);
                int checkRadioButtonId_visualdef = visualdef_group.getCheckedRadioButtonId();
                int visualdefshared= 0;
                switch (checkRadioButtonId_visualdef) {
                    case R.id.visualdef_y:
                        visualdefshared = 1;
                        break;
                    case R.id.visualdef_n:
                        visualdefshared = 0;
                        break;
                }

                RadioGroup senseneg_group = (RadioGroup) getActivity().findViewById(R.id.senseneg_group);
                int checkRadioButtonId_senseneg = senseneg_group.getCheckedRadioButtonId();
                int sensenegshared = 0;
                switch (checkRadioButtonId_senseneg) {
                    case R.id.senseneg_y:
                        sensenegshared = 1;
                        break;
                    case R.id.senseneg_n:
                        sensenegshared = 0;
                        break;
                }

                RadioGroup focalweak = (RadioGroup) getActivity().findViewById(R.id.focalweak_group);
                int checkRadioButtonId_focalweak = focalweak.getCheckedRadioButtonId();
                int focalweakshared = 0;
                switch (checkRadioButtonId_focalweak) {
                    case R.id.focalweak_y:
                        focalweakshared = 1;
                        break;
                    case R.id.focalweak_n:
                        focalweakshared = 0;
                        break;
                }

               RadioGroup vomit_group = (RadioGroup) getActivity().findViewById(R.id.vomit_group);
                int checkRadioButtonId_vomit = vomit_group.getCheckedRadioButtonId();
                int vomitshared  = 0;
                switch (checkRadioButtonId_vomit) {
                    case R.id.vomit_y:
                        vomitshared  = 1;
                        break;
                    case R.id.vomit_n:
                        vomitshared  = 0;
                        break;
                }


                RadioGroup gender_group = (RadioGroup) getActivity().findViewById(R.id.gender_group);
                int checkRadioButtonId_gender = gender_group.getCheckedRadioButtonId();
                int gendershared = 0;
                switch (checkRadioButtonId_gender) {
                    case R.id.male:
                        gendershared = 1;
                        break;
                    case R.id.female:
                        gendershared = 0;
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


                // tv1 = (TextView) rootView2.findViewById(R.id.headache);
                SharedPreferences fragmentpreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
                // int gender = fragmentpreferences.getInt("gender",0);
                // int pmhx = fragmentpreferences.getInt("pmhx",0);
                // int woke = fragmentpreferences.getInt("woke",0);
                // int wellwakeb4 =fragmentpreferences.getInt("wellwakeb4",0);
                // int medicaltransport = fragmentpreferences.getInt("medicaltransport",0);


              /*


                int pmhx_value = 0;
                if (pmhx == 1) {
                    pmhx_value = 1;
                } else {
                    pmhx_value = 0;
                }

                int woke_value = 0;
                if (woke == 1) {
                    woke_value = 1;
                } else {
                    woke_value = 0;
                }

                int wellwakeb4_value = 0;
                if (wellwakeb4 == 1) {
                    wellwakeb4_value = 1;
                } else {
                    wellwakeb4_value = 0;
                }

                int medicaltransport_value = 0;
                if (medicaltransport == 1) {
                    medicaltransport_value = 1;
                } else {
                    medicaltransport_value = 0;
                }

                */

                Intent intent = new Intent(getActivity(), calculatorstroke.class);

                intent.putExtra("vertigo", vertigoshared);
                intent.putExtra("pupils",pupilsshared);
                intent.putExtra("lowGCS",lowGCSshared);
                intent.putExtra("grsi_abngcs",grsi_abngcsshared);
                intent.putExtra("walknotokcrf2", walknotokcrf2shared);
                intent.putExtra("weakarm", weakarmshared);
                intent.putExtra("weakhand", weakhandshared);
                intent.putExtra("weakleg",weaklegshared);
                intent.putExtra("weakface", weakfaceshared);
                intent.putExtra("headace", headaceshared);
                intent.putExtra("dizziness", dizzinessshared);
                intent.putExtra("focalnumb", focalnumbshared);
                intent.putExtra("focalweek", focalweekvalue);
                intent.putExtra("sensearm", sensearmshared);
                intent.putExtra("senseface",sensefaceshared);
                intent.putExtra("senseleg",senselegshared);
                intent.putExtra("other2",other2shared);
                intent.putExtra("ataxia1",ataxia1shared);
                intent.putExtra("noneuro",noneuroshared);
                intent.putExtra("vomit", vomitshared);
                intent.putExtra("seizure", seizurevalue);
                intent.putExtra("mentalstate", mentalstatevalue);
                intent.putExtra("loc", locvalue);
                intent.putExtra("vision", visionvalue);
                intent.putExtra("ataxia", ataxiavalue);
                intent.putExtra("other", othervalue);
                intent.putExtra("eyemovement",eyemovementshared);
                intent.putExtra("focalweak",focalweakshared);
                intent.putExtra("speechloss", speechlossshared);
                intent.putExtra("senseneg",sensenegshared);
                intent.putExtra("visualdef",visualdefshared);
                intent.putExtra("dysphasia",dysphasiashared);
                intent.putExtra("dysarthria",dysarthriashared);
                intent.putExtra("weakleg",weaklegshared);

                intent.putExtra("gender",gendershared);
                intent.putExtra("pmhx", pmhx);
                intent.putExtra("woke", woke);
                intent.putExtra("wellweekb4", wellwakeb4);
                intent.putExtra("medicaltransport", medicaltransport);

        /*      intent.putExtra("gender",gender);
                intent1.putExtra("woke", wokeshared);
                intent1.putExtra("vomit", vomitshared);
                intent1.putExtra("seizure", seizurevalue);
                intent1.putExtra("mentalstate", mentalstatevalue);
                intent1.putExtra("loc", locvalue);
                intent1.putExtra("vision", visionvalue);
                intent.putExtra("ataxia", ataxiavalue);
                intent1.putExtra("other", othervalue);
                intent1.putExtra("eyemovement",eyemovementshared);
                intent1.putExtra("focalweak",focalweakshared);
                intent1.putExtra("medicaltransport",medicaltransportshared);
                intent1.putExtra("wellweekb4",wellweekb4shared);
                intent1.putExtra("pmhxshared",pmhxshared);
                intent.putExtra("speechloss", speechlossshared);
                intent1.putExtra("senseneg",sensenegshared);
                intent1.putExtra("visualdef",visualdefshared);
                intent1.putExtra("dysphasia",dysphasiashared);
                intent1.putExtra("dysarthria",dysarthriashared);
                intent1.putExtra("weakleg",weaklegshared);
*/
                startActivity(intent);
            }
        };
        btn5.setOnClickListener(listener1);
        return rootView2;
    }
}
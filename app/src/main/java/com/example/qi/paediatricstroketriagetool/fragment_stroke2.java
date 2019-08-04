package com.example.qi.paediatricstroketriagetool;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;


public class fragment_stroke2 extends Fragment {

    public fragment_stroke2() {}
    private Button button5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view3 = inflater.inflate(R.layout.fragment_stroke2, null);

        View.OnClickListener listener1 = null;
        listener1 = new View.OnClickListener() {
            public void onClick(View v) {

                SharedPreferences fragmentpreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = fragmentpreferences.edit();

                RadioGroup gender = (RadioGroup) getActivity().findViewById(R.id.gendergroup);
                int checkRadioButtonId_gender = gender.getCheckedRadioButtonId();
                int gendershared = 0;
                switch (checkRadioButtonId_gender) {
                    case R.id.gender0:
                        gendershared= 1;
                        break;
                    case R.id.gender1:
                        gendershared = 0;
                        break;
                }

                RadioGroup pmhxchoose = (RadioGroup) getActivity().findViewById(R.id.pmhxgroup);
                int checkRadioButtonId_pmhx = pmhxchoose.getCheckedRadioButtonId();
                int pmhxshared = 0;
                switch (checkRadioButtonId_pmhx) {
                    case R.id.pmhx_y:
                        pmhxshared = 1;
                        break;
                    case R.id.pmhx_n:
                        pmhxshared = 0;
                        break;
                }

                RadioGroup wokechoose = (RadioGroup) getActivity().findViewById(R.id.wokegroup);
                int checkRadioButtonId_woke = wokechoose.getCheckedRadioButtonId();
                int wokeshared = 0;
                switch (checkRadioButtonId_woke) {
                    case R.id.woke_y:
                        wokeshared = 1;
                        break;
                    case R.id.woke_n:
                        wokeshared = 0;
                        break;
                }

                RadioGroup wellweekb4choose = (RadioGroup) getActivity().findViewById(R.id.wellweekb4group);
                int checkRadioButtonId_wellweekb4 = wellweekb4choose.getCheckedRadioButtonId();
                int wellweekb4shared = 0;
                switch (checkRadioButtonId_wellweekb4) {
                    case R.id.wellweekb4_y:
                        wellweekb4shared = 1;
                        break;
                    case R.id.wellweekb4_n:
                        wellweekb4shared = 0;
                        break;
                }

                RadioGroup medicaltransportchoose = (RadioGroup) getActivity().findViewById(R.id.medicaltransportgroup);
                int checkRadioButtonId_medicaltransport = medicaltransportchoose.getCheckedRadioButtonId();
                int medicaltransportshared = 0;
                switch (checkRadioButtonId_medicaltransport) {
                    case R.id.medicaltransport_y:
                        medicaltransportshared = 1;
                        break;
                    case R.id.medicaltransport_n:
                        medicaltransportshared = 0;
                        break;
                }

                RadioGroup headache = (RadioGroup) getActivity().findViewById(R.id.headachegroup);
                int checkRadioButtonId_headache = headache.getCheckedRadioButtonId();
                int headacheshared = 0;
                switch (checkRadioButtonId_headache) {
                    case R.id.headache_y:
                        headacheshared = 1;
                        break;
                    case R.id.headache_n:
                        headacheshared = 0;
                        break;
                }

                RadioGroup vomit = (RadioGroup) getActivity().findViewById(R.id.vomitgroup);
                int checkRadioButtonId_vomit = vomit.getCheckedRadioButtonId();
                int vomitshared = 0;
                switch (checkRadioButtonId_vomit) {
                    case R.id.vomit_y:
                        vomitshared = 1;
                        break;
                    case R.id.pmhx_n:
                        vomitshared = 0;
                        break;
                }

                RadioGroup dizziness = (RadioGroup) getActivity().findViewById(R.id.dizzinessgroup);
                int checkRadioButtonId_dizziness = dizziness.getCheckedRadioButtonId();
                int dizzinessshared = 0;
                switch (checkRadioButtonId_dizziness) {
                    case R.id.dizziness_y:
                        dizzinessshared = 1;
                        break;
                    case R.id.dizziness_n:
                        dizzinessshared = 0;
                        break;
                }

                RadioGroup speechloss = (RadioGroup) getActivity().findViewById(R.id.speechlossgroup);
                int checkRadioButtonId_speechloss = speechloss.getCheckedRadioButtonId();
                int speechlossshared = 0;
                switch (checkRadioButtonId_speechloss) {
                    case R.id.speechloss_y:
                        speechlossshared = 1;
                        break;
                    case R.id.speechloss_n:
                        speechlossshared = 0;
                        break;
                }

                RadioGroup focalnumb = (RadioGroup) getActivity().findViewById(R.id.focalnumbgroup);
                int checkRadioButtonId_focalnumb = focalnumb.getCheckedRadioButtonId();
                int focalnumbshared = 0;
                switch (checkRadioButtonId_focalnumb) {
                    case R.id.focalnumb_y:
                        focalnumbshared = 1;
                        break;
                    case R.id.focalnumb_n:
                        focalnumbshared = 0;
                        break;
                }

                RadioGroup focalweak = (RadioGroup) getActivity().findViewById(R.id.focalweakgroup);
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

                RadioGroup seizure = (RadioGroup) getActivity().findViewById(R.id.seizuregroup);
                int checkRadioButtonId_seizure = seizure.getCheckedRadioButtonId();
                int seizureshared = 0;
                switch (checkRadioButtonId_seizure) {
                    case R.id.seizure_y:
                        seizureshared = 1;
                        break;
                    case R.id.seizure_n:
                        seizureshared = 0;
                        break;
                }

                RadioGroup mentalstate = (RadioGroup) getActivity().findViewById(R.id.mentalstategroup);
                int checkRadioButtonId_mentalstate = mentalstate.getCheckedRadioButtonId();
                int mentalstateshared = 0;
                switch (checkRadioButtonId_mentalstate) {
                    case R.id.mentalstate_y:
                        mentalstateshared = 1;
                        break;
                    case R.id.mentalstate_n:
                        mentalstateshared = 0;
                        break;
                }

                RadioGroup loc = (RadioGroup) getActivity().findViewById(R.id.locgroup);
                int checkRadioButtonId_loc= loc.getCheckedRadioButtonId();
                int locshared = 0;
                switch (checkRadioButtonId_loc) {
                    case R.id.loc_y:
                        locshared = 1;
                        break;
                    case R.id.loc_n:
                        locshared = 0;
                        break;
                }

                RadioGroup vision = (RadioGroup) getActivity().findViewById(R.id.visiongroup);
                int checkRadioButtonId_vision = vision.getCheckedRadioButtonId();
                int visionshared = 0;
                switch (checkRadioButtonId_vision) {
                    case R.id.vision_y:
                        visionshared = 1;
                        break;
                    case R.id.vision_n:
                        visionshared = 0;
                        break;
                }

                RadioGroup ataxia = (RadioGroup) getActivity().findViewById(R.id.ataxiagroup);
                int checkRadioButtonId_ataxia = ataxia.getCheckedRadioButtonId();
                int ataxiashared = 0;
                switch (checkRadioButtonId_ataxia) {
                    case R.id.ataxia_y:
                        ataxiashared = 1;
                        break;
                    case R.id.ataxia_n:
                        ataxiashared = 0;
                        break;
                }

                RadioGroup vertigo = (RadioGroup) getActivity().findViewById(R.id.vertigogroup);
                int checkRadioButtonId_vertigo = vertigo.getCheckedRadioButtonId();
                int vertigoshared = 0;
                switch (checkRadioButtonId_vertigo) {
                    case R.id.vertigo_y:
                        vertigoshared = 1;
                        break;
                    case R.id.vertigo_n:
                        vertigoshared = 0;
                        break;
                }

                RadioGroup other = (RadioGroup) getActivity().findViewById(R.id.othergroup);
                int checkRadioButtonId_other = other.getCheckedRadioButtonId();
                int othershared = 0;
                switch (checkRadioButtonId_other) {
                    case R.id.other_y:
                        othershared = 1;
                        break;
                    case R.id.other_n:
                        othershared = 0;
                        break;
                }

                editor.putInt("headache", headacheshared);
                editor.putInt("vomit", vomitshared);
                editor.putInt("dizziness", dizzinessshared);
                editor.putInt("speechloss", speechlossshared);
                editor.putInt("focalnumb", focalnumbshared);
                editor.putInt("focalweak", focalweakshared);
                editor.putInt("seizure", seizureshared);
                editor.putInt("mentalstate",mentalstateshared);
                editor.putInt("loc",locshared);
                editor.putInt("vision",visionshared);
                editor.putInt("ataxia",ataxiashared);
                editor.putInt("vertigo",vertigoshared);
                editor.putInt("other",othershared);
                editor.putInt("gender", gendershared);
                editor.putInt("pmhx", pmhxshared);
                editor.putInt("woke", wokeshared);
                editor.putInt("wellweekb4", wellweekb4shared);
                editor.putInt("medicaltransport", medicaltransportshared);
                editor.putInt("gender", gendershared);
                editor.putInt("pmhx", pmhxshared);
                editor.putInt("woke", wokeshared);
                editor.putInt("wellweekb4", wellweekb4shared);
                editor.putInt("medicaltransport", medicaltransportshared);

                editor.commit();


            }
        };
        return view3;
    }
}



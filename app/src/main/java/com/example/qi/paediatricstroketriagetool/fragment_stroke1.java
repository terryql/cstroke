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


public class fragment_stroke1 extends Fragment {
    public fragment_stroke1() {}
    private Button button6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view2 = inflater.inflate(R.layout.fragment_stroke1, null);

        View.OnClickListener listener1 = null;
        listener1 = new View.OnClickListener() {
            public void onClick(View v) {

                SharedPreferences fragmentpreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = fragmentpreferences.edit();

                RadioGroup gender = (RadioGroup) getActivity().findViewById(R.id.gender_group);
                int checkRadioButtonId_gender = gender.getCheckedRadioButtonId();
                int gendershared = 0;
                switch (checkRadioButtonId_gender) {
                    case R.id.male:
                        gendershared= 1;
                        break;
                    case R.id.female:
                        gendershared = 0;
                        break;
                }

                RadioGroup pmhxchoose = (RadioGroup) getActivity().findViewById(R.id.pmhx_group);
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

                RadioGroup wokechoose = (RadioGroup) getActivity().findViewById(R.id.woke_group);
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

                RadioGroup wellweekb4choose = (RadioGroup) getActivity().findViewById(R.id.wellweekb4_group);
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

                RadioGroup medicaltransportchoose = (RadioGroup) getActivity().findViewById(R.id.medicaltransport_group);
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

                editor.putInt("gender", gendershared);
                editor.putInt("pmhx", pmhxshared);
                editor.putInt("woke", wokeshared);
                editor.putInt("wellweekb4", wellweekb4shared);
                editor.putInt("medicaltransport", medicaltransportshared);
                editor.commit();
            }
        };
        return view2;
    }
}



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

public class Fragment1 extends Fragment {

    public Fragment1(){}
    private Button btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view1 = inflater.inflate(R.layout.fragment1,null);
       // btn2 = (Button)view1.findViewById(R.id.button6);

        View.OnClickListener listener0 = null;
        listener0 = new View.OnClickListener(){
            public void onClick(View v) {

                SharedPreferences fragmentpreferences = getActivity().getPreferences(Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = fragmentpreferences.edit();

                RadioGroup gender = (RadioGroup)getActivity().findViewById(R.id.gendergroup);
                int checkRadioButtonId_gender = gender.getCheckedRadioButtonId();
                int gendertrans = 0;
                switch (checkRadioButtonId_gender) {
                    case R.id.gender0:
                        gendertrans = 1;
                        break;
                    case R.id.gender1:
                        gendertrans = 0;
                        break;
                }

                RadioGroup pmhxchoose = (RadioGroup)getActivity().findViewById(R.id.pmhxgroup);
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

                RadioGroup wokechoose = (RadioGroup)getActivity().findViewById(R.id.wokegroup);
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

                RadioGroup wellweekb4choose = (RadioGroup)getActivity().findViewById(R.id.wellweekb4group);
                int checkRadioButtonId_wellweekb4= wellweekb4choose.getCheckedRadioButtonId();
                int wellweekb4shared = 0;
                switch (checkRadioButtonId_wellweekb4) {
                    case R.id.wellweekb4_y:
                        wellweekb4shared = 1;
                        break;
                    case R.id.wellweekb4_n:
                        wellweekb4shared = 0;
                        break;
                }

                RadioGroup medicaltransportchoose = (RadioGroup)getActivity().findViewById(R.id.medicaltransportgroup);
                int checkRadioButtonId_medicaltransport= medicaltransportchoose.getCheckedRadioButtonId();
                int medicaltransportshared = 0;
                switch (checkRadioButtonId_medicaltransport) {
                    case R.id.medicaltransport_y:
                        medicaltransportshared = 1;
                        break;
                    case R.id.medicaltransport_n:
                        medicaltransportshared = 0;
                        break;
                }

                editor.putInt("gender",gendertrans);
                editor.putInt("pmhx",pmhxshared);
                editor.putInt("woke",wokeshared);
                editor.putInt("wellweekb4",wellweekb4shared);
                editor.putInt("medicaltransport",medicaltransportshared);
                editor.commit();

           }
        };
       return view1;
    }

}

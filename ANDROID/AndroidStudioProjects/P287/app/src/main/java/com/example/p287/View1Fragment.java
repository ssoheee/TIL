package com.example.p287;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link View1Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link View1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class View1Fragment extends Fragment {

    Button bt4, bt5;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.fragment_view1, container, false);

        bt4 = vg.findViewById(R.id.button4);

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity main = new MainActivity();
                main.btc();
            }
        });

        bt5 = vg.findViewById(R.id.button5);
        tv = vg.findViewById(R.id.textView);

        return vg;
    }

    public void sett() {
        tv.setText("Main");
    }



}

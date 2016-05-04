package com.filipkesteli.navigationdrawerapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

   private Button btnOK;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //Napuhujemo java klasu s xml-om:
        View v = inflater.inflate(R.layout.fragment_blank, container,false); //kao setContentView
        initWidgets(v);  //sad na v mogu iskoristiti findVIewById(); moram se zakaciti na layout
        setupListeners();
        return v;
    }

    private void initWidgets(View v) {
        btnOK = (Button) v.findViewById(R.id.btnOK);
    }

    private void setupListeners() {
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentGoToNavigationDrawerActivity(v);
            }
        });
    }

    private void intentGoToNavigationDrawerActivity(View v) {
        Intent intent = new Intent(getActivity(), NavigationDrawerActivity.class);
        startActivity(intent);
    }
}
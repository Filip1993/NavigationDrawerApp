package com.filipkesteli.navigationdrawerapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {

    private Button btnSamoToastImportFragment;

    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_import, container, false);
        initWidgets(v);
        setupListeners();
        return v;
    }

    private void initWidgets(View v) {
        btnSamoToastImportFragment = (Button) v.findViewById(R.id.btnSamoToastImportFragment);
    }

    private void setupListeners() {
        btnSamoToastImportFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentGoToMainActivity();
            }
        });
    }

    private void intentGoToMainActivity() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);
    }
}

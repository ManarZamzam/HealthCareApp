package com.example.a3alegny.a3alegnyapp.Fragments.BottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a3alegny.a3alegnyapp.R;
import com.example.a3alegny.a3alegnyapp.activities.Clinics.ItemDetailActivity;

public class HomeActivity extends Fragment {

    private Button Emergency,Clinics,Pharmacies,Hospitals,LabsRadiology,Optics,MedicalEquipment;
    private ImageView logo;
    private TextView catego;
    private LinearLayout ImageButtons;
    private Context context=this.getContext();
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Emergency=view.findViewById(R.id.emergency);
        Clinics=view.findViewById(R.id.clinics);
        Pharmacies=view.findViewById(R.id.pharmacies);
        Hospitals=view.findViewById(R.id.hospitals);
        LabsRadiology=view.findViewById(R.id.labs);
        Optics=view.findViewById(R.id.optics);
        MedicalEquipment=view.findViewById(R.id.medicalequipment);
        logo=view.findViewById(R.id.logo);
        catego=view.findViewById(R.id.categories);



    }








    }

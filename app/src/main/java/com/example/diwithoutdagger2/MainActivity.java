package com.example.diwithoutdagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.diwithoutdagger2.schoolpakage.School;
import com.example.diwithoutdagger2.schoolpakage.difactory.SchoolFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDIWithoutDaggerFramework();
    }

    private void openDIWithoutDaggerFramework() {
        School school = SchoolFactory.getSchoolInstance();
        school.schoolInfo();
    }
}
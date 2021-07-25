package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class activity_studentlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentlogin);
    }
    public void openStudentDashboard(View v){
        Toast.makeText(this, "Opening Student Dashboard", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(this,
                activity_studentdash.class);
        startActivity(intent2);
    }
}
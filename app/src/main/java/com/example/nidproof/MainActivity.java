package com.example.nidproof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        btn1 = (Button) findViewById(R.id.btn1);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (et1.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this, "please enter data", Toast.LENGTH_SHORT);
                    } else {
                        String idNum = et1.getText().toString().toUpperCase().trim();

                        String JY = idNum.substring(0, 2);
                        String clgC = idNum.substring(2, 4);
                        Character dirOrLat = idNum.charAt(4);
                        String entry;
                        if (dirOrLat == '1') {
                            entry = "DIRECT ENTRY / EAMCET ";
                        } else {
                            entry = "LATERAL ENTRY / ECET ";
                        }
                        Character courseC = idNum.charAt(5);
                        String course = null;
                        if (courseC == 'A') {
                            course = "B.Tech";
                        } else if (courseC == 'D') {
                            course = "M.Tech";
                        } else if (courseC == 'E') {
                            course = "MBA";
                        } else if (courseC == 'F') {
                            course = "MCA";
                        } else if (courseC == 'R') {
                            course = "B.Pharm";
                        } else if (courseC == 'S') {
                            course = "M.Pharm";
                        } else if (courseC == 'T') {
                            course = "Pharm.D";
                        }
                        int branches = Integer.parseInt(idNum.toString().substring(6, 8));
                        String branch = null;
                        if (branches == 00) {
                            branch = "B.Pharm";
                        } else if (branches == 01) {
                            branch = "Civil Engineering";
                        } else if (branches == 02) {
                            branch = "Electrical & Electronics Engineering";
                        } else if (branches == 03) {
                            branch = " Mechanical Engineering";
                        } else if (branches == 04) {
                            branch = "Electronics & Communication Engineering";
                        } else if (branches == 05) {
                            branch = "Computer Science & Engineering";
                        } else if (branches == 8) {
                            branch = " Electronics & Instrumentation Engineering";
                        } else if (branches == 10) {
                            branch = " Electronics & Instrumentation Engineering";
                        } else if (branches == 11) {
                            branch = "Biomedical Engineering";
                        } else if (branches == 12) {
                            branch = "Information Technology";
                        } else if (branches == 13) {
                            branch = "Electronics & Control Engineering";
                        } else if (branches == 19) {
                            branch = " Electronics & Computer Engineering";
                        } else if (branches == 21) {
                            branch = "Aeronautical Engineering";
                        } else if (branches == 22) {
                            branch = " Instrumentation & Control Engineering";
                        } else if (branches == 23) {
                            branch = "Bio Technology";
                        }
                        int roll = Integer.parseInt(idNum.toString().substring(8, 10));
                        String text = "Year Of Joining :" + JY + "\n"
                                + "Degree:" + course +
                                "\n"
                                + "Branch:" + branch;


                        Intent intent = new Intent(MainActivity.this, Activity2.class);

                    intent.putExtra("data", text);
                    startActivity(intent);

                }}
            });


            }
    }

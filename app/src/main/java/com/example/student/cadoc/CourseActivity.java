package com.example.student.cadoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        final StoreParameters Store=new StoreParameters();
        Button select1 = findViewById(R.id.SelectButton1);
        Button select2 = findViewById(R.id.SelectButton2);
        Button select3 = findViewById(R.id.SelectButton3);

        select1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Store.SetCourse("Course1");
            }
        });
        select2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Store.SetCourse("Course2");
            }
        });
        select3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Store.SetCourse("Course3");
            }
        });
    }
}

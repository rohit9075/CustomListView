package com.rohit.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.rohit.customlistview.StudentAdapter.StudentListAdapter;
import com.rohit.customlistview.model.Student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {

            Student student = new Student();
            student.setName("ABC");
            student.setId("0012cs12035");
            student.setCity("Bangalore");

            studentList.add(student);

        }

        StudentListAdapter studentListAdapter = new StudentListAdapter(MainActivity.this,R.layout.item_list, studentList);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(studentListAdapter);

    }
}

package com.lau.GPACalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Window;
import android.widget.TextView;


public class CourseDialogActivity extends FragmentActivity {
    private final String TAG = "CourseDialogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = getIntent();
        Course course = (Course) i.getSerializableExtra("Course");


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_course_dialog);

        updateDialog(course);

    }

    // Update the dialog with the information from the selected course
    public void updateDialog(Course course) {

        // Get the value from the selected course
        String courseCode = course.getCourseCode();
        String courseGpa = String.valueOf(course.getGpaValue());
        String courseWeight = String.valueOf(course.getGpaWeight() / 2);

        final TextView CourseCodeTextView = (TextView) findViewById(R.id.course_code);
        final TextView CourseGpaTextView = (TextView) findViewById(R.id.gpa);
        final TextView CourseWeightTextView = (TextView) findViewById(R.id.course_weight);

        if (courseGpa.equals("-1.0"))
            courseGpa = "CR/NCR";

        Log.i(TAG, "Course GPA: " + courseGpa);
        Log.i(TAG, "Course Weight: " + courseWeight);

        CourseCodeTextView.setText(courseCode);
        CourseGpaTextView.setText("GPA: " + courseGpa);
        CourseWeightTextView.setText("Course Weight: " + courseWeight);

    }
}

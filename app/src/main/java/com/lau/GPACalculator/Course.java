package com.lau.GPACalculator;

import java.io.Serializable;

/**
 * Created by Lisa on 3/10/2015.
 */
public class Course implements Serializable {
    private final String TAG = "Course";


    private String courseCode;
    private double gpaWeight;
    private double gpaValue;
    private boolean creditNoCredit;

    // Constructor for Course object that stores the given course code, gpa weight and gpa value.
    public Course(String courseCode, double gpaWeight, double gpaValue, boolean creditNoCredit) {
        this.courseCode = courseCode;
        this.gpaWeight = gpaWeight;
        this.gpaValue = gpaValue;
        this.creditNoCredit = creditNoCredit;

    }

    // State if the credit no credit option is selected for the course
    // @return true if credit no credit is selected, false otherwise
    public boolean isCreditNoCredit() {
        return creditNoCredit;
    }

    // Get the course code
    // return the course code
    public String getCourseCode() {
        return courseCode;
    }

    // Get the gpa weight
    // Return the gpa weight
    public double getGpaWeight() {
        return gpaWeight;
    }

    // Get the gpa value
    // Return the gpa value
    public double getGpaValue() {
        return gpaValue;
    }
}

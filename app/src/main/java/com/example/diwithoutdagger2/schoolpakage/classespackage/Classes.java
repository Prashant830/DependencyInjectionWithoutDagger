package com.example.diwithoutdagger2.schoolpakage.classespackage;

import android.util.Log;

public class Classes {
    private Sections cSections;
    private Students cStudents;
    private Teachers cTeachers;
    public static String TAG = "Classes";

    //constructor Injection without Dagger
    public Classes(Sections cSections, Students cStudents, Teachers cTeachers) {
        this.cSections = cSections;
        this.cStudents = cStudents;
        this.cTeachers = cTeachers;
    }

    public void classesInfo(){
        Log.d(TAG, "classesInfo: In Classes there are Three Features are Exist-: \n");
        cSections.sectionsInfo();
        cStudents.studentsInfo();
        cTeachers.teachersInfo();
    }
}

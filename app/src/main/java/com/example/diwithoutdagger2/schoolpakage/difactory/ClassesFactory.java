package com.example.diwithoutdagger2.schoolpakage.difactory;

import com.example.diwithoutdagger2.schoolpakage.classespackage.Classes;
import com.example.diwithoutdagger2.schoolpakage.classespackage.Sections;
import com.example.diwithoutdagger2.schoolpakage.classespackage.Students;
import com.example.diwithoutdagger2.schoolpakage.classespackage.Teachers;

public class ClassesFactory {
    public static Classes getClasses(){
        return new Classes(new Sections(),new Students(),new Teachers());
    }
}

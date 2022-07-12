package com.example.diwithoutdagger2.schoolpakage.difactory;

import com.example.diwithoutdagger2.schoolpakage.School;

public class SchoolFactory {

    public static School getSchoolInstance(){
        return new School(PlayGroundFactory.getPlayGrounds(),ClassesFactory.getClasses());
    }
}

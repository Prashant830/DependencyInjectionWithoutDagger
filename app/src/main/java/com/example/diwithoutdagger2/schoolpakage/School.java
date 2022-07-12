package com.example.diwithoutdagger2.schoolpakage;

import android.util.Log;

import com.example.diwithoutdagger2.schoolpakage.classespackage.Classes;
import com.example.diwithoutdagger2.schoolpakage.playgroundspackage.PlayGrounds;

public class School {
    private PlayGrounds sPlayGrounds;
    private Classes sClasses;
    public static String TAG = "School";

    //constructor Injection without Dagger
    public School(PlayGrounds sPlayGrounds, Classes sClasses) {
        this.sPlayGrounds = sPlayGrounds;
        this.sClasses = sClasses;
    }

      public void schoolInfo(){
          Log.d(TAG, "schoolInfo: In School There are Two features Exist.\n");
          sPlayGrounds.playgroundInfo();
          sClasses.classesInfo();

      }
}

package com.example.diwithoutdagger2.schoolpakage.playgroundspackage;

import android.util.Log;

public class PlayGrounds {
    private CricketStadium pCricketStadium;
    private VolleyBallStadium pVolleyBallStadium;
    private BasketBallStadium pBasketBallStadium;
    public static String TAG = "PlayGrounds";

    //constructor Injection without Dagger
    public PlayGrounds(CricketStadium pCricketStadium, VolleyBallStadium pVolleyBallStadium,
                       BasketBallStadium pBasketBallStadium) {
        this.pCricketStadium = pCricketStadium;
        this.pVolleyBallStadium = pVolleyBallStadium;
        this.pBasketBallStadium = pBasketBallStadium;
    }

    public void playgroundInfo(){
        Log.d(TAG, "playgroundInfo: In playground there are three grounds Exist-: \n");
        pCricketStadium.cricketStadiumInfo();
        pVolleyBallStadium.volleyBallStadiumInfo();
        pBasketBallStadium.basketBallStadiumInfo();
    }

}

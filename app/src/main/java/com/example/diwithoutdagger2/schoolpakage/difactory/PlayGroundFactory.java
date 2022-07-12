package com.example.diwithoutdagger2.schoolpakage.difactory;

import com.example.diwithoutdagger2.schoolpakage.playgroundspackage.BasketBallStadium;
import com.example.diwithoutdagger2.schoolpakage.playgroundspackage.CricketStadium;
import com.example.diwithoutdagger2.schoolpakage.playgroundspackage.PlayGrounds;
import com.example.diwithoutdagger2.schoolpakage.playgroundspackage.VolleyBallStadium;

public class PlayGroundFactory {
    public static PlayGrounds getPlayGrounds(){
        return new PlayGrounds(new CricketStadium(),new VolleyBallStadium(),new BasketBallStadium());
    }
}

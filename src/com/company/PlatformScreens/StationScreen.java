package com.company.PlatformScreens;

import com.company.PlatformScreens.ScreenManager;

/**
 * Created by stevenstretton on 23/03/2016.
 */
public class StationScreen extends ScreenManager{

    ScreenManager screenManager = new ScreenManager();

    public void PrimaryDestination()
    {
        screenManager.CollectPrimaryDestination();
        System.out.println("...");
    }

    public void CallingRoutes()
    {
        screenManager.CollectCallingPoints();
        System.out.println("...");
    }

}

package com.company.PlatformScreens;

/**
 * Created by stevenstretton on 23/03/2016.
 */
public class StationScreen extends ScreenManager{

    ScreenManager screenManager = new ScreenManager();

    public void primaryDestination()
    {
        screenManager.CollectPrimaryDestination();
        System.out.println(CollectPrimaryDestination().toString());
        System.out.println("...");
    }

    public void callingRoutes()
    {
        screenManager.CollectCallingPoints();
        System.out.println(CollectCallingPoints().toString());
        System.out.println("...");
    }

}

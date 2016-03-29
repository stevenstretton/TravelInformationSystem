package com.company;

import com.company.PlatformScreens.ScreenManager;
import com.company.Platforms.DestinationProcesses;

import java.util.ArrayList;

public class Main extends DestinationProcesses{


    //Cant access objects outside of static methods.

    public static void main(String[] args) {

        DestinationProcesses destinationProcesses = new DestinationProcesses();
        ScreenManager screenManager = new ScreenManager();

        destinationProcesses.collectDestinationForPlatform();
        screenManager.destinationProcess(destinationProcesses.destinations);
        screenManager.goToStationScreen();

    }
}

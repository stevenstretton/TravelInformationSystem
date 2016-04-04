package com.company.PlatformScreens;

import com.company.Platforms.DestinationProcesses;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by stevenstretton on 23/03/2016.
 */
public class ScreenManager{

    private static ArrayList<String> destinationToDisplay = new ArrayList<String>();

    public void destinationProcess(HashMap<String, String> destinations) //Not receiving destinations
    {
        Set destinationSet = destinations.entrySet(); //Set is a collection that cannot contain duplicate elements
        Iterator destinationIterator = destinationSet.iterator(); //Iterator can check for any beginning and preceding elements

        while(destinationIterator.hasNext())
        {
            destinationToDisplay.add(destinationIterator.next().toString());
        }

        returnToDisplay(destinationToDisplay);
    }

    public ArrayList returnToDisplay(ArrayList destinationToDisplay)
    {
        return destinationToDisplay;
    }

    public String CollectPrimaryDestination()
    {
        String destinationsToScreen[] = new String[destinationToDisplay.size()];

        for(int i = 0; i < destinationToDisplay.size(); i++)
        {
            destinationsToScreen[i] = destinationToDisplay.get(i);
            destinationsToScreen[i].split("[=]");

        }

        return destinationsToScreen[0];
    }

    public ArrayList CollectCallingPoints()
    {
        ArrayList callingPointsToDisplay = new ArrayList();
        for(int index = 1; index < destinationToDisplay.size(); ++index)
        {
            String temporaryUnsortedDestination = destinationToDisplay.get(index);
            String temporarySortedDestination = temporaryUnsortedDestination.substring(0,temporaryUnsortedDestination.indexOf("="));
            callingPointsToDisplay.add(index - 1,temporarySortedDestination);
        }

        return callingPointsToDisplay;
    }

    public void goToStationScreen()
    {
        StationScreen stationScreen = new StationScreen();

        CollectPrimaryDestination();
        CollectCallingPoints();

        stationScreen.primaryDestination();
        stationScreen.callingRoutes();
    }

}

package com.company.PlatformScreens;

import com.company.Platforms.DestinationProcesses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by stevenstretton on 23/03/2016.
 */
public class ScreenManager extends DestinationProcesses{

    public ArrayList destinationToDisplay = new ArrayList();

    private Set destinationSet = destinations.entrySet(); //Set is a collection that cannot contain duplicate elements
    private Iterator destinationIterator = destinationSet.iterator(); //Iterator can check for any beginning and proceding elements

    public void destinationProcess()
    {
        while(destinationIterator.hasNext())
        {
            destinationToDisplay.add(destinationIterator.next());
        }
    }

    public String CollectPrimaryDestination()
    {
        String getDestination = (String)destinationToDisplay.get(0);

        return getDestination;
    }

    public ArrayList CollectCallingPoints()
    {
        ArrayList callingPointsToDisplay = new ArrayList();
        for(int index = 1; index < destinationToDisplay.size(); ++index)
        {
            callingPointsToDisplay.add(index - 1, destinationToDisplay.get(index));
        }

        return callingPointsToDisplay;
    }

    public void goToStationScreen()
    {
        StationScreen stationScreen = new StationScreen();
        stationScreen.primaryDestination();
        stationScreen.callingRoutes();
    }

}

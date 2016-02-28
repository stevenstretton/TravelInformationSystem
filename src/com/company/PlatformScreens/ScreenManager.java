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
    private Iterator destinationIterator = destinationSet.iterator(); //Iterator can check if the

    public void DestinationProcess()
    {
        while(destinationIterator.hasNext())
        {
            destinationToDisplay.add(destinationIterator.next());
        }
    }

    public void CollectPrimaryDestination()
    {

        String getDestination = (String)destinationToDisplay.get(0);

    }

    public void CollectCallingPoints()
    {
        String getCallingPoints;
        for(int index = 1; index < destinationToDisplay.size(); ++index)
        {

        }
    }

    public void SendDestinationToScreen()
    {

    }


}

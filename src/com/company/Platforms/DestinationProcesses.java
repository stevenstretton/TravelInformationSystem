package com.company.Platforms;

import com.company.Destinations.Stations;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by stevenstretton on 09/03/2016.
 */
public class DestinationProcesses {

    public HashMap<String, String> destinations = new HashMap<String, String>();

    public void collectDestinationForPlatform()
    {
        for(Stations eastbound: Stations.values())
        {
            destinations.put(eastbound.getStationName(), eastbound.getStationCode());
        }
    }

    public void sendDestinationToPlatformScreen()
    {

    }




}

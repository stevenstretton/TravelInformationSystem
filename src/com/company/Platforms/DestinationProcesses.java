package com.company.Platforms;

import com.company.Destinations.Stations;

import java.util.HashMap;


/**
 * Created by stevenstretton on 09/03/2016.
 */
public class DestinationProcesses {

    public HashMap<String, String> destinations = new HashMap<String, String>();

    public HashMap<String, String> collectDestinationForPlatform()
    {
        for(Stations eastbound: Stations.values())
        {
            destinations.put(eastbound.getStationName(), eastbound.getStationCode());
        }

        return destinations;
    }



}

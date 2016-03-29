package com.company.Platforms;

import com.company.Destinations.Stations;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by stevenstretton on 09/03/2016.
 */
public class DestinationProcesses {

    public HashMap<String, String> destinations = new LinkedHashMap<>();

    public HashMap<String, String> collectDestinationForPlatform()
    {
        for(Stations stations: Stations.values())
        {
            destinations.put(stations.getStationName(), stations.getStationCode());
        }

        return destinations;
    }

}

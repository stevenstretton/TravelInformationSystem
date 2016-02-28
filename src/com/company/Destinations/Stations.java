package com.company.Destinations;

import java.util.ArrayList;

/**
 * Created by stevenstretton on 27/02/2016.
 */
public class Stations {

    public void stations() {


    }

    public class getListOfStations() //Stores all the stations
    {
        ArrayList<String> stationNames = new ArrayList<String>();

        stationNames.add("Sheffield");
        stationNames.add("Darnall");
        stationNames.add("Kiverton Bridge");
        stationNames.add("Kiverton Park");
        stationNames.add("Shireoaks");
        stationNames.add("Worksop");
        stationNames.add("Retford Low Level");
        stationNames.add("Gainsbrough LR");
        stationNames.add("Saxilby");
        stationNames.add("Lincoln Central");

    }

    public class addSpaceToListOfStations(ArrayList<String> stationList) //Adds space and comma to station list.
    {
        String COMMA_SPACE = ", ";
        int arrayListKey;
        for(int i = 0; i < stationList.size(); i++)
        {
            arrayListKey = stationList.get(i);
            stationList.set(i, stationList + COMMA_SPACE);

        }

    }


}

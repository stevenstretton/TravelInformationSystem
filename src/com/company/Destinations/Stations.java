package com.company.Destinations;

/**
 * Created by stevenstretton on 27/02/2016.
 */
public enum Stations
{
    //Constants (which are also objects)
    SHEFFIELD("Sheffield", "SHF"),
    DARNAL("Darnal", "DAN"),
    WOODHOUSE("Woodhouse", "WDH"),
    KIVERTON_BRIDGE("Kiverton Bridge", "KIV"),
    KIVERTON_PARK("Kiverton Park", "KVP"),
    SHIREOAKS("Shireoaks", "SRO"),
    WORKSOP("Worksop", "WRK"),
    RETFORD("Retford", "RET"),
    GAINSBROUGH_LEA_ROAD("Gainsbrough Lea Road", "GBL"),
    SAXILBY("Saxilby", "SAX"),
    LINCOLN_CENTRAL("Lincoln Central", "LIN");

    //Variables to support the two arguments (in the Constants above)
    private final String stationName;
    private final String stationCode;

    //Constructor
    Stations(String stnName, String stnCode)
    {
        stationName = stnName;
        stationCode = stnCode;
    }

    //Returns the station name
    public String getStationName()
    {
        return stationName;
    }

    //Returns the station code
    public String getStationCode()
    {
        return stationCode;
    }
}

package com.dmbteam.cityguide.settings;

/**
 * Created by dobrikostadinov on 6/3/15.
 */
public class AppSettings {

    /**
     * Enable or disable ADMOB
     */
    public static final boolean ENABLE_ADMOB = true;

    /**
     * Define latitude of your location
     */
    public static double LATITUDE = 55.75648627;

    /**
     * Define longitude of your location
     */
    public static double LONGITUDE = 37.61444092;

    /**
     * Initial zoom of the map
     */
    public static final int MAP_INITIAL_ZOOM = 14;

    /**
     * Radius in meters for location searches
     */
    public static final int GOOGLE_PLACES_LOCATION_RADIUS = 1000;

    /**
     * Radius in meters for string searches
     */
    public static final int GOOGLE_PLACES_SEARCH_RADIUS = 10000;

    /**
     * City for the app
     */
    public static final String TOWN = "Moscow";

    /**
     * Country of the app
     */
    public static final String COUNTRY = "Russian";

    public static final String OPEN_WEATHER_MAP_KEY = "89ebea71c77e40358ff4b539ee3bb902";

    public static final String XMLResourcePath = "about.xml";

}

package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {

    private List<City> cities = new ArrayList<>();


    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void add(City city)
    {
        if (cities.contains(city))
        {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities()
    {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This will return the size of 'cities' i.e citylist if it's not empty.
     * @return
     */
    public int CountCities()
    {
        if(cities.isEmpty())
        {
            System.out.println("There are no cities.");
            //throw new IllegalArgumentException();
        }
        // when city list is not empty, return it's size.
        return cities.size();
    }

    /**
     * This will delete a specified city object
     */
    public void DeleteCity(City city)
    {
        if(cities.contains(city))
        {
            cities.remove(city);
        }
        else
        {
            System.out.println("The city doesn't exist.");
            //throw new IllegalArgumentException();
        }
    }

}

package com.example.simpleparadox.listycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    // Declare the variables so that you will be able to reference it later.
    ListView cityList;
    ArrayAdapter<City> cityAdapter;
    ArrayList<City> cityDataList;

    CustomList customList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = findViewById(R.id.city_list);

        String []cities ={"Edmonton", "Vancouver", "Toronto", "Hamilton", "Denver", "Los Angeles"};
        String []provinces = {"AB", "CD", "EF", "GH", "IJ", "KL"};

        cityDataList = new ArrayList<>();

        for(int i=0; i<cities.length; i++)
        {
            cityDataList.add((new City(cities[i], provinces[i])));
        }

        cityAdapter = new CustomList(this, cityDataList);
        cityList.setAdapter(cityAdapter);

        // ********************** finding the size of total cities *************************
        /*
        CityList cityListObj = new CityList();
        Integer totalCities;        // for citylist size

        totalCities = cityListObj.CountCities();
        System.out.println("\nTotal Cities: "+ totalCities);
        */

        // ********************** Removing a particular city *************************
        /*
        City obj1 = new City("Dhaka", "Agargao");
        City obj2 = new City("Khulna", "Fulbari");

        cityDataList.add(obj1);
        cityDataList.add(obj2);

        for(int i=0; i<cityDataList.size(); i++)
        {

        }
        int cityEquality = obj1.compareTo(obj2);

        if(cityEquality == 0)
        {
            cityListObj.DeleteCity(obj2);
        }
        else if(cityEquality > 0)
        {
            cityListObj.DeleteCity(obj2);
        }
        else{
            cityListObj.DeleteCity(obj1);
        }*/


    }
}

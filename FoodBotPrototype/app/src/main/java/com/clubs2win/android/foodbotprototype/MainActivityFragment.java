package com.clubs2win.android.foodbotprototype;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] foodsArray =
                { "Pasta","Bread", "Eggs", "Ketchup", "Fruits", "Cheese", "Basil" };


        List<String> foodsInFridge =
                new ArrayList<String> (Arrays.asList(foodsArray));

        ArrayAdapter<String> foodAdapter =
                new ArrayAdapter<String>(getActivity(),
                        R.layout.foods_fragment_textview,
                        R.id.foods_view,
                        foodsInFridge);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_foods);

        listView.setAdapter(foodAdapter);

        return rootView;
    }
}

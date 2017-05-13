package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by XY on 12.5.2017.
 */

public class SightseeingFragment extends Fragment {

    public SightseeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.sighteeing_1), getString(R.string.sightseeing_desc_1), R.drawable.number_one));
        locations.add(new Location(getString(R.string.sightseeing_2), getString(R.string.sightseeing_desc_2), R.drawable.number_two));
        locations.add(new Location(getString(R.string.sighteeing_3), getString(R.string.sightseeing_desc_3), R.drawable.number_three));
        locations.add(new Location(getString(R.string.sighteeing_4), getString(R.string.sightseeing_desc_4), R.drawable.number_four));
        locations.add(new Location(getString(R.string.sighteeing_1), getString(R.string.sightseeing_desc_1), R.drawable.number_one));
        locations.add(new Location(getString(R.string.sightseeing_2), getString(R.string.sightseeing_desc_2), R.drawable.number_two));
        locations.add(new Location(getString(R.string.sighteeing_3), getString(R.string.sightseeing_desc_3), R.drawable.number_three));
        locations.add(new Location(getString(R.string.sighteeing_4), getString(R.string.sightseeing_desc_4), R.drawable.number_four));
        locations.add(new Location(getString(R.string.sighteeing_1), getString(R.string.sightseeing_desc_1), R.drawable.number_one));
        locations.add(new Location(getString(R.string.sightseeing_2), getString(R.string.sightseeing_desc_2), R.drawable.number_two));
        locations.add(new Location(getString(R.string.sighteeing_3), getString(R.string.sightseeing_desc_3), R.drawable.number_three));
        locations.add(new Location(getString(R.string.sighteeing_4), getString(R.string.sightseeing_desc_4), R.drawable.number_four));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
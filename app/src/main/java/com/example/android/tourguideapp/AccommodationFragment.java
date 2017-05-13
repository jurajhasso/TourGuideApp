package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by XY on 12.5.2017.
 */

public class AccommodationFragment extends Fragment {

    public AccommodationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.accommodation_1), getString(R.string.accommodation_desc_1)));
        locations.add(new Location(getString(R.string.accommodation_2), getString(R.string.accommodation_desc_2)));
        locations.add(new Location(getString(R.string.accommodation_3), getString(R.string.accommodation_desc_3)));
        locations.add(new Location(getString(R.string.accommodation_4), getString(R.string.accommodation_desc_4)));
        locations.add(new Location(getString(R.string.accommodation_1), getString(R.string.accommodation_desc_1)));
        locations.add(new Location(getString(R.string.accommodation_2), getString(R.string.accommodation_desc_2)));
        locations.add(new Location(getString(R.string.accommodation_3), getString(R.string.accommodation_desc_3)));
        locations.add(new Location(getString(R.string.accommodation_4), getString(R.string.accommodation_desc_4)));
        locations.add(new Location(getString(R.string.accommodation_1), getString(R.string.accommodation_desc_1)));
        locations.add(new Location(getString(R.string.accommodation_2), getString(R.string.accommodation_desc_2)));
        locations.add(new Location(getString(R.string.accommodation_3), getString(R.string.accommodation_desc_3)));
        locations.add(new Location(getString(R.string.accommodation_4), getString(R.string.accommodation_desc_4)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
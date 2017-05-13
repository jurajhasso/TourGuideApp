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
        locations.add(new Location("Castle Hotel", "Castle Hotel"));
        locations.add(new Location("Humno Hotel", "Humno Hotel"));
        locations.add(new Location("Javorina Hotel", "Javorina Hotel"));
        locations.add(new Location("Katka Hotel", "Katka Hotel"));
        locations.add(new Location("Castle Hotel", "Castle Hotel"));
        locations.add(new Location("Humno Hotel", "Humno Hotel"));
        locations.add(new Location("Javorina Hotel", "Javorina Hotel"));
        locations.add(new Location("Castle Hotel", "Castle Hotel"));
        locations.add(new Location("Katka Hotel", "Katka Hotel"));
        locations.add(new Location("Humno Hotel", "Humno Hotel"));
        locations.add(new Location("Javorina Hotel", "Javorina Hotel"));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
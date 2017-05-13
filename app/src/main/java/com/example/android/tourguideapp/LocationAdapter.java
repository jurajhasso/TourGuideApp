package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationNameTextView = (TextView) listItemView.findViewById(R.id.location_name);

        locationNameTextView.setText(currentLocation.getLocationName());

        TextView locationDescriptionTextView = (TextView) listItemView.findViewById(R.id.location_description);

        locationDescriptionTextView.setText(currentLocation.getLocationDescription());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentLocation.hasImage()){
            iconView.setImageResource(currentLocation.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else{
            iconView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
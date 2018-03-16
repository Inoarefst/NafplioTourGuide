package com.example.android.nafpliotourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapterActivity extends ArrayAdapter<Place> {

    public PlaceAdapterActivity(Context context, ArrayList<Place> Place) {
        super(context, 0, Place);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
       Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name_text_view.
        TextView placeName = listItemView.findViewById(R.id.place_name_text_view);
        // Get the Place name from the currentPlace object and set this text on
        // the Place Name  TextView.
        placeName.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID description_text_view .
        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        // Get the description from the currentPlace object and set this text on
        // the description text view.
        descriptionTextView.setText(currentPlace.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this place or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}

package com.example.android.nafpliotourguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.ancient_assini), getString(R.string.anc_description), R.drawable.ancient_assini));
        places.add(new Place(getString(R.string.arvanitia), getString(R.string.arv_description), R.drawable.arvanitia));
        places.add(new Place(getString(R.string.karathona), getString(R.string.kar_description), R.drawable.karathona));
        places.add(new Place(getString(R.string.kondyli), getString(R.string.kon_description), R.drawable.kondyli));
        places.add(new Place(getString(R.string.plaka), getString(R.string.pla_description), R.drawable.plaka));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapterActivity adapter = new PlaceAdapterActivity(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);



        return rootView;
    }
}
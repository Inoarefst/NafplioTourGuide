package com.example.android.nafpliotourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CultureFragment extends Fragment {

    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.arch_museum), getString(R.string.arch_description), R.drawable.archaelogical_museum));
        places.add(new Place(getString(R.string.war_museum), getString(R.string.war_description), R.drawable.war_museum));
        places.add(new Place(getString(R.string.fol_museum), getString(R.string.fol_description), R.drawable.greek_folklore_museum));
        places.add(new Place(getString(R.string.palamidi), getString(R.string.pal_description), R.drawable.palamidi));
        places.add(new Place(getString(R.string.bourtzi), getString(R.string.bourtzi_description), R.drawable.bourtzi));
        places.add(new Place(getString(R.string.synd_square), getString(R.string.synd_description), R.drawable.syndagma_square));
        places.add(new Place(getString(R.string.Kapod_square), getString(R.string.kapod_description), R.drawable.kapodistrias_square));

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

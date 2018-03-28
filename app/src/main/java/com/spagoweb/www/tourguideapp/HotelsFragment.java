package com.spagoweb.www.tourguideapp;

/**
 * Created by Robe on 10/01/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.string.hotel_michelangelo_title, R.string.hotel_michelangelo_desc, R.drawable.villa_michelangelo));
        locations.add(new Location(R.string.hotel_marzio_title, R.string.hotel_marzio_desc, R.drawable.campo_marzio));
        locations.add(new Location(R.string.hotel_doge_title, R.string.hotel_doge_desc, R.drawable.hotel_doge));
        locations.add(new Location(R.string.hotel_benetti_title, R.string.hotel_benetti_desc, R.drawable.locanda_benetti));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
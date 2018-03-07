package com.example.muhamed_joe.tourguide;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Resturant_Activity extends Fragment {

    Tour_data resturant_data;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_resturant_activity, container, false);


        final ArrayList<Tour_data> RestList = new ArrayList();

        RestList.add(new Tour_data(getString(R.string.ColorFestival),getString(R.string.Qahra) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.DJAmrhaha),getString(R.string.Mansora) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.DJSlimahaha),getString(R.string.Qalub) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.DJjoehah),getString(R.string.Shben) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.CairokeRemix),getString(R.string.SahitelSawi) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.ColorFestival),getString(R.string.Qahra) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.DJAmrhaha),getString(R.string.Mansora) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.DJSlimahaha),getString(R.string.Qalub) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.DJjoehah),getString(R.string.Shben) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        RestList.add(new Tour_data(getString(R.string.CairokeRemix),getString(R.string.SahitelSawi) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));


        listView = (ListView) rootView.findViewById(R.id.Resturant_List_view);
        TourAdapter adapter = new TourAdapter(getActivity(), RestList, R.color.colorAccent);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tour_data resturant_data = RestList.get(position);
                Toast.makeText(getActivity(), resturant_data.getTour_name(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}


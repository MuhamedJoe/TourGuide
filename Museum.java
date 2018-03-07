package com.example.muhamed_joe.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Museum extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_museum, container, false);

        final ArrayList<Tour_data> museumlist= new ArrayList();
        museumlist.add(new Tour_data(getString(R.string.ColorFestival),getString(R.string.Qahra) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.DJAmrhaha),getString(R.string.Mansora) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.DJSlimahaha),getString(R.string.Qalub) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.DJjoehah),getString(R.string.Shben) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.CairokeRemix),getString(R.string.SahitelSawi) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.ColorFestival),getString(R.string.Qahra) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.DJAmrhaha),getString(R.string.Mansora) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.DJSlimahaha),getString(R.string.Qalub) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.DJjoehah),getString(R.string.Shben) ,getString(R.string._01241235112),R.drawable.cobra_museumws5));
        museumlist.add(new Tour_data(getString(R.string.CairokeRemix),getString(R.string.SahitelSawi) ,getString(R.string._01241235112) ,R.drawable.cobra_museumws5));


        ListView museum_LIstView = (ListView) rootView.findViewById(R.id.Resturant_List_view);
        TourAdapter adapter = new TourAdapter( getActivity() , museumlist, R.color.colorAccent);
        museum_LIstView.setAdapter(adapter);

        museum_LIstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Tour_data resturant_data = museumlist.get(position);
            }
        });

        return rootView;
    }
}

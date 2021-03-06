package com.abdelazim.x.aqardemo.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.aqardemo.OffersListAdapter;
import com.abdelazim.x.aqardemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView offersRV = view.findViewById(R.id.offersRV);
        offersRV.setLayoutManager(new LinearLayoutManager(getContext()));
        offersRV.setHasFixedSize(true);
        offersRV.setAdapter(new OffersListAdapter());
    }
}

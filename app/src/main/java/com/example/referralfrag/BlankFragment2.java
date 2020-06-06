package com.example.referralfrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        AtomicReference<View> view = new AtomicReference<>(inflater.inflate(R.layout.fragment_blank2, container, false));
        List<Integer>pic=new ArrayList<>();
        pic.add(R.drawable.ic_file_upload);
        pic.add(R.drawable.ic_file_upload);
        pic.add(R.drawable.ic_file_upload);

        RecyclerView recyclerView= view.get().findViewById(R.id.recycler2);
        Object layoutInflater = new Object();
        Object layoutInflater1 = new Object();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getActivity(), null, layoutInflater, pic, layoutInflater1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(recyclerAdapter);

        return view.get();
    }
}

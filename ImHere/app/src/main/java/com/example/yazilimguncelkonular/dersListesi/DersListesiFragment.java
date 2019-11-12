package com.example.yazilimguncelkonular.dersListesi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yazilimguncelkonular.R;

public class   DersListesiFragment  extends Fragment {
    RecyclerView recyclerView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.ders_listesi_fragment,container,false);


        recyclerView =view.findViewById(R.id.recy);
        DersListesiAdapter adapter=new DersListesiAdapter(getActivity());
        //B UNESNEYİ OLIŞTURDUĞUMDA yuzadapterindeki consrakçır çalışacakk
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);



        return view;
    }
}




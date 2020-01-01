package com.example.yazilimguncelkonular.dersListesi;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yazilimguncelkonular.Helper.Repository;
import com.example.yazilimguncelkonular.R;

public class   DersListesiFragment  extends Fragment {
    ListView listView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.ders_listesi_fragment,container,false);


        listView =view.findViewById(R.id.listDers);
        DersAdapter adapter=new DersAdapter(Repository.yoklamaResponse,getActivity());
        listView.setAdapter(adapter);

        return view;
    }
}




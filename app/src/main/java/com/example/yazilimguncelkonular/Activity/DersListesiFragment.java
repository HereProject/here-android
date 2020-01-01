package com.example.yazilimguncelkonular.Activity;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yazilimguncelkonular.Adapter.DersAdapter;
import com.example.yazilimguncelkonular.Helper.Repository;
import com.example.yazilimguncelkonular.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class DersListesiFragment extends Fragment {
    ListView listView;

    public DersListesiFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ders_listesi, container, false);

        listView = v.findViewById(R.id.listDers);
        DersAdapter adapter = new DersAdapter(Repository.yoklamaResponse, getActivity());
        listView.setAdapter(adapter);

        return v;
    }
}

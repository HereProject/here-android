package com.example.yazilimguncelkonular.dersListesi;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yazilimguncelkonular.Models.YoklamaResponse;
import com.example.yazilimguncelkonular.R;

import java.util.ArrayList;
import java.util.List;

public class DersAdapter extends BaseAdapter {

    List<YoklamaResponse> list;
    Context context;

    public DersAdapter(List<YoklamaResponse> list, Context context) {
        this.list = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        TextView dersAdi= convertView.findViewById(R.id.txtDersAdi);

        dersAdi.setText(""+list.get(position).getDers().getDersAdi());

        return convertView;
    }
}

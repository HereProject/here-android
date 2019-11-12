package com.example.yazilimguncelkonular.dersListesi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yazilimguncelkonular.ItemClickListener;
import com.example.yazilimguncelkonular.R;

import java.util.ArrayList;


public class DersListesiAdapter extends RecyclerView.Adapter<DersListesiAdapter.MyViewHolder> {
    ArrayList<DersListesiModel> mDataList;
    LayoutInflater inflater;
    Context context;

    public DersListesiAdapter(Context c) {
        //  inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //  inflater = LayoutInflater.from(context);
        this.context = c;
        mDataList = new ArrayList<>();
        Resources kaynak = c.getResources();
        int[] resimler = {
                R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo,
                R.drawable.logo, R.drawable.logo, R.drawable.logo, R.drawable.logo,
        };
        String[] dersler = kaynak.getStringArray(R.array.Dersler);
        String[] devamsizlik = kaynak.getStringArray(R.array.devamsisik);


        for (int i = 0; i < resimler.length; i++) {
            DersListesiModel gecici = new DersListesiModel();
            gecici.setImageID(resimler[i]);
            gecici.setBaslik(dersler[i]);
            gecici.setAciklama(devamsizlik[i]);

            mDataList.add(gecici);
        }

    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //elemanlar için inflater yapacak
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //tıklanilan ogenin pozisyonunu tutan metott

        DersListesiModel tiklanilanDersListesiModel = mDataList.get(position);
        holder.setData(tiklanilanDersListesiModel, position);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {

                if (isLongClick)
                    Toast.makeText(context, "fffff", Toast.LENGTH_SHORT).show();

                else {
                    Intent i = new Intent(context, icerikDersListesi.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("DersListesiModel", mDataList.get(position));
                    i.putExtras(bundle);
                    context.startActivity(i);
                    //    Toast.makeText(context, "long meralll" + mDataList.get(position), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        TextView mDersListesiBaslik;
        TextView mDevamsizlik;
        ImageView mImageView;
        private ItemClickListener itemClickListener;


        public MyViewHolder(View itemView) {
            super(itemView);

            mDersListesiBaslik = itemView.findViewById(R.id.text);
            mDevamsizlik=itemView.findViewById(R.id.devamsizlik);
            mImageView = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void setData(DersListesiModel tiklanilanDersListesiModel, int position) {
            this.mDersListesiBaslik.setText(tiklanilanDersListesiModel.getBaslik());
            this.mImageView.setImageResource(tiklanilanDersListesiModel.getImageID());
            this.mDevamsizlik.setText(tiklanilanDersListesiModel.getAciklama());
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;

        }

        @Override
        public void onClick(View v) {

            itemClickListener.onClick(v, getAdapterPosition(), false);
        }

        @Override
        public boolean onLongClick(View v) {
            itemClickListener.onClick(v, getAdapterPosition(), true);
            return true;
        }
    }


}
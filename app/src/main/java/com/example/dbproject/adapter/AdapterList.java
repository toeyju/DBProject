package com.example.dbproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.dbproject.R;
import com.example.dbproject.model.Potter;


import java.util.ArrayList;

/**
 * Created by RTA on 12/8/2017.
 */

public class AdapterList extends ArrayAdapter<Potter> {

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<Potter> mPictureItemList ;

    public AdapterList(@NonNull Context context, int layoutResId, @NonNull ArrayList<Potter> picItemList) {
        super(context, layoutResId, picItemList);

        this.mContext = context;
        this.mLayoutResId = layoutResId;
        this.mPictureItemList = picItemList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemLayout = inflater.inflate(mLayoutResId, null);

        Potter item = mPictureItemList.get(position);

        //ImageView picImageView = itemLayout.findViewById(R.id.pic);

        //picImageView.setImageResource(item.picture);

        return itemLayout;
    }
}



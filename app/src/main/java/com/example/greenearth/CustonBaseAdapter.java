package com.example.greenearth;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustonBaseAdapter extends BaseAdapter {
    Context context;
    String namelist[];
    int imagelist[];
    LayoutInflater inflater;
    public CustonBaseAdapter(Context ctx, String[]tipname,int [] tipimages){
        this.context = ctx;
        this.namelist = tipname;
        this.imagelist = tipimages;
        inflater = LayoutInflater.from(ctx);

    }
    @Override
    public int getCount() {
        return namelist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_listview,null);
        TextView txtview = (TextView) convertView.findViewById(R.id.textview);
        ImageView tipimg = (ImageView) convertView.findViewById(R.id.imageicon);
        txtview.setText(namelist[position]);
        tipimg.setImageResource(imagelist[position]);
        return convertView;

    }
}

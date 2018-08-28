package com.example.muhammad.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryAdapter extends BaseAdapter{

    Context context;
    String[] mCountryNames;
    int[] mFlags;
    private LayoutInflater inflater = LayoutInflater.from(context);

    public CountryAdapter(Context context, String[] mCountryNames, int[] mFlags) {
        this.context = context;
        this.mCountryNames = mCountryNames;
        this.mFlags = mFlags;
    }

    @Override
    public int getCount() {
        return mCountryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(R.layout.sample_view,null);

        }

        ImageView mImageView = (ImageView) view.findViewById(R.id.imageViewId);

        TextView mTextView = (TextView) view.findViewById(R.id.countryNameId);

        mImageView.setImageResource(mFlags[i]);
        mTextView.setText(mCountryNames[i]);

        return view;
    }
}

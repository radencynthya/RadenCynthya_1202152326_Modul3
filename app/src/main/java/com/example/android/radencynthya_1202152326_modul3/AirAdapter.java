package com.example.android.radencynthya_1202152326_modul3;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.bumptech.glide.Glide;
class AirAdapter extends RecyclerView.Adapter<AirAdapter.ViewHolder> {
    private ArrayList<Air> mAirData;
    private Context mContext;

    AirAdapter(Context context, ArrayList<Air> airData) {
        this.mAirData = airData;
        this.mContext = context;
    }
@Override
    public AirAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(AirAdapter.ViewHolder holder, int position) {
        //Get current sport
        Air currentAir = mAirData.get(position);
        //Populate the textviews with data
        holder.bindTo(currentAir);
    }

    @Override
    public int getItemCount() {
        return mAirData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        //Member Variables for the TextViews
        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView mSportsImage;
        private  Air mCurrentAir;
        private GradientDrawable mGradientDrawables;

        ViewHolder(View itemView) {
            super(itemView);
            mTitleText = (TextView) itemView.findViewById(R.id.title);
            mInfoText = (TextView) itemView.findViewById(R.id.subTitle);
            mSportsImage = (ImageView)itemView.findViewById(R.id.sportsImage);

        }

        void bindTo(Air currentAir) {
            //Populate the textviews with data
            mTitleText.setText(currentAir.getNamaAir());
            mInfoText.setText(currentAir.getInfo());

            mCurrentAir = currentAir;

            Glide.with(mContext).load(currentAir.getImageResource()).into(mSportsImage);

        }
    }
}
package com.proads.customads;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.proads.customads.Models.MoreAppsItem;

import java.util.List;

public class MoreAppsAdapter extends RecyclerView.Adapter<MoreAppsAdapter.ViewHolder> {

    Activity activity;
    List<MoreAppsItem> moreAppsItems;

    public MoreAppsAdapter(Activity activity, List<MoreAppsItem> moreAppsItems) {
        this.activity = activity;
        this.moreAppsItems = moreAppsItems;
    }

    @NonNull
    @Override
    public MoreAppsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(activity).inflate(R.layout.card_app,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoreAppsAdapter.ViewHolder holder, int position) {

        Glide.with(activity).load(moreAppsItems.get(position).getAppIcon()).into(holder.AppIcon);
        holder.AppName.setText(moreAppsItems.get(position).getAppName());
        holder.itemView.setOnClickListener(view -> {
            activity.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(moreAppsItems.get(position).getAppLink())));
        });
    }

    @Override
    public int getItemCount() {
        return moreAppsItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView AppIcon;
        TextView AppName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            AppIcon = itemView.findViewById(R.id.AppIcon);
            AppName = itemView.findViewById(R.id.AppName);
            AppName.setSelected(true);
        }
    }
}

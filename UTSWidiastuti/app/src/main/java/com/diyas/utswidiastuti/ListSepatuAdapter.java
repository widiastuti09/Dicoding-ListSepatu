package com.diyas.utswidiastuti;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListSepatuAdapter extends RecyclerView.Adapter<ListSepatuAdapter.ListViewHolder>{
    private OnItemClickCallback onItemClickCallback;

    private ArrayList<Sepatu> listsepatu;

    public ListSepatuAdapter(ArrayList<Sepatu> list) {
        this.listsepatu = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public ListSepatuAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sepatu, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListSepatuAdapter.ListViewHolder holder, int position) {
        Sepatu sepatu = listsepatu.get(position);
        Glide.with(holder.itemView.getContext())
                .load(sepatu.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(sepatu.getName());
        holder.tvDetail.setText(sepatu.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listsepatu.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listsepatu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.Sneakers);
            tvName = itemView.findViewById(R.id.item_name);
            tvDetail = itemView.findViewById(R.id.item_detail);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Sepatu data);
    }

}

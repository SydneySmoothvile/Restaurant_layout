package com.example.droidcaffev1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder> {
    private ArrayList<Store> storeData;
    private Context myContext;

    StoreAdapter(ArrayList<Store> mStoreData, Context context){
        this.myContext = context;
        this.storeData = mStoreData;
    }

    @NonNull
    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(myContext).inflate(R.layout.store_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull StoreAdapter.ViewHolder holder, int position) {
        Store currentStore = storeData.get(position);
        holder.bindTo(currentStore);

    }

    @Override
    public int getItemCount() {
        return storeData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView mStoreImage;
        private TextView mStoreTitle;
        private TextView mStoreDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mStoreImage = itemView.findViewById(R.id.store_image);
            mStoreTitle = itemView.findViewById(R.id.store_title);
            mStoreDescription = itemView.findViewById(R.id.store_description);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int storePosition = getAdapterPosition();
                    Store currentStore = storeData.get(storePosition);
                }
            });
        }

        public void bindTo(Store currentStore) {
            Glide.with(myContext).load(currentStore.getStoreImage()).into(mStoreImage);
            mStoreTitle.setText(currentStore.getStoreTitle());
            mStoreDescription.setText(currentStore.getStoreDescription());
        }
    }


}

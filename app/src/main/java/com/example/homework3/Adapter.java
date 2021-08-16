package com.example.homework3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

   private List<Model> list;

    public Adapter(List<Model> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.irem_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {


        int resource = list.get(position).getImage();
        String country = list.get(position).getName();
        String capital = list.get(position).getNameTwo();

        holder.onBind(resource, country, capital);

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                list.remove(position);
//                notifyDataSetChanged();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;
        private TextView textView2;

        public ViewHolder (View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageIm);
            textView = itemView.findViewById(R.id.nameTv);
            textView2 = itemView.findViewById(R.id.nameTwoTv);
        }

        public void onBind(int resource, String country, String capital) {
            imageView.setImageResource(resource);
            textView.setText(country);
            textView2.setText(capital);

        }
    }
}


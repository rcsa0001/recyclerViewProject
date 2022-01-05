package com.example.recyclerviewproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//generic adpter
public class UserAdapter  extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private  String[] data;
//    created an constructor
    public UserAdapter(String[] data) {
        this.data = data;
    }

//    override the method
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       Context context;
       LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       ViewGroup root;
       View v = inflater.inflate(R.layout.item_design, parent, false);
        return new UserViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        String name =  data[position];
//        String name1 = data[position + 1];

        holder.textview.setText(name);
//        holder.textview2.setText(name1);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }



//    Holder class
    public  class UserViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview;
        TextView textview, textview2,textview3,divider;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = (ImageView) itemView.findViewById(R.id.imageview1);
            textview = (TextView)  itemView.findViewById(R.id.textview);
            textview2 = (TextView)  itemView.findViewById(R.id.textview2);
            textview3 = (TextView)  itemView.findViewById(R.id.textview3);
            divider = (TextView)  itemView.findViewById(R.id.divider);
        }
    }
}

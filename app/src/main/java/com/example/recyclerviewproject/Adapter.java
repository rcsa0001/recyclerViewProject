package com.example.recyclerviewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

/**
 * This recycler view adapter
 */
public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList) {
        this.userList=userList;
    }


    /*@NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
       RecyclerView.ViewHolder viewHolder =  new Adapter.ViewHolder(userList);*/

    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        context = parent.getContext();
        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();
        return  new RecyclerView.ViewHolder(view);


    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
        int resource=userList.get(position).getImageview1();
        String name=userList.get(position).getTextview();
        String msg=userList.get(position).getTextview3();
        String time=userList.get(position).getTextview2();
        String line=userList.get(position).getDivider();

        holder.setData(resource,name,msg,time,line);

    }

    @Override
    public int getItemCount() {

        return userList.size();
    }

    public class viewHolder  extends RecyclerView.ViewHolder{
        private ImageView imageview;
        private TextView textview2;
        private TextView textview3;
        private TextView textview4;
        private  TextView divider;




        public viewHolder(@NonNull View itemView) {
            super(itemView);
           imageview=itemView.findViewById(R.id.imageview);
           textview4=itemView.findViewById(R.id.textview);
            textview2=itemView.findViewById(R.id.textview2);
            textview3=itemView.findViewById(R.id.textview3);
            divider=itemView.findViewById(R.id.divider);




        }

        public void setData(int resource, String name, String msg, String time, String line) {
            imageview.setImageResource(resource);
            textview4.setText(name);
            textview3.setText(msg);
            textview2.setText(time);
            divider.setText(line);
        }
    }
}

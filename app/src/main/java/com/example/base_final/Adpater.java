package com.example.base_final;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class Adpater extends RecyclerView.Adapter<Adpater.Viewholder> {

    private List<Modelclass> userlist;

    public Adpater (List<Modelclass> userlist){
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public Adpater.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adpater.Viewholder holder, int position) {
        int recursos = userlist.get(position).getImageview();
        String local = userlist.get(position).getTextview1();
        holder.setData(recursos,local);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.ImageView);
            textView = itemView.findViewById(R.id.textLocal);
            
        }

        public void setData(int recursos, String local) {
            imageView.setImageResource(recursos);
            textView.setText(local);
        }
    }
}

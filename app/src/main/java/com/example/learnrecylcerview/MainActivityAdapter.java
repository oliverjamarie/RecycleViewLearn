package com.example.learnrecylcerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.AdapterViewHolder> {
    String response;
    Context context;

    public MainActivityAdapter(Context context, String response){
        this.response = response;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.class_row,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
        Cours[] classes = (Cours[]) ClassJsonParser.parse(response).toArray();

        holder.id.setText(classes[position].getID());
        holder.title.setText(classes[position].getTitle());
        holder.desc.setText(classes[position].getDesc());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{
        TextView id;
        TextView title;
        TextView desc;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.idText_View);
            title = itemView.findViewById(R.id.titleText_View);
            desc = itemView.findViewById(R.id.descText_View);
        }
    }
}

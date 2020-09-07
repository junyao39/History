package com.example.history;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    
    private LayoutInflater layoutInflater;
    private List<String> titles;
    private List<String> author;
    private List<Integer> image;

    public Adapter(Context context,List<String>titles,List<String> author,List<Integer>image){
        this.titles = titles;
        this.author = author;
        this.image = image;
        this.layoutInflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
        View view = layoutInflater.inflate(R.layout.custom_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.textTitle.setText(titles.get(position));
        viewHolder.textAuthor.setText(author.get(position));
        viewHolder.image.setImageResource(image.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        
        TextView textTitle;
        TextView textAuthor;
        ImageView image;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitle =  itemView.findViewById(R.id.textTitle);
            textAuthor = itemView.findViewById(R.id.textAuthor);
            image = itemView.findViewById(R.id.bookImage);

            itemView.setClickable(true);
            itemView.setOnClickListener((View.OnClickListener)this);
        }
    }
}

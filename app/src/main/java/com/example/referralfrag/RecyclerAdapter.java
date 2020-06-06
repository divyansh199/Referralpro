package com.example.referralfrag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<Integer>pic;
    private LayoutInflater layoutInflater;

    RecyclerAdapter(FragmentActivity activity, LayoutInflater pic1, Object layoutInflater, List<Integer> pic, Object layoutInflater1) {
    }


    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v=layoutInflater.inflate(R.layout.recycler_profile,viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
    Integer pic1=pic.get(i);
    viewHolder.c.setImageResource(pic1);
    }

    @Override
    public int getItemCount() {
        return pic.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView c;
        ViewHolder(View itemView) {
            super(itemView);
            c=itemView.findViewById(R.id.image1);
        }
    }
}

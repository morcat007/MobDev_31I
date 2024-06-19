package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModuleAdapter extends RecyclerView.Adapter<ModuleAdapter.ModuleViewHolder> {

    private List<String> moduleNames;
    private List<Class<?>> moduleActivities;
    private Context context;

    public ModuleAdapter(List<String> moduleNames, List<Class<?>> moduleActivities, Context context) {
        this.moduleNames = moduleNames;
        this.moduleActivities = moduleActivities;
        this.context = context;
    }

    @NonNull
    @Override
    public ModuleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.module_item, parent, false);
        return new ModuleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModuleViewHolder holder, int position) {
        holder.moduleNameTextView.setText(moduleNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, moduleActivities.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return moduleNames.size();
    }

    public static class ModuleViewHolder extends RecyclerView.ViewHolder {
        TextView moduleNameTextView;

        public ModuleViewHolder(@NonNull View itemView) {
            super(itemView);
            moduleNameTextView = itemView.findViewById(R.id.textViewModule);
        }
    }
}

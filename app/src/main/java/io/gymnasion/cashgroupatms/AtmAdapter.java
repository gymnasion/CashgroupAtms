package io.gymnasion.cashgroupatms;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.gymnasion.cashgroupatms.data.Atm;

public class AtmAdapter extends RecyclerView.Adapter<AtmViewHolder> {

    private List<Atm> itemsList;

    public void setItemsList(List<Atm> atmsData) {
        this.itemsList = atmsData;
        notifyDataSetChanged();
    }

    @Override
    public AtmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.recycler_view_item, parent, false);
        return new AtmViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AtmViewHolder holder, int position) {
        Atm atm = itemsList.get(position);
        holder.bind(atm);
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}

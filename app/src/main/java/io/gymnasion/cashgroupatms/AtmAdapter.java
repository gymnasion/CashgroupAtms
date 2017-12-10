package io.gymnasion.cashgroupatms;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AtmAdapter extends RecyclerView.Adapter<AtmViewHolder> {

    private List<String> itemsList;

    public void setItemsList(List<String> atmsData) {
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
        String name = itemsList.get(position);

        holder.bankName.setText("Bank name" + name);
        holder.distance.setText("400km");
        holder.addressFirstLine.setText("Random Street 23");
        holder.addressSecondLine.setText("10395, Berlin");
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}

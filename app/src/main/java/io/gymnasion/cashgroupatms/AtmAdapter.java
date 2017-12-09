package io.gymnasion.cashgroupatms;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.gymnasion.cashgroupatms.AtmViewHolder;

public class AtmAdapter extends RecyclerView.Adapter<AtmViewHolder> {

    private List<String> atmsList;



    // Provide a suitable constructor (depends on the kind of dataset)
    public AtmAdapter(List<String> atmsData) {
        setAtmsList(atmsData);
    }

    public void setAtmsList(List<String> atmsData) {
        this.atmsList = atmsData;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AtmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.recycler_view_item, parent, false);
        return new AtmViewHolder(itemView);
    }

    // Replace the contents of a view (invoked by the layout manager)
    // With dummy data for now
    @Override
    public void onBindViewHolder(AtmViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        String name = atmsList.get(position);
        holder.bankName.setText("Bank name" + name);
        holder.distance.setText("400km");
        holder.addressFirstLine.setText("Random Street 23");
        holder.addressSecondLine.setText("10395, Berlin");
    }

    @Override
    public int getItemCount() {
        return atmsList.size();
    }
}

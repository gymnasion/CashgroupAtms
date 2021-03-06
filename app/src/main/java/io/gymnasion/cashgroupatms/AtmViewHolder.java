package io.gymnasion.cashgroupatms;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.gymnasion.cashgroupatms.data.Atm;

public class AtmViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.bank_name) TextView bankName;
    @BindView(R.id.distance) TextView distance;
    @BindView(R.id.address_first_line) TextView addressFirstLine;
    @BindView(R.id.address_second_line) TextView addressSecondLine;

    public AtmViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void bind(Atm atm) {
        bankName.setText(atm.bank.name);
        distance.setText("400km");
        addressFirstLine.setText(atm.street);
        String secondLine = atm.zip + " " + atm.city.name;
        addressSecondLine.setText(secondLine);
    }
}

package fr.esilv.jcdecaux.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fr.esilv.jcdecaux.R;
import fr.esilv.jcdecaux.interfaces.OnContractSelectedListener;
import fr.esilv.jcdecaux.models.Contract;

public class ContractsViewHolder extends RecyclerView.ViewHolder {

	private TextView name;
	private TextView contract_name;
	private OnContractSelectedListener onContractSelectedListener;

	public ContractsViewHolder(View itemView) {
		super(itemView);
		name = (TextView) itemView.findViewById(R.id.name);
		contract_name = (TextView) itemView.findViewById(R.id.contract_name);
	}

	public void bind(final Contract contract) {
		name.setText(contract.getName());
		contract_name.setText(contract.getCommercial_name());
		itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (onContractSelectedListener == null) {
					return;
				}
				onContractSelectedListener.onContractSelected(contract);
			}
		});
	}

	public void setOnContractSelectedListener(OnContractSelectedListener onContractSelectedListener) {
		this.onContractSelectedListener = onContractSelectedListener;
	}
}

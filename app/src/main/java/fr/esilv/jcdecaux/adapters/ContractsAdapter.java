package fr.esilv.jcdecaux.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.esilv.jcdecaux.R;
import fr.esilv.jcdecaux.interfaces.OnContractSelectedListener;
import fr.esilv.jcdecaux.models.Contracts;
import fr.esilv.jcdecaux.viewholders.ContractsViewHolder;

public class ContractsAdapter extends RecyclerView.Adapter<ContractsViewHolder> {

	private final Contracts contracts;
	private OnContractSelectedListener onContractSelectedListener;

	public ContractsAdapter(Contracts contracts) {
		this.contracts = contracts;
	}

	@Override
	public ContractsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_contract, parent, false);
		return new ContractsViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ContractsViewHolder holder, int position) {
		holder.setOnContractSelectedListener(onContractSelectedListener);
		holder.bind(contracts.get(position));
	}

	@Override
	public int getItemCount() {
		return contracts != null ? contracts.size() : 0;
	}

	public void setOnContractSelectedListener(OnContractSelectedListener onContractSelectedListener) {
		this.onContractSelectedListener = onContractSelectedListener;
	}
}

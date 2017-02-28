package fr.esilv.jcdecaux.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.esilv.jcdecaux.R;
import fr.esilv.jcdecaux.models.Contracts;
import fr.esilv.jcdecaux.models.Stations;
import fr.esilv.jcdecaux.viewholders.ContractsViewHolder;
import fr.esilv.jcdecaux.viewholders.StationsViewHolder;

public class StationsAdapter extends RecyclerView.Adapter<StationsViewHolder> {

	private final Stations stations;

	public StationsAdapter(Stations stations) {
		this.stations = stations;
	}

	@Override
	public StationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_station, parent, false);
		return new StationsViewHolder(view);
	}

	@Override
	public void onBindViewHolder(StationsViewHolder holder, int position) {
		holder.bind(stations.get(position));
	}

	@Override
	public int getItemCount() {
		return stations != null ? stations.size() : 0;
	}
}

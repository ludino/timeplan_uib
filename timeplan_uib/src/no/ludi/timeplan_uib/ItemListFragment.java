package no.ludi.timeplan_uib;

import com.google.android.maps.ItemizedOverlay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemListFragment extends Fragment {
	public static final String EMNE_NAVN = "emne_navn";

	private TimeplanConnectionProvider tProvider;

	public interface TimeplanConnectionProvider {
		public TimeplanConnection getTimeplanConnection();
	}

	public ItemListFragment() {
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			tProvider = (TimeplanConnectionProvider) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString() + " must implement TimeplanConnectionProvider");
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		String emne = getArguments().getString(EMNE_NAVN);
		View rootView = inflater.inflate(R.layout.fragment_item_list, container, false);
		LinearLayout itemList = (LinearLayout) rootView.findViewById(R.id.itemList);
		TimeplanConnection T = tProvider.getTimeplanConnection();
		Context ctx = getActivity();
		Fag f = T.getEmne(emne);
		f.draw(itemList, ctx);
		return rootView;
	}
}

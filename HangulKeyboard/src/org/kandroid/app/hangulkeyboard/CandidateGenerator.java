package org.kandroid.app.hangulkeyboard;

import java.util.ArrayList;
import java.util.List;

import android.os.AsyncTask;

public class CandidateGenerator extends AsyncTask<Void, Void, List<String>> {

	public interface OnPostListener {
		
		public void onPostExcute (List<String> res, boolean valid);
	}
	
	private List<String> array;
	private OnPostListener l;
	private boolean valid;
	
	public CandidateGenerator (List<String> arr, boolean valid, OnPostListener l) {
		
		super ();
		
		array = arr;
		this.valid = valid;
		this.l = l;
	}
	
	@Override
	protected List<String> doInBackground(Void... params) {

		List<String> rtn = new ArrayList<String>();

		rtn.add(array.get(0) + "1");
		rtn.add(array.get(0) + "2");
		rtn.add(array.get(0) + "3");
		rtn.add(array.get(0) + "4");
		rtn.add(array.get(0) + "5");
		
		return rtn;
	}

	@Override
	protected void onPostExecute(List<String> result) {

		l.onPostExcute(result, valid);
	}

}

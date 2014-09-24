package com.wingerted.criminalintent;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by Winger on 2014/9/25.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crime_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();
    }

}

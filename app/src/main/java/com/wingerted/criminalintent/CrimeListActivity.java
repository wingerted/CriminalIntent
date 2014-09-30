package com.wingerted.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by wingerted on 14/9/25.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

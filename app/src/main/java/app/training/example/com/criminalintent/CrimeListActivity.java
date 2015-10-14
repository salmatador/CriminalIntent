package app.training.example.com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Micah on 10/14/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

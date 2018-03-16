package com.example.android.nafpliotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CultureFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else {
            return new BeachFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.CultureTab);
        } else if (position == 1) {
            return mContext.getString(R.string.FoodTab);
        } else if (position == 2) {
            return mContext.getString(R.string.HotelsTab);
        } else {
            return mContext.getString(R.string.BeachTab);
        }
    }
}


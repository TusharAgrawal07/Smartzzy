package com.example.diucity.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

import com.example.diucity.R;
import com.example.diucity.Travel.EductionFragment;
import com.example.diucity.Travel.MallsFragment;
import com.example.diucity.Travel.TouristFragment;


@SuppressWarnings("ALL")
public class ListAdapter extends FragmentPagerAdapter {
    private Context thisContext;
    private int currentPos = -1;

    public ListAdapter(Context context, FragmentManager fm) {
        super(fm);
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.addToBackStack(null);
        transaction.commit();
        thisContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            currentPos = 0;
            return new TouristFragment();
        } else if (position == 1) {
            currentPos = 1;
            return new EductionFragment();
        }  else
            currentPos = 2;
        return new MallsFragment();
    }


    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return thisContext.getString(R.string.category_name_Tourist);
        } else if (position == 1) {
            return thisContext.getString(R.string.category_name_Eduction);
        }  else if (position == 2) {
            return thisContext.getString(R.string.category_name_Malls);
        } else {
            return "";
        }
    }

}

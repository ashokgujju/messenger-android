package com.as.schat;

import java.util.Locale;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v13.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter{

	protected Context mContext;
	
	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		switch(position) {
			case 0:
				return new InboxFragment();
			case 1:
				return new FriendsFragment();
		}
	return null;

	}

	@Override
	public int getCount() {
		// Show 2 total pages.
		return 2;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return mContext.getString(R.string.title_section1).toUpperCase(l);
		case 1:
			return mContext.getString(R.string.title_section2).toUpperCase(l);
		}
		return null;
	}
}

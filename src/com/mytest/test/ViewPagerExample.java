package com.mytest.test;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
 
public class ViewPagerExample extends FragmentActivity {
    private MyAdapter mAdapter;
    private ViewPager mPager;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdapter = new MyAdapter(getSupportFragmentManager());
 
        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);
        //mPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }
 
    public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }
 
        @Override
        public int getCount() {
            return 10;
        }
 
        @Override
        public Fragment getItem(int position) {
            switch (position) {
            case 0:
                return new DetailFragment();
            case 1:
                return new ImageFragment(R.drawable.ic_launcher);
            case 2:
                return new ImageFragment(R.drawable.ic_launcher);
 
            default:
                return new DetailFragment();
            }
        }
    }
}
	
	
	


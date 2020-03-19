package co.kr.tjoeun.helloworld.a20200319_02_fragment02.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import co.kr.tjoeun.helloworld.a20200319_02_fragment02.fragments.ChickenStoreFragment;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.fragments.RoomListFragment;

public class MainViewPagerAdapter extends FragmentPagerAdapter {

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "닭집";
        }else{
            return "방";
        }
    }

    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new ChickenStoreFragment();
        }
        else {
            return new RoomListFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}

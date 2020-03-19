package co.kr.tjoeun.helloworld.a20200319_02_fragment02.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import co.kr.tjoeun.helloworld.a20200319_02_fragment02.R;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.databinding.FragmentChikenStoreBinding;

public class ChickenStoreFragment extends Fragment {

    FragmentChikenStoreBinding binding = null;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chiken_store, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

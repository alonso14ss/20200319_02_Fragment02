package co.kr.tjoeun.helloworld.a20200319_02_fragment02.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import co.kr.tjoeun.helloworld.a20200319_02_fragment02.R;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.adapters.ChickenAdapter;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.databinding.FragmentChikenStoreBinding;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.datas.ChickenStore;

public class ChickenStoreFragment extends Fragment {

    List<ChickenStore> chickenStoreList = new ArrayList<>();

    ChickenAdapter Adapter = null;


    FragmentChikenStoreBinding binding = null;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chiken_store, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Adapter = new ChickenAdapter(getActivity(),R.layout.chicken_store_list_item, chickenStoreList);

        binding.chickenListView.setAdapter(Adapter);

        chickenStoreList.add(new ChickenStore("굽네"));
        chickenStoreList.add(new ChickenStore("굽네"));
        chickenStoreList.add(new ChickenStore("굽네"));
        chickenStoreList.add(new ChickenStore("굽네"));
        chickenStoreList.add(new ChickenStore("굽네"));

        Adapter.notifyDataSetChanged();

    }
}

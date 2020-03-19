package co.kr.tjoeun.helloworld.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.zip.Inflater;

import co.kr.tjoeun.helloworld.a20200319_02_fragment02.R;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.datas.ChickenStore;

public class ChickenAdapter extends ArrayAdapter<ChickenStore> {

    Context mContext;
    List<ChickenStore> mList;
    LayoutInflater inf;

    public ChickenAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.chicken_store_list_item, null);
        }

        ChickenStore chickenStore = mList.get(position);

        TextView chickenList = row.findViewById(R.id.chickenName);
        chickenList.setText(chickenStore.getStoreName());

        return row;
    }
}

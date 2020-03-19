package co.kr.tjoeun.helloworld.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import co.kr.tjoeun.helloworld.a20200319_02_fragment02.R;
import co.kr.tjoeun.helloworld.a20200319_02_fragment02.datas.Room;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext; //어느 화면에서 어댑터를 쓰는지 보관
    List<Room> mList; // 방 목록 보관
    LayoutInflater inflater; //xml을 갖고 객체와 담당 클래스

    public RoomAdapter(@NonNull Context context, int resource, @NonNull List<Room> objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inflater = LayoutInflater.from(mContext);
    }

//    getview : 각각의 줄을 그려주는 메소드
//    실행되려만다 몇번 줄을 그려오는지 =
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
        View row = convertView; //

        if(row==null){
            row = inflater.inflate(R.layout.room_resouce_item, null);
        }

        return row; // row변수에 담긴xml을 화면에 뿌려
    }
}

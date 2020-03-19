package co.kr.tjoeun.helloworld.a20200319_02_fragment02.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
//    화면에 나타나야하는 줄을 그릴때마다 실행됨(스크롤 시에도 형향)
//    실행되려만다 몇번 줄을 그려오는지 = position
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if(row==null){
            Log.d("row==null 상황",position+"번줄");
            row = inflater.inflate(R.layout.room_resouce_item, null);
        }

//        뷰를 새로 그리건 / 돌려막건 내용은 항상 반영해줘야함
//        if문 밖에서 내용 반영 코드 작성

//        반영 근거 데이터 변수를 mList에서 가져오자
//        => position을 이용해서 가져옴
        Room room = mList.get(position);

//        XML => 데이터 반영. findviewbyid
//        recylerView = 데이터 바인딩 처럼활용기능 제공
//        Listview = > 직접 find.... 로 연결
        TextView priceTxt = row.findViewById(R.id.priceTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);

        addressTxt.setText(room.getAddress());
        priceTxt.setText(String.format("%,d만원",room.getPrice()));
//        반영이 끝난 row를 화면에 뿌리도록 결과로 지적

        return row; // row변수에 담긴xml을 화면에 뿌려
    }
}

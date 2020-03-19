package co.kr.tjoeun.helloworld.a20200319_02_fragment02.datas;

import java.io.Serializable;

public class Room implements Serializable {

//    가격, 주소만 표현
    private int price;
    private String address;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room(int price, String address) {
        this.price = price;
        this.address = address;
    }



}

package com.hgkj.modal.entity;

import java.util.ArrayList;
import java.util.List;

public class RestMenusList {
    List<RetMenus> list=new ArrayList <>();
    private  int goodNumber=1;
    public  int getGoodNumber(){return  goodNumber;}
    public  void  setGoodNumber(int goodNumber){this.goodNumber=goodNumber;}
    public  List<RetMenus> getList(){return list;}
    public  void  setList(List<RetMenus> list){this.list=list;}
}

package com.hgkj.model.dao;

import com.hgkj.model.entity.Tcustomer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TcustomerMapper {
    int deleteCmd(Integer id);
     List<Tcustomer> selecteAllCmd();
    int insertCmd(Tcustomer record);
    Tcustomer selectById(Integer id);
    int updateCmd(Tcustomer record);
    List<Tcustomer> selectLike(String name);
    List<Tcustomer> selectFenYe(@Param("index") Integer index,@Param("pageSize") Integer pageSize);
}
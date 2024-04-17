package com.hgkj.model.dao;

import com.hgkj.model.entity.Author;

public interface AuthorMapper {
    /*int deleteByPrimaryKey(Integer id);*/

   public int insertAuthor(Author author);

   /* int insertSelective(Author record);

    Author selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);*/
}
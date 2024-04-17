package com.hgkj.model.dao;

import com.hgkj.model.entity.Blog;

public interface BlogMapper {
    public Blog selectBlogById(Integer id);
    public int insertBlog(Blog blog);


   /* int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKey(Blog record);*/
}
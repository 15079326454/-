package com.zlq.dao;


import com.zlq.entity.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //    插入数据
    int addBook(Blog blog);

    //查询博客
    List<Blog> queryBlogIf(Map map);

    List<Blog> queryBlogChoose(Map map);

    //查询第1,2,3的号记录的博客
    List<Blog> queryBlogForeach(Map map);

    //更新博客
    int updateBlog(Map map);


}
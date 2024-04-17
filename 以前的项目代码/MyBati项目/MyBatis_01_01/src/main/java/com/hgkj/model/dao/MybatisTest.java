package com.hgkj.model.dao;
import com.hgkj.model.entity.Author;
import com.hgkj.model.entity.Blog;
import com.hgkj.model.entity.Comment;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void test2() {
        //*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = blogMapper.selectBlogById(1);
        System.out.println("作者:"+blog.getAuthor().getUsername());
        System.out.println("标题:" + blog.getTitle());
        System.out.println("内容：" + blog.getContent());
        System.out.println("时间：" + blog.getCreateTime());
        System.out.println("类型：" + blog.getType());
        System.out.println(blog.getAuthor().getUsername());
        System.out.println("===============评论===================");
       for (Comment comment:blog.getComments()){
           System.out.println(comment.getContent()+"---"+comment.getCommentdate());
       }
    }
    @Test
    public void inserttest() {
        //*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        AuthorMapper authorMapper=sqlSession.getMapper(AuthorMapper.class);
        //*创建对象*//*
        Author author=new Author("rose","123","rose@qq.com","湖北","123432");
        Blog blog = new Blog("多对一","多对一的简单操作","2019-7-11","笔记",author);
        //*将内容添加至数据库*//*
        authorMapper.insertAuthor(author);
        blogMapper.insertBlog(blog);
        //*事务提交*//*
        sqlSession.commit();
        //*关闭SqlSession*//*
        sqlSession.close();
    }



/*    *//*添加内容*//*
    @Test
    public void inserttest() {
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        *//*创建对象*//*
        Blog blog = new Blog();
        *//*设置对象的内容*//*
        blog.setTitle("国庆节");
        blog.setContent("什么时候六一儿童节？");
        blog.setCreateTime("2019-10-1");
        blog.setType("科普");
        *//*将内容添加至数据库*//*
        int rowNum = blogMapper.insert(blog);
        System.out.println("rowNum=" + rowNum);
        System.out.println("编号:"+blog.getId());
        *//*事务提交*//*
        sqlSession.commit();
        *//*关闭SqlSession*//*
        sqlSession.close();
    }
    *//*根据指定Id查找相应内容*//*
    @Test
    public void test2(){
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=blogMapper.selectById(2);
        System.out.println("标题:"+blog.getTitle());
        System.out.println("内容："+blog.getContent());
        System.out.println("时间："+blog.getCreateTime());
        System.out.println("类型："+blog.getType());
    }
    *//*查询所有*//*
    @Test
    public void selectAlltest(){
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList=blogMapper.selectAllBlog();
        for (Blog blog:blogList){
            System.out.println("标题:"+blog.getTitle());
            System.out.println("内容："+blog.getContent());
            System.out.println("时间："+blog.getCreateTime());
            System.out.println("类型："+blog.getType());
            System.out.println("==================================");
        }

    }
//模糊查询
    @Test
    public void selectLiketest(){
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList=blogMapper.selectLike("儿");
        for (Blog blog:blogList){
            System.out.println("标题:"+blog.getTitle());
            System.out.println("内容："+blog.getContent());
            System.out.println("时间："+blog.getCreateTime());
            System.out.println("类型："+blog.getType());
            System.out.println("==================================");
        }

    }
*//*修改指定内容*//*
    @Test
    public void updatetest(){
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog=blogMapper.selectById(2);
       blog.setContent("搭建MyBatis框架很简单");
       int rowNum=blogMapper.updateBlog(blog);
        System.out.println("rowNum="+rowNum);
        sqlSession.commit();
        sqlSession.close();
    }
*//*删除指定内容*//*
    @Test
    public void deletetest(){
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        int rowNum=blogMapper.deleteBlog(2);
        System.out.println("rowNum="+rowNum);
        sqlSession.commit();
        sqlSession.close();
    }
    *//*分页查询*//*
    @Test
    public void blogFenYetest(){
        *//*得到SqlSession*//*
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        *//*实例化接口*//*
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        int pageIndex=2;
        int pageSize=2;
        List<Blog> blogList=blogMapper.selectFenYe((pageIndex-1)*pageSize,pageSize);
        for (Blog blog:blogList){
            System.out.println("标题:"+blog.getTitle());
            System.out.println("内容："+blog.getContent());
            System.out.println("时间："+blog.getCreateTime());
            System.out.println("类型："+blog.getType());
            System.out.println("-------------------------------------");
        }*/




}

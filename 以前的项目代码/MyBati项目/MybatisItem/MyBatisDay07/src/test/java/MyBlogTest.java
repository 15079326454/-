import com.zlq.dao.BlogMapper;
import com.zlq.entity.Blog;
import com.zlq.until.IdUtils;
import com.zlq.until.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyBlogTest {
    @Test
    public void addBookTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(234234);

        blogMapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("java如此简单");
        blogMapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("Spring如此简单");
        blogMapper.addBook(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("微服务如此简单");
        blogMapper.addBook(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlogIfTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();

//        hashMap.put("title","java如此简单");
        hashMap.put("author", "狂神说");

        List<Blog> blogs = mapper.queryBlogIf(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void queryBlogChooseTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", "java如此简单");

        hashMap.put("views", "234234");

        mapper.queryBlogChoose(hashMap);
        List<Blog> blogs = mapper.queryBlogIf(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
//        hashMap.put("title", "java如此简单2");
        hashMap.put("author", "狂神说2");
        hashMap.put("id", "9c71017a5abf403981edfa2c6eb0e0a8");
        mapper.updateBlog(hashMap);

        sqlSession.close();
    }

    @Test
    public void queryBlogForeachTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<Object, Object> hashMap = new HashMap<>();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        hashMap.put("ids", ids);
        List<Blog> blogList = mapper.queryBlogForeach(hashMap);
        for (Blog blog : blogList) {
            System.err.println(blog);
        }
        sqlSession.close();
    }
}

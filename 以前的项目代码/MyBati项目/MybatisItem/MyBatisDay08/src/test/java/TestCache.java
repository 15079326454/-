import com.zlq.dao.UserMapper;
import com.zlq.entity.User;
import com.zlq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestCache {
    @Test
    public void queryUserByIdTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.err.println(user);

//        mapper.updateUser(new User(2,"kek","123","34","24324"));
//        手动清除缓存
        sqlSession.clearCache();

        System.out.println("=============================");

        User user2 = mapper.queryUserById(1);
        System.err.println(user2);

        System.out.println(user == user2);
        sqlSession.close();
    }

    //    测试二级缓存
    @Test
    public void queryUserByIdTest2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.err.println(user);
        sqlSession.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUserById(1);
        System.err.println(user2);

        System.err.println(user==user2);
        sqlSession2.close();
    }
}

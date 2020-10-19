import com.mybatis.dao.UserMapper;
import com.mybatis.pojo.User;
import com.mybatis.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void getUserByIdTest() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        //mapper.updateUser(new User(3, "update","updateUser"));
        sqlSession.clearCache();  //手动清理缓存

        System.out.println("===============");

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        sqlSession.close();

    }

    @Test
    public void getUserByIdTest2() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        SqlSession sqlSession2 = MyBatisUtil.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);

        sqlSession.close();

        System.out.println("===============");

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        sqlSession2.close();
    }
}

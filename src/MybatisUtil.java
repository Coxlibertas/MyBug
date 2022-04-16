
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MybatisUtil {
    private static final SqlSessionFactory sqlSessionFactory;
    static{
        try {
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis.xml"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static SqlSession getSession(boolean autocommit){
     return sqlSessionFactory.openSession(autocommit);
    }
}

import org.apache.ibatis.session.SqlSession;
import mapper.TestMapper;
import type.Student;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session=MybatisUtil.getSession(true)){
            TestMapper testMapper =session.getMapper(TestMapper.class);


            System.out.println(testMapper.selectName());
            System.out.println(testMapper.getID(4));
        }
    }
}
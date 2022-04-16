import org.apache.ibatis.session.SqlSession;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (SqlSession session=MybatisUtil.getSession(true)){
            TestMapper testMapper =session.getMapper(TestMapper.class);

            testMapper.add(new Student().setName("Github").setUrl("github.com"));
            System.out.println(testMapper.getID(6));
            //System.out.println();
        }
    }
}
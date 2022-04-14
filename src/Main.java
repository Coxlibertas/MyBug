import lombok.Getter;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream("mybatis.xml"));
        try (SqlSession session=sqlSessionFactory.openSession(true)){
            List<Student> student = session.selectList("selectName");
            student.forEach(System.out::println);
        }
    }
}
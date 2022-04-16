import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<Student> selectName(int id);
    Student getID(int id);
    void add(Student s);

}

package mapper;
import java.util.List;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import type.Student;

public interface TestMapper {
    @Select("select * from websites")
    List<Student> selectName();
    @Results({
         @Result(column = "name",property = "url"),
         @Result(column = "url",property = "name")
    })
    @Select("select * from websites where id = #{id}")
    Student getID(int id);
    @Insert("insert into websites(name,url) values(#{name},#{url})")
    int add(Student s);

}

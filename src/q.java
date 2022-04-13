import java.sql.*;

public class q {
    public static void main(String[] args) {

        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/examination", "root", "123");
                //2. 创建一个用于执行SQL的Statement对象
                Statement statement = connection.createStatement()) {   //注意前两步都放在try()中，因为在最后需要释放资源！
            //3. 执行SQL语句，并得到结果集
            ResultSet set = statement.executeQuery("select * from websites");
            //4. 查看结果
            while (set.next()) {
                Student student = new Student(set.getInt(1), set.getString(2), set.getString(3));
                student.say();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
class Student {
    Integer sid;
    String name;
    String sex;

    public Student(Integer sid, String name, String sex) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
    }

    public void say(){
        System.out.println("我叫："+name+"，学号为："+sid+"，我的性别是："+sex);
    }
}

import lombok.Data;

@Data
public class Student {
    int id;  //名称最好和数据库字段名称保持一致，不然可能会映射失败导致查询结果丢失
    String name;
    String url;
}//输出顺序与属性的顺序一致
package sy5;

class Student // Student是类名
{
  // 声明成员变量
  private int sNumber; // 学号
  private String sName; // 姓名
  private String sClass; // 班号

  public void setNumber(int n) {
    this.sNumber = n;
  }

  public void setName(String n) {
    this.sName = n;
  }

  public void setClass(String n) {
    this.sClass = n;
  }

  public int getNumber() {
    return this.sNumber;
  }

  public String getName() {
    return this.sName;
  }

  public String getClass() {
    return this.sClass;
  }
}

public class Q2 // 主类Check0
{

  public static void main(String[] args) {
    Student x = new Student(); // 创建Student类的对象x
    // 访问成员变量
    x.setName("myname");
    x.setNumber(90001);
    // x.sName = "myname";
    // x.sNumber = 900001;
    System.out.println(x.getName());
    System.out.println(x.getNumber());
  }
}

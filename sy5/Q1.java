package sy5;

public class Q1 {
  public static void main(String[] args) {
    Teacher t1 = new Teacher("212");

  }
}

class Teacher {
  private int id;
  private String name;
  private char sex;
  private int age;
  private String location;
  private long tel;
  private String password;

  Teacher(String password) {
    this.password = password;

  }

  private boolean checkPassword(String pwd) {
    if (pwd == this.password) {
      return true;
    }
    return false;
  }

  public boolean setAge(String pwd, int age) {
    if (this.checkPassword(pwd)) {
      this.age = age;
      return true;
    }
    return false;
  }

  public int getAge(String pwd) {
    if (this.password == pwd) {
      return this.age;
    }
    return -1;
  }
  
  public boolean setName(String pwd, String name) {
    if (this.checkPassword(pwd)) {
      this.name = name;
      return true;
    }
    return false;
  }

  public String getName(String pwd) {
    if (this.password == pwd) {
      return this.name;
    }
    return null;
  }
  // etc
}
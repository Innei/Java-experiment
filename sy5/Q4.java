public class Q4 {
  public static void main(String[] args) {
    Student s1 = new Student("name1", 1, 400, 97);
    Student s2 = new Student("name2", 2, 340, 90);
    Student s3 = new Student("name3", 3, 440, 67);
    Student s4 = new Student("name4", 4, 340, 87);

  }
}

class School {
  public static int scoreLine = 400;
}

class Student {
  private String name;
  private int id;
  private int intgretResult;
  private int sports;

  Student(String name, int id, int intgretResult, int sports) {
    this.id = id;
    this.name = name;
    this.intgretResult = intgretResult;
    this.sports = sports;

  }

  public boolean check() {
    if (this.intgretResult > School.scoreLine || (this.sports > 96 && this.intgretResult > 300)) {
      return true;
    }
    return false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIntgretResult() {
    return intgretResult;
  }

  public void setIntgretResult(int intgretResult) {
    this.intgretResult = intgretResult;
  }

  public int getSports() {
    return sports;
  }

  public void setSports(int sports) {
    this.sports = sports;
  }
}
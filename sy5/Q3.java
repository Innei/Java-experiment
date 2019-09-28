class Account {
  int id;
  String name;
  float leftmoney;
  String pass;

  public boolean withdrawMoney(float amount, String pass) {
    if (this.pass == pass) {

      this.leftmoney = this.leftmoney - amount;
      return true;
    }
    return false;
  }

  public boolean saveMoney(float amount, String pass) {
    if (this.pass == pass) {
      this.leftmoney = this.leftmoney + amount;

      return true;
    }
    return false;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getLeftmoney(String pass) {
    if (pass == this.pass) {

      return leftmoney;
    }
    return -1;
  }

  public void setLeftmoney(float leftmoney) {
    this.leftmoney = leftmoney;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

}

public class Q3 {
  public static void main(String[] args) {
    Account a = new Account();
    a.setId(1);
    a.setName("name");
    a.setPass("pass");
    a.setLeftmoney(1000);
    a.saveMoney(100, "pass");
    System.out.println(a.getId());
    System.out.println(a.getName());
    System.out.println(a.getLeftmoney("pass"));
  }
}
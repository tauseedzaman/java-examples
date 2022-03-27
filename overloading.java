public class overloading {

  public int add() {
    return 6 + 6;
  }

  public int add(int x, int y) {
    return x + y;
  }

  public String add(String x, String y) {
    return x + y;
  }

  public static void main(String args[]) {
    overloading obj1 = new overloading();
    System.out.println(obj1.add());
    System.out.println(obj1.add(4, 4));
    System.out.println(obj1.add("hello", "world"));
  }
}

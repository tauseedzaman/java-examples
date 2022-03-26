class breakstatement {

  public static void main(String args[]) {
    int x = 50;
    for (int i = 0; i <= x; i++) {
      if (i == 25) {
        continue;
      }
      System.out.println(i);
    }
  }
}

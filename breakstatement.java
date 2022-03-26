class breakstatement {

  public static void main(String args[]) {
    int x = 10;
    for (int i=0; i <= x; i++) {
      if (i == 5) {
        System.out.println("\t\tthis is five");
        break;
      } else {
        System.out.println(i);
      }
    }
  }
}

class nestedifelsecondition {

  public static void main(String args[]) {
    String name = "tauseedzaman";
    String country = "pakistan";
    if (name == "tauseedzaman") {
      if (country == "pakistan") {
        System.out.println("Welcome !" + name);
        System.out.println("feel at home! in " + country);
      } else {
        System.out.println("i don't know who the hack are you!");
      }
    } else if (name == "osama") {
      if (country == "sudan") {
        System.out.println("Most Welcome! " + name);
        System.out.println("feel at home! dont shime. you are in " + country);
      } else {
        System.out.println("i am not sure who you are . take your way plz");
      }
    } else {
      System.out.println(name + "You are not welcome here!");
    }
  }
}

public class Compare {
  public static void main(String args[]) {

    String text1 = "programming";
    String text2 = "development";

    boolean same = false;
    boolean similar = false;

    if (text1.equalsIgnoreCase(text2)) {
      similar = true;
      if (text1.equals(text2)) {
        same = true;
      }
    }

    System.out.println("Exactly the same: " + same);
    System.out.println("Similar: " + similar);

  }
}
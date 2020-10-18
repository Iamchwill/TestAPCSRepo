public class Demo {
  public static void main(String[] args) {
    if (args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    }
    else {
      printLoop(5);
    }
  }

  public static void printLoop(int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = x; j >= i; j--) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}

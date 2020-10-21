public class Demo {
  public static void main(String[] args) {
    int[] one = {1};
    int[] two = {1,2};
    int[] three = {1,2,3};
    int[] four = {1,2,3,4};
    int[] zero = {};
    int[][] fill = new int[5][];
    fill[0] = zero;
    fill[1] = one;
    fill[2] = two;
    fill[3] = three;
    fill[4] = four;
    System.out.println(arrayDeepToString(fill));
    /* if (args.length > 0) {
      printLoop(Integer.parseInt(args[0]));
    }
    else {
      printLoop(5);
    } */
  }

  public static void printLoop(int x) {
    for (int i = 1; i <= x; i++) {
      for (int j = x; j >= i; j--) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    String out = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        out += arr[i];
      }
      else {
        out += arr[i] + ", ";
      }
    }
    return out += "}";
   }

   public static String arrayDeepToString(int[][] arr) {
     String out = "{";
     for (int col = 0; col < arr.length; col++) {
       if (col == arr.length - 1) {
         out += arrToString(arr[col]);
       }
       else out += arrToString(arr[col]) + ", ";
     }
       return out += "}";
     }
}

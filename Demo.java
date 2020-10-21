public class Demo {
  public static void main(String[] args) {
      /*Tests
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
      System.out.println(arrayDeepToString(create2DArrayRandomized(10,10,10)));
      System.out.println(arrayDeepToString(create2DArray(3,3,3)));
      */
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
     for (int row = 0; row < arr.length; row++) {
       if (row == arr.length - 1) {
         out += arrToString(arr[row]);
       }
       else out += arrToString(arr[row]) + ", ";
     }
       return out += "}";
     }

     public static int[][] create2DArray(int rows, int cols, int maxVal) {
       int[][] out = new int[rows][cols];
       for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
           out[i][j] = (int)(Math.random() * (maxVal + 1));
         }
       }
       return out;
     }

     public static int[][] create2DArrayRandomized(int rows, int cols, int maxVal) {
        return create2DArray((int)(Math.random() * (rows + 1)), (int)(Math.random() * (cols + 1)), maxVal);
     }
}

import java.util.Arrays;

public class Test {

  public static void main(String[] args) {

    int[] array = new int[]{17, 28, 9, 4, 22, 7, 1, 3, 19, 42, 58, 47};

    // first sort the array
    Arrays.sort(array);

    //print the minimum value (first number in an array)
    System.out.println("Minimum value: " + array[0]);

    //print the maximum value (last number in an array)
    System.out.println("Maximum value: " + array[array.length - 1]);

  }

}
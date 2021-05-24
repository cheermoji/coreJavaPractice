package coreJavaPractice.searchAlg;

public class IterativeBinarySearch {

  public static int search(int[] input, int value) {

    int start = 0;
    int end = input.length;

    while (start < end) {

      int midpoint = (start + end) / 2;
      if (input[midpoint] == value) {
        return midpoint;
      } else if (input[midpoint] < value) {
        start = midpoint + 1;
      } else {
        end = midpoint;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {-15, -12, 0, 1, 12, 18};
    System.out.println(search(arr, -12));
  }
}

package coreJavaPractice.searchAlg;

public class RecursiveBinarySearch {

  public static int search(int[] input, int value) {
    return perform(input, 0, input.length, value);
  }

  public static int perform(int[] input, int start, int end, int value) {

    int midpoint = (start + end) / 2;

    // recursive exit condition
    if (start >= end) {
      return -1;
    }

    if (input[midpoint] == value) {
      return midpoint;
    } else if (input[midpoint] < value) {
      return perform(input, midpoint + 1, end, value);
    } else {
      return perform(input, start, midpoint, value);
    }
  }

  public static void main(String[] args) {
    int[] arr = {-15, -12, 0, 1, 12, 18};
    System.out.println(search(arr, 1));
  }
}

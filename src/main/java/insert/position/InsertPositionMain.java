package insert.position;

public class InsertPositionMain {
  public static void main(String[] args) {
    int[] arr = new int[] {1,3,5,8,12,16,18,21};
    int target = 0;
    System.out.println(findIndex(arr, target));
  }

  //O(log n)
  private static int findIndex(int[] values, int target) {
    int low = 0;
    int high = values.length - 1;
    int index = 0;
    while (low <= high) {
      int mid = low  + ((high - low) / 2);
      if (values[mid] < target) {
        low = mid + 1;
        index = low;
      } else if (values[mid] > target) {
        high = mid - 1;
      } else if (values[mid] == target) {
        index = mid;
        break;
      }
    }
    return index;
  }
}

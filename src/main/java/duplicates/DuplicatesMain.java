package duplicates;

public class DuplicatesMain {
  public static void main(String[] args) {
    int [] integers = new int[] {2,1,4,3,5,4};
    System.out.println(findDuplicate(integers));
  }
  private static int findDuplicate(int[] values) {
    int maxValueInArray = findMaxValueFromArray(values) + 1;
    int [] reps = new int[maxValueInArray];
    for (int value : values) {
      reps[value]++;
      for (int rep : reps) {
        if (rep == 2) {
          return value;
        }
      }
    }
    return 0;
  }

  private static int findMaxValueFromArray(int [] arr) {
    int max = 0;
    for (int value : arr) {
      if(max < value) {
        max = value;
      }
    }
    return max;
  }
}

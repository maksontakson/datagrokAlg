package intersection.arrays;

public class ArraysIntersectMain {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        int[] arr1 = new int[] {1,3,5,7,13,15};
        System.out.println(intersectionCount(arr, arr1));
    }

    private static int intersectionCount(int[] arr, int[] arr1) {
        int [] resultArr = new int[findMaxValueFromArray(arr, arr1) + 1];
        int countsOfIntersection = 0;
        for (int value : arr) {
            resultArr[value]++;
        }
        for (int value : arr1) {
            resultArr[value]++;
        }
        for (int value : resultArr) {
            if(value == 2) countsOfIntersection++;
        }
        return countsOfIntersection;
    }

    private static int findMaxValueFromArray(int [] arr1, int [] arr2) {
        int max = 0;
        for (int value : arr1) {
            if(max < value) {
                max = value;
            }
        }
        for (int value : arr2) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

}

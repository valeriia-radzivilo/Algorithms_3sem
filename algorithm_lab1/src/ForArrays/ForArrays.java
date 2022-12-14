package ForArrays;

public class ForArrays {

    /* A utility function to print array of size n */
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    // make int array
    public static int[] make_str_arr_to_int(String arr1[])
    {
        int[] intList = new int[arr1.length];

        // parsing the String argument to make int array
        for (int i = 0; i < arr1.length; i++) {
            intList[i] = Integer.valueOf(arr1[i]);
        }
        return intList;
    }
}

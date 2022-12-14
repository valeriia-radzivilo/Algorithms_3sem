import FileWork.*;
import ForArrays.*;
import NaturalMergeSort.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Main {
    public static void main(String args[]) throws IOException {
        FileWork data_file = new FileWork();
        ForArrays arr = new ForArrays();
        String filepath = "lab1.txt";
        //store file data in string
        data_file.fill_file(filepath);
        String file_content = Files.readString(Path.of(filepath));
        file_content = file_content.substring(1,file_content.length() - 1);
        String[] file_array_str = file_content.split(", ", -1);


        //make int array out of string array
        int[] file_array_int = new int[file_array_str.length];
        file_array_int = arr.make_str_arr_to_int(file_array_str);
        // print the array before sort
        System.out.println("Basic array: ");
//        arr.printArray(file_array_int);

        // natural merge sort
        NaturalMergeSort arr_to_sort = new NaturalMergeSort();
        System.out.println("Sorted array: ");
        arr_to_sort.sort(file_array_int);
//        arr.printArray(file_array_int);

        data_file.fill_file_with_arr("lab1_result.txt",file_array_int);



    }
}
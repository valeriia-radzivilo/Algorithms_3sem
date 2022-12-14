package FileWork;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class FileWork {


    // create random array
    int[] make_arr(int len)
    {
        Random random = new Random();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++)
            arr[i] = random.nextInt(1000000000);

        return arr;
    }

    public void fill_file(String filepath) {
        // get random size
        int len = (int) (Math.random() * (10000000 - 9000000)) + 9000000;
        int[] arr = make_arr(len);
        String text_for_file = Arrays.toString(arr);
        try {

            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(filepath);

            // Writing into file
            // Note: The content taken above inside the
            // string
            fWriter.write(text_for_file);


            // Closing the file writing connection
            fWriter.close();

            // Display message for successful execution of
            // program on the console
            System.out.println(
                    "File is created successfully with the content.");
        }

        // Catch block to handle if exception occurs
        catch (
                IOException e) {

            // Print the exception
            System.out.print(e.getMessage());
        }
    }
    public void fill_file_with_arr(String filepath, int[]arr) {
        // get random size
        String text_for_file = Arrays.toString(arr);
        try {

            // Create a FileWriter object
            // to write in the file
            FileWriter fWriter = new FileWriter(filepath);

            // Writing into file
            // Note: The content taken above inside the
            // string
            fWriter.write(text_for_file);


            // Closing the file writing connection
            fWriter.close();

            // Display message for successful execution of
            // program on the console
            System.out.println(
                    "File is created successfully with the content.");
        }

        // Catch block to handle if exception occurs
        catch (
                IOException e) {

            // Print the exception
            System.out.print(e.getMessage());
        }
    }

    public String[] get_array(String filepath) throws IOException {
            List<String> listOfStrings = new ArrayList<String>();

            // load data from file
            BufferedReader bf = new BufferedReader(new FileReader(filepath));

            // read entire line as string
            String line = bf.readLine();

            // checking for end of file
            while (line != null) {
                listOfStrings.add(line);
                line = bf.readLine();
            }

            // closing bufferreader object
            bf.close();

            // storing the data in arraylist to array
            String[] array = listOfStrings.toArray(new String[0]);

            // printing each line of file
            // which is stored in array
            for (String str : array) {
                System.out.println(str);
            }

            return array;
    }
}

package interview.paypal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayPal {

    /*

Can you write a method to display the PASCAL triangle given the number of rows to display?

For row equals to 6, the output should be similar to the following:

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1


*/
    public static final void PascalTriangle() {

        int numberOfRows = 6;
        List<Integer> prevList = new ArrayList<>();

        prevList.add(1);

        for(int i=0; i< numberOfRows; i++){

            prevList.forEach(number ->{
                System.out.print(number+"\t");
            });
            System.out.println();

            List<Integer> nextList = new ArrayList<>();

            nextList.add(1);
            if(prevList.size() > 1 && numberOfRows > 2) {
                for (int j = 1; j < prevList.size(); j++) {
                    int sum = prevList.get(j) + prevList.get(j - 1);
                    nextList.add(sum);
                }

            }
            nextList.add(1);

            prevList = nextList;
        }
    }

    /**
     * if file
     * number of lines
     * number of words (no white spaces)
     * number of bytes
     */

    public static void main(String[] args) {
        if (greeting(args)) return;
        String fileName = args[0];

        loadFile(fileName);

    }

    private static void loadFile(String fileName) {
        Scanner scanner = null;
        FileInputStream inputStream = null;
        int lineCunt = 0;
        int wordCount = 0;
        int byteCount = 0;

        try {
            inputStream = new FileInputStream(fileName);
            scanner = new Scanner(inputStream, "UTF-8");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                lineCunt++;
                String[] words = line.split("\\s+");

                wordCount = wordCount + words.length;

                byte[] byteArrray = line.getBytes();
                byteCount = byteCount + byteArrray.length + 1;

            }
        } catch (IOException e) {
            //Note: I usually have logger here to capture error info, however given the scope of assignment, skipping it.
            System.out.println("Unable to load dictionary file: " + fileName);
            e.printStackTrace();
        } finally {
            close(scanner, inputStream);
        }

        System.out.println("Number of liens: "+lineCunt);
        System.out.println("Number of words: "+wordCount);
        System.out.println("Number of bytes: "+byteCount);
    }

    /**
     * Close scanner and inputStream
     *
     * @param scanner     file scanner object
     * @param inputStream file input stream object
     */
    private static void close(Scanner scanner, FileInputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.out.println("Error while closing input stream");
                e.printStackTrace();
            }
        }
        if (scanner != null) {
            scanner.close();
        }
    }

    /**
     * Greet the user once application starts, also check if the file name is provided.
     *
     * @param args name of the dictionary file.
     * @return boolean flag to stop/continue program execution.
     */
    private static boolean greeting(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the dictionary file");
            return true;
        }

        System.out.println("-----------------------------");
        return false;
    }

}

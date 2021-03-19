package interview.paypal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class PayPal {


    /**
     * if file
     * number of lines
     * number of words (no white spaces)
     * number of bytes
     */

    public static void main(String[] args) {

        PascalTriangle(6);

       /* if (greeting(args)) return;
        String fileName = args[0];

        loadFile(fileName);
*/
    }

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
    public static void PascalTriangle(int numberOfRows) {
        List<Integer> prevList = Collections.singletonList(1);
        for (int i = 0; i < numberOfRows; i++) {
            prevList.forEach(number -> {
                System.out.print(number + "\t");
            });
            System.out.println();
            prevList = getNextList(prevList);;
        }
    }

    private static List<Integer> getNextList(List<Integer> prevList) {
        List<Integer> nextList = new ArrayList<>(Collections.singletonList(1));
        if (prevList.size() > 1) {
            for (int j = 1; j < prevList.size(); j++) {
                int sum = prevList.get(j) + prevList.get(j - 1);
                nextList.add(sum);
            }
        }
        nextList.add(1);
        return nextList;
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
            System.out.println("Unable to load file: " + fileName);
            e.printStackTrace();
        } finally {
            close(scanner, inputStream);
        }

        System.out.println("Number of lines: " + lineCunt);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of bytes: " + byteCount);
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

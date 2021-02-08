package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom1 {
    public static void main(String[] args) {
        int[][] arr = {{0,1}, {1,3},{2,4}};
        canAttendMeetings(arr);
    }

    /**
     * O(nLogn)
     * @param intArrays
     * @return
     */
    public static boolean canAttendMeetings(int[][] intArrays) {
        if (intArrays == null || intArrays.length == 0) {
            return true;
        }

        Arrays.sort(intArrays, Comparator.comparingInt(a -> a[0]));

        int[] prev = intArrays[0];
        {
            for (int i = 1; i < intArrays.length; i++) {
                int[] current = intArrays[i];
                if (prev[1] > current[0]) // previous end time > current start
                {
                    System.out.println(" overlap");
                    return false;
                }
                prev = current;
            }
            System.out.println("no overlap");
            return true;
        }

    }
}

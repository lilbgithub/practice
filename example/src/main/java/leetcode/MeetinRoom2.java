package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetinRoom2 {

    public int meetingRooms(int[][] intervals){
        if(intervals == null || intervals.length ==0){
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparing(ints -> ints[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(ints -> ints[1]));

        pq.add(intervals[0]);
        for (int i=1; i< intervals.length; i++){
            int[] current = intervals[i];
            int[] prev = pq.poll();
            if (prev[1]  > current[0]){
                pq.add(prev);
                pq.add(current);
            }else {
                prev[1] =current[1];
                pq.add(prev);
            }
        }
        return pq.size();
    }
}

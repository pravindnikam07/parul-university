package dsa.leetcode.practice;

import java.util.Arrays;

public class _3169_CountDaysWithoutMeetings {

	public static void main(String[] args) {
		countDays(10, new int[][] {{6, 7},{1, 3}, {9, 10}});
	}
	
	public static int countDays(int days, int[][] meetings) {
        
		Arrays.sort(meetings, (ele1, ele2) -> ele1[0] - ele2[0]);
		int ans = 0;
		int nextWorkingDay = 1;
		for(int i = 0; i < meetings.length; i++) {
			if(meetings[i][0] > nextWorkingDay) {
				ans += meetings[i][0] - nextWorkingDay - 1;
			}
			
			nextWorkingDay = Math.max(nextWorkingDay, meetings[i][1]);
		}
		System.out.println(Arrays.deepToString(meetings));
		System.out.println(ans);
		
		return 0;
    }
}

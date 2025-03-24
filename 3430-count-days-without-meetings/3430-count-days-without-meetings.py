class Solution(object):
    def countDays(self, days, meetings):
        """
        :type days: int
        :type meetings: List[List[int]]
        :rtype: int
        """
        meetings.sort()
        free_days = 0
        last_meeting_end = 0

        for start, end in meetings:
            
            if start > last_meeting_end + 1:
                free_days += start - last_meeting_end - 1
            
            last_meeting_end = max(last_meeting_end, end)

        if last_meeting_end < days:
            free_days += days - last_meeting_end

        return free_days
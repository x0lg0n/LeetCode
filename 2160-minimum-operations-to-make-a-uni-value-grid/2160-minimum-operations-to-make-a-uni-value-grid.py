class Solution(object):
    def minOperations(self, grid, x):
        """
        :type grid: List[List[int]]
        :type x: int
        :rtype: int
        """
        total = [num for r in grid for num in r]
        mod = total[0] % x

        if any(num % x != mod for num in total):
            return -1

        total.sort()
        median = total[len(total) // 2]
        return sum(abs(num - median) // x for num in total)
class Solution(object):
    def largestCombination(self, candidates):
        size = 0
        for bit in range(32):
            count = 0

            for num in candidates:
                if num & (1 << bit):
                    count += 1

            size = max(size, count)

        return size
p = [16,17,71,62,12,24,14]
a = Solution().largestCombination(p)
print(a)

    

        
        
        
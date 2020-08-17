'''
Shuffle a set of numbers without duplicates.
Runtime: 332 ms, faster than 72.91% of Python3 online submissions for Shuffle an Array.
Memory Usage: 19.1 MB, less than 25.47% of Python3 online submissions for Shuffle an Array.
'''
class Solution:

    def __init__(self, nums: List[int]):
        self.base_array = nums

    def reset(self) -> List[int]:
        return self.base_array
        
    def shuffle(self) -> List[int]:
        clone = self.base_array[:]
        for i in range(0, len(self.base_array)):
            index = random.randrange(0,len(self.base_array))
            clone[i], clone[index] = clone[index], clone[i]
        return clone
            
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(nums)
# param_1 = obj.reset()
# param_2 = obj.shuffle()
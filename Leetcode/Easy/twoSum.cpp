/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::unordered_map<int, int> seen;
        for (int i = 0; i < nums.size(); ++i){
            int need = target - nums[i];
            if(seen.find(need) == seen.end()){
                seen[nums[i]] = i;
            } else{
                return std::vector<int> {seen.at(need), i};
            }
        }
        return std::vector<int>();
    }
};
#include <iostream>
#include <vector>

class Solution {
public:
    void swap_numbers(std::vector<int>& nums, int start, int end)
    {
        int temp;
        temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    void sortColors(std::vector<int>& nums){
        int low=0, mid=0;
        int high=nums.size()-1;

        while(mid <= high)
        {
            switch(nums[mid])
            {
                    case 0: swap_numbers(nums, low, mid);
                            low++; mid++;
                            break;
                    case 1: mid++;
                            break;
                    case 2: swap_numbers(nums, mid, high);
                            high--;
                            break;
            }
        }
    }
};

int main()
{
    std::vector<int> nums = {0, 2 , 1};
    Solution s;
    s.sortColors(nums);
    return 0;
}
class Solution {
public:
    int majorityElement(vector<int>& nums)
    {
        // Using Moore's Voting Algorithm
        int majorityElement=nums[0];

        int count=1;
        for(int numIndex=1; numIndex<nums.size(); ++numIndex)
        {
            if(count==0)
            {
                count++;
                majorityElement=nums[numIndex];
            }
            else if(majorityElement==nums[numIndex])
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        return majorityElement;
    }
};

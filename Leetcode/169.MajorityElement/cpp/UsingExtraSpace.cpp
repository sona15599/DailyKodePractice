class Solution {
public:
    int majorityElement(vector<int>& nums)
    {
        unordered_map<int,int> mp;
        for(int numIndex=0; numIndex<nums.size(); ++numIndex)
        {
            mp[nums[numIndex]]++;
        }

        float majority=nums.size()/2;
        for(const auto entry: mp)
        {
            if(entry.second>majority)
            {
                return entry.first;
            }
        }

        return 0;
    }
};

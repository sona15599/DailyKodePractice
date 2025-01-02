class Solution {
  public:
    int countPairs(vector<int> &arr, int target)
    {
        std::unordered_map<int,int> mp;
        int count=0;
        for(int number: arr)
        {
            int delta=target-number;
            if(mp.find(delta)!=mp.end())
            {
                count+=mp[delta];
            }
            
            mp[number]++;
        }
        
        return count;
    }
};

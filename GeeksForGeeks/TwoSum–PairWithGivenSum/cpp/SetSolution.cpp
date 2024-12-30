class Solution {
  public:
    bool twoSum(vector<int>& arr, int target)
    {
        // Complexity:
        // Time: O( n )
        // Space: O( n )
        unordered_set<int>  set;
        for(int element: arr)
        {
            int delta=target-element;
            if(set.find(delta) != set.end())
            {
                return true;
            }
            
            set.emplace(element);
        }
        
        return false;
    }
};

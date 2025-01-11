class Solution {
  public:
    bool twoSum(vector<int>& arr, int target)
    {
        // Gives TLE
        for(int index=0; index<arr.size(); ++index)
        {
            for(int jIndex=index+1; jIndex<arr.size(); ++jIndex)
            {
                if(arr[index] + arr[jIndex] == target)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
};

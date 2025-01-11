class Solution {
  public:
    bool binarySearch(vector<int>& arr, int left, int right, int key)
    {
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==key)
            {
                return true;
            }
            
            if(arr[mid]<key)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        
        return false;
    }

    bool twoSum(vector<int>& arr, int target)
    {
        // Complexity:
        // Time: O( n log n)
        // Space: O(1)
        sort(arr.begin(), arr.end());
        for(int index=0; index<arr.size(); ++index)
        {
            int delta=target-arr[index];
            if(binarySearch(arr, index+1, arr.size()-1, delta))
            {
                return true;
            }
        }
        
        return false;
    }
};

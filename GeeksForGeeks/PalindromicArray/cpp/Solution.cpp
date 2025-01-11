class Solution {
  public:
    bool isPalindromeArray(vector<int> &arr)
    {
        for(int number: arr)
        {
            string str1 = std::to_string(number);
            string str2 = str1;
            std::reverse(str2.begin(), str2.end());
            
            if(str1 != str2)
            {
                return false;
            }
        }
        
        return true;
    }
    
    bool PalinArray(vector<int> &arr)
    {
        if(isPalindromeArray(arr))
        {
            return true;
        }
        
        return false;
    }
};

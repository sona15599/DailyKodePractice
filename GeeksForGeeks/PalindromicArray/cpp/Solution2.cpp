class Solution {
  public:
    bool isPalindromeArray(vector<int> &arr)
    {
        for(int number: arr)
        {
            int sum=0;
            int value=number;
            while(value)
            {
                int reminder=value%10;
                sum=(sum*10)+reminder;
                value/=10;
            }
            
            if(sum!=number)
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

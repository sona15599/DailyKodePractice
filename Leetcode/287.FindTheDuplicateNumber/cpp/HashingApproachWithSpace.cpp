class Solution {
public:
    int findDuplicate(vector<int>& nums)
    {
        int duplicateNumber;
        const int MAX_SIZE = 100001;
        int indexedArr[MAX_SIZE]={0};
        for(int number : nums)
        {
            if(indexedArr[number]!=0)
            {
                duplicateNumber=number;
                break;
            }
            else
            {
                indexedArr[number]=number;
            }
        }

        return duplicateNumber;
    }
};

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs)
    {
        sort(strs.begin(), strs.end());

        string result;
        int len=strs.size();
        for(int index=0; index<strs[0].length(); ++index)
        {
            if(strs[0][index]!=strs[len-1][index])
            {
                break;
            }
            result.push_back(strs[0][index]);
        }
        return result;
    }
};

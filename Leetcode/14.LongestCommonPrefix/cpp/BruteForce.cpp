class Solution {
public:
    int getMinLength(int len, vector<string>& strs)
    {
        int minLength=strs[0].length();
        for(string str: strs)
        {
            if(str.length()<minLength)
            {
                minLength=str.length();
            }
        }

        return minLength;
    } 

    string longestCommonPrefix(vector<string>& strs)
    {
        int minLength=getMinLength(strs.size(), strs);

        string result;
        for(int i=0; i<minLength; ++i)
        {
            char ch=strs[0][i];
            for(int j=0; j<strs.size(); ++j)
            {
                if(ch!=strs[j][i])
                {
                    return result;
                }
            }

            result.push_back(ch);
        }

        return result;
    }
};

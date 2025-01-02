class Solution {
public:
    bool isAnagram(string s, string t)
    {
        // Time Complexity: O(n log n)
        // Space Complexity: O(log n) as we have used std::sort()
        std::sort(s.begin(), s.end());
        std::sort(t.begin(), t.end());

        if(s.length()!=t.length())
        {
            return false;
        }
        
        for(int index=0; index<s.length(); ++index)
        {
            if(s[index]!=t[index])
            {
                return false;
            }
        }

        return true;
    }
};

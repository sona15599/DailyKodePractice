class Solution {
  public:
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    bool isRotated(string& s1, string& s2)
    {
        //Corner case
        // 1. If lenght is less than 2, no point of going ahead. Simply check if they are equal/ not
        if(s1.length()<2 || s2.length()<2)
        {
            return s1==s2;
        }
        
        //2. If s1 & s2 length is different then its obvious that we cannot get s2 from s1
        if(s1.length()!=s2.length())
        {
            return false;
        }
        
        string clockwiseStr = s1.substr(2) + s1.substr(0,2);
        string antiClockwiseStr = s1.substr(s1.length()-2,2) + s1.substr(0, s1.length()-2);
        
        if( clockwiseStr==s2 || antiClockwiseStr==s2)
        {
            return true;
        }
        
        return false;
    }
};

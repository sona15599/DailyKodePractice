class Solution{
  public:
    // Function to return the count of number of elements in union of two arrays.
    int findUnion(vector<int>& a, vector<int>& b)
    {
        std::unordered_set<int> set;
        for(int number: a)
        {
            set.emplace(number);
        }
        
        for(int number: b)
        {
            set.emplace(number);
        }
        
        return set.size();
    }
};

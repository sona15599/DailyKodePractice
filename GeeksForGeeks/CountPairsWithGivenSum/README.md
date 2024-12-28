# Count pairs with given sum

---
> Video description: https://youtu.be/6IXm9NbqT5I



[Problem](https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1) | [Java Solution](./Solution.java) | [Discussion](https://www.reddit.com/r/OBrutus/comments/1hnm27i/count_pairs_with_given_sum/)


[![img](https://img.youtube.com/vi/6IXm9NbqT5I/0.jpg)](https://youtu.be/AhgCdUyeK_U)
---

Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.

Examples:
```
Input: arr[] = [1, 5, 7, -1, 5], target = 6 
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
```
```
Input: arr[] = [1, 1, 1, 1], target = 2 
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
```
```
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0
```

>| Constraint | Description |
>|-----------|-------------|
>| `1 <= arr.size() <= 10^5` | Array size must be between 1 and 100,000 |
>| `-10^4 <= arr[i] <= 10^4` | Each array element must be between -10,000 and 10,000 |
>| `1 <= target <= 10^4` | Target sum must be between 1 and 10,000 |

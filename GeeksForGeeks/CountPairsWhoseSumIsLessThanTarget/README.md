# Union of Arrays with Duplicates

> Video description: https://youtu.be/uISnk-RgYfo?si=ALqv2fEx0BXqOfnn


[Problem](https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-less-than-target/1) | [Java Solution](./Solution.java) | [Discussion](https://www.reddit.com/r/OBrutus/)

[![img](https://img.youtube.com/vi/uISnk-RgYfo/0.jpg)](https://youtu.be/uISnk-RgYfo)
---

**Problem Statement:**

Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.

**Examples**

### Example 1:

* Input: arr[] = [7, 2, 5, 3], target = 8
* Output: 2
* Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3). 

### Example 2:

* Input: arr[] = [5, 2, 3, 2, 4, 1], target = 5
* Output: 4
* Explanation: There are 4 pairs whose sum is less than 5: (2, 2), (2, 1), (3, 1) and (2, 1).

### Example 3:

* Input: arr[] = [2, 1, 8, 3, 4, 7, 6, 5], target = 7
* Output: 6
* Explanation: There are 6 pairs whose sum is less than 7: (2, 1), (2, 3), (2, 4), (1, 3), (1, 4) and (1, 5).

**Constraints:**

* 1 <= arr.size() <= 105
* 0 <= arr[i] <= 104
* 1 <= target <= 104

##### Topic Tags

* Sorting
* two-pointer-algorithm
* Arrays

##### Related Articles

* [Count Pairs Array Whose Sum Less X](https://www.geeksforgeeks.org/count-pairs-whose-sum-is-less-than-x/)

##### Expected Complexities

* Time Complexity: O(n log n)
* Auxiliary Space: O(1)
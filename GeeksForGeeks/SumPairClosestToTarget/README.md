# Sum Pair Closest To Target

> Video description: https://youtu.be/B_TTY5VFkho

[Problem](https://www.geeksforgeeks.org/problems/pair-in-array-whose-sum-is-closest-to-x1124/1) | [Java Solution](./Solution.java) | [Discussion](https://www.reddit.com/r/OBrutus/)

[![img](https://img.youtube.com/vi/B_TTY5VFkho/0.jpg)](https://youtu.be/B_TTY5VFkho)

---

**Problem Statement:**

Given an array `arr[]` and a number `target`, find a pair of elements (a, b) in `arr[]`, where `a<=b` whose sum is closest to `target`.

**Note:** Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.

**Examples:**

### Example 1:

* Input: `arr[] = [10, 30, 20, 5], target = 25`
* Output: `[5, 20]`
* Explanation: As `5 + 20 = 25` is closest to `25`.

### Example 2:

* Input: `arr[] = [5, 2, 7, 1, 4], target = 10`
* Output: `[2, 7]`
* Explanation: As `(4, 7)` and `(2, 7)` both are closest to `10`, but absolute difference of `(2, 7)` is `5` and `(4, 7)` is `3`. Hence, `[2, 7]` has maximum absolute difference and closest to target.

### Example 3:

* Input: `arr[] = [10], target = 10`
* Output: `[]`
* Explanation: As the input array has only 1 element, return an empty array.

**Constraints:**

* `1 <= arr.size() <= 2*10^5`
* `0 <= target<= 2*10^5`
* `0 <= arr[i] <= 10^5`

**Company Tags:**

* [Ola Cabs](https://github.com/OBrutus/Leetcode/blob/master/company/Ola%20Cabs/README.md)

**Topic Tags:**

* [Arrays](https://github.com/OBrutus/Leetcode/blob/master/topic/Arrays/README.md)
* [Data Structures](https://github.com/OBrutus/Leetcode/blob/master/topic/Data%20Structures/README.md)
* [two-pointer-algorithm](https://github.com/OBrutus/Leetcode/blob/master/topic/two-pointer-algorithm/README.md)

**Related Articles:**

* [2 Sum](https://github.com/OBrutus/Leetcode/blob/master/problems/2%20Sum/README.md)
* [Pair Sum Closest To Target](https://github.com/OBrutus/Leetcode/blob/master/problems/Pair%20Sum%20Closest%20To%20Target/README.md)
* [Given Sorted Array Number X Find Pair Array Whose Sum Closest X](https://github.com/OBrutus/Leetcode/blob/master/problems/Given%20Sorted%20Array%20Number%20X%20Find%20Pair%20Array%20Whose%20Sum%20Closest%20X/README.md)

**Expected Complexities:**

* Time Complexity: O(n log n)
* Auxiliary Space: O(1)

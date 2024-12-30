# Union of Arrays with Duplicates

> Video description: https://youtu.be/Ob44rKwKSbk

[Problem](https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1) | [Java Solution](./Solution.java) | [Discussion](https://www.reddit.com/r/OBrutus/)

[![img](https://img.youtube.com/vi/Ob44rKwKSbk/0.jpg)](https://youtu.be/Ob44rKwKSbk)
---

**Problem Statement:**

Given two arrays `a[]` and `b[]`, the task is to find the number of elements in the union between these two arrays.

**The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.**

**Note:** Elements of `a[]` and `b[]` are not necessarily distinct.

**Examples**

### Example 1:

* Input: `a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]`
* Output: `5`
* Explanation: Union set of both the arrays will be `1, 2, 3, 4` and `5`. So count is `5`.

### Example 2:

* Input: `a[] = [85, 25, 1, 32, 54, 6], b[] = [85, 2]`
* Output: `7`
* Explanation: Union set of both the arrays will be `85, 25, 1, 32, 54, 6`, and `2`. So count is `7`.

### Example 3:

* Input: `a[] = [1, 2, 1, 1, 2], b[] = [2, 2, 1, 2, 1]`
* Output: `2`
* Explanation: We need to consider only distinct. So count of elements in union set will be `2`.

**Constraints:**

* `1 ≤ a.size(), b.size() ≤ 10^6`
* `0 ≤ a[i], b[i] ≤ 10^5`


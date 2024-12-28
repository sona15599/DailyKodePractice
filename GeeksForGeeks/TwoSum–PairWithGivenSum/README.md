# Two Sum – Pair with given Sum

---
> Video description: https://youtu.be/AhgCdUyeK_U
[Problem](https://www.geeksforgeeks.org/problems/key-pair5616/1) | [Java Solution](./Solution.java) | [Discussion](https://www.reddit.com/r/OBrutus/)

[![img](https://img.youtube.com/vi/AhgCdUyeK_U/0.jpg)](https://youtu.be/AhgCdUyeK_U)
---

Given an array arr[] of positive integers and another integer target. Determine if there exists two distinct indices such that the sum of there elements is equals to target.

Examples:
```
Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16.
```

```
Input: arr[] = [1, 2, 4, 3, 6], target = 11
Output: false
Explanation: None of the pair makes a sum of 11.
```

```
Input: arr[] = [11], target = 11
Output: false
Explanation: No pair is possible as only one element is present in arr[].
```

> Constraints:
> 1 ≤ arr.size ≤ 105
> 1 ≤ arr[i] ≤ 105
> 1 ≤ target ≤ 2*105
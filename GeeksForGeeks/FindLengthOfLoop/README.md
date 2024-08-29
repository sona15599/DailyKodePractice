# Find Length of Loop

> Link: https://youtu.be/7Ei0hzfOlwY

[![img](https://img.youtube.com/vi/7Ei0hzfOlwY/0.jpg)](https://www.youtube.com/watch?v=7Ei0hzfOlwY&ab_channel=OBrutus)

[java solution](./Solution.java)

---
Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

Note: 'c' is the position of the node which is the next pointer of the last node of the linkedlist. If c is 0, then there is no loop.

![img](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700620/Web/Other/blobid0_1722797558.png)
```
Examples:

Input: LinkedList: 25->14->19->33->10->21->39->90->58->45, c = 4
Output: 7
Explanation: The loop is from 33 to 45. So length of loop is 33->10->21->39-> 90->58->45 = 7. 
The number 33 is connected to the last node of the linkedlist to form the loop because according to the input the 4th node from the beginning(1 based indexing) 
will be connected to the last node for the loop.
``` 

![img](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/700620/Web/Other/blobid3_1722798030.png)
```
Input: LinkedList: 5->4, c = 0
Output: 0
Explanation: There is no loop.****
```

>Expected Time Complexity: O(n)
>Expected Auxiliary Space: O(1)

Constraints:
1 <= no. of nodes <= 106
0 <= node.data <=106
0 <= c<= n-1
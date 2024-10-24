package GeeksForGeeks.FindTheSumOfLastNNodesOfLinkedList;

/*
Node class is as follows:
*/

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class Solution {
    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        // len
        // sum
        Node first, second;
        first = head;

        // the distance between first and second
        // is just n 
        int i = 0;
        for (i = 0; i < n && first != null; i++) {
            first = first.next;
        }

        if (i < n) {
            // 1 -> 2 -> 3 ;; n == 4
            throw new IllegalArgumentException();
        }

        second = head;
        // second and first are at optimal positions
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // first hits null
        // the list ends here with first
        // from second including it we have only n nodes
        int sum = 0;
        while (second != null) {
            sum += second.data;
            second = second.next;
        }

        return sum;
    }
}

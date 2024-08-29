package GeeksForGeeks.FindLengthOfLoop;

class Node {
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

// Function should return the length of the loop in LL.
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        if (head == null || head.next == null) {
            // check for single node
            return 0;
        }

        // has loop or not
            // how to identify
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // it has loop
                break;
            }
        }

        if (fast != slow) {
            // it does not have loop
            return 0;
        }

        // if has how many nodes
            // count the nodes
        int count = 1;
        fast = slow.next;
        while (fast != slow) {
            count++;
            fast = fast.next;
        }

        return count;
    }
}

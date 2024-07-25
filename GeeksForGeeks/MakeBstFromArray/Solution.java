package GeeksForGeeks.MakeBstFromArray;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        return code(nums, 0, nums.length - 1);
    }

    private Node code(int[] a, int l, int r) {
        if (l > r) return null;
        int mid = (l+r)/2;

        Node root = new Node(a[mid]);
        root.left = code(a, l, mid - 1);
        root.right = code(a, mid + 1, r);

        return root;
    }
}

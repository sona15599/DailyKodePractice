package GeeksForGeeks.ConstructBinaryTreeFromParentArray;

class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Solution {
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        // Your code here
        if (parent == null || parent.length == 0) {
            return null;
        }

        // Map<Integer, Integer> parentMap = new HashMap<>();
        Map<Integer, Node> map = new HashMap<>();
        int rootIndex = 0;
        for (int i = 0; i < parent.length; i++) {
            // parentMap.put(i, parent[i]);
            map.put(i, new Node(i));
        }

        for (int i = 0; i < parent.length; i++) {
            if (parent[i] == -1) {
                rootIndex = i;
                continue;
            }
            
            // it has a parent
            Node parentNode = map.get(parent[i]);
            if (parentNode.left == null) {
                parentNode.left = map.get(i);
            } else {
                parentNode.right = map.get(i);
            }
        }

        return map.get(rootIndex);
    }
}

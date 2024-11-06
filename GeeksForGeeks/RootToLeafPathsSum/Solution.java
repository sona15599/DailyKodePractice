package GeeksForGeeks.RootToLeafPathsSum;

/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/

class Solution {
    /*
        steps :
            1. get number
                1.1. previous number + current (append)
            2. store the sum (sum)
    */
    public static int treePathsSum(Node root) {
        // add code here.
        int[] sum = new int[1];
        dfs(root, 0, sum);
        return sum[0];
    }

    static void dfs(Node root, int cur, int[] sum) {
        if (root == null) return;
        cur = cur * 10 + root.data;

        if (root.left == null && root.right == null) {
            // child node
            sum[0] += cur;
            return;
        }

        dfs(root.left, cur, sum);
        dfs(root.right, cur, sum);
    }
}
package GeeksForGeeks.RotateBy90Degree;

/*

1 2 3
4 5 6
7 8 9

1 4 7
2 5 8
3 6 9

7 4 1 
8 5 2
9 6 3

*/

class GFG {

    static void rotate(int a[][]) {
        // Code Here
        int n = a.length;

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }

        // just swap rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int t = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = t;
            }
        }
    }

}
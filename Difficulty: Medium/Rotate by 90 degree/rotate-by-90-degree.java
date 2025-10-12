// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int[][] res = transpose(mat);

        int[][] main = rotateMat(res);

        // mat = main;
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                mat[i][j] = main[i][j];
            }
        }
        
    }
    
    static int[][] transpose(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[j][i] = mat[i][j];
            }
        }

        return res;
    }

    static int[][] rotateMat(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int j = mat[0].length - 1; j >= 0; j--) {
                res[i][j] = mat[i][c++];
            }
        }

        return res;
    }
}
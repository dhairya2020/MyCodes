class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        HashSet<Integer> l= new HashSet<>();
        HashSet<Integer> r= new HashSet<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    l.add(i);
                    r.add(j);
                }
            }
        }

        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            int k= iterator.next();
            for(int j=0;j<n;j++)
            {
                matrix[k][j]=0;
            }
        }
        Iterator<Integer> iterator1 = r.iterator();
        while (iterator1.hasNext()) {
           int k=iterator1.next();
            for(int j=0;j<m;j++)
            {
                matrix[j][k]=0;
            }
        }
}
}

// -------------------------------------inplace solution--------------------------------------
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;

//         boolean firstRowZero = false;
//         boolean firstColZero = false;

//         // Step 1: Check if first row has any zero
//         for (int j = 0; j < n; j++) {
//             if (matrix[0][j] == 0) {
//                 firstRowZero = true;
//                 break;
//             }
//         }

//         // Step 2: Check if first column has any zero
//         for (int i = 0; i < m; i++) {
//             if (matrix[i][0] == 0) {
//                 firstColZero = true;
//                 break;
//             }
//         }

//         // Step 3: Use first row and column as markers
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     matrix[i][0] = 0; // mark row
//                     matrix[0][j] = 0; // mark column
//                 }
//             }
//         }

//         // Step 4: Set zeroes based on markers
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 if (matrix[i][0] == 0 || matrix[0][j] == 0) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         // Step 5: Handle first row
//         if (firstRowZero) {
//             for (int j = 0; j < n; j++) {
//                 matrix[0][j] = 0;
//             }
//         }

//         // Step 6: Handle first column
//         if (firstColZero) {
//             for (int i = 0; i < m; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }


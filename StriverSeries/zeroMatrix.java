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

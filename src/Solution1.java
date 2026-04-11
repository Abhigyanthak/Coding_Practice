public class Solution1 {
    public static void main(String args []){
        int [][] matrix = {
                {1,2,4},
                {5,6,10},
                {8,3,4}
        };
        int n = matrix.length;
        int primaraySum =0;
        int secondarySum =0;
        for(int i=0;i<n;i++){
            primaraySum=primaraySum+matrix[i][i];
            secondarySum = secondarySum + matrix[i][n-1-i];

        }
        System.out.println("PrimaryDiagonalSum" + primaraySum);
        System.out.println("SecondaryDiagonalSum" + secondarySum);
        }
    }


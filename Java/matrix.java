
public class matrix{
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3,4},
    {4,5,6,7},
    {6,8,9,3}
        };
        

    int[] rowsums=new int[matrix.length];
    for(int i=0; i< matrix.length;i++){
        int sum=0;
        for(int j=0;j<matrix.length;j++){
            sum+=matrix[i][j];

        }
        rowsums[i]=sum;
    }

    int[] colsums=new int[matrix[0].length];{
        for(int j=0;j<matrix[0].length;j++){
            int sum=0;
            for(int i=0;i<matrix.length;i++){

                sum+=matrix[i][j];
            }
            colsums[j]=sum;

        }


        System.out.print("row sum");
        for(int i=0;i<rowsums.length;i++){
            if(i < rowsums.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
    }

    }
}

ssh nv 
 print

 cat
 diff old new

 ./matrixjava.sh 
package pxxy.wzf;

/**
 * @auther: 王智芳
 * @Description 稀疏数组
 * @date: 2021/4/23 20:32
 */
public class SparseArray {
    public static void main(String[] args) {
        //0未下  1 黑   2 白
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][4] = 2;
        for (int[] row : chessArr1){
            for (int data : row){
                System.out.printf(String.valueOf(data));
            }
            System.out.println();
        }


        //获取二维数组的行和列
        int row = chessArr1.length;
        int columns = chessArr1[0].length;
        System.out.println(row+"-----"+columns);
        int sum = 0;
        //循环
        for (int i = 0 ; i< row; i++){
            for (int j = 0; j< columns; j++){
                if(chessArr1[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println(sum);

        //创建稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = row;
        sparseArr[0][1] = columns;
        sparseArr[0][2] = sum;

        //循环
        int count = 1;
        for (int i = 0 ; i< row; i++){
            for (int j = 0; j< columns; j++){
                if(chessArr1[i][j]!=0){
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                    count++;
                }
            }
        }

        for (int[] a : sparseArr){
            for (int data : a){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //扩展将稀疏数组 io输出文件
    }
}


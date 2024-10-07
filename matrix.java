import java.util.*;
class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Row and Column for Matrix 1:");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m[][] = new int[m1][m2];
        for(int i=1;i<=m1;i++){
            for(int j=1;j<=m2;j++){
                m[i][j] = s.nextInt();
            }
        }
        for(int i=1;i<=m1;i++){
            for(int j=1;j<=m2;j++){
                System.out.print(" "+m[i][j]);
            }
        }
        System.out.println("Enter the size of Row and Column for Matrix 2:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n[][] = new int[n1][n2];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                n[i][j] = s.nextInt();
            }
        }
        for(int i=1;i<=m1;i++){
            for(int j=1;j<=m2;j++){2
                System.out.print(" "+n[i][j]);
            }
        }
        int o[][] = new int[m1][n2];
        for(int i=1;i<=m1;i++){
            for(int j=1;j<=n2;j++){
                  o[i][j] = m[i][j] + n[i][j];             }
        }
        for(int i=1;i<=m1;i++){
            for(int j=1;j<=n2;j++){
                System.out.print(" "+o[i][j]);
            }
            System.out.println();
        }
    }
}

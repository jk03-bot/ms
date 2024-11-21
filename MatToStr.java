import java.util.Scanner;

public class MatToStr {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter row and col:");
        int p = obj.nextInt();
        int q = obj.nextInt();
        int[][] mat1 = new int[p][q];

        System.out.print("enter elements:");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                mat1[i][j]=obj.nextInt();
            }
        }

        StringBuilder a = new StringBuilder();

        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                char b = (char)mat1[i][j];
                a.append(b);
            }
        }

        System.out.print(a.toString());
    }

}

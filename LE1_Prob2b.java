/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args)
    {
        int i,j,k;
        for (i= 0;i<=4-1;i++)
        {
            for (j=0;j<=i;j++)
            {
                System.out.print(" ");  
            }
            for (k=0;k<=4-1-i;k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();  
        }  
    }  
}  


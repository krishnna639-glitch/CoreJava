// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Practice {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int n = 5;
        //left align triangle
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //reverse of left align triangle
        for(int i = n;i >= 1;i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }   
        //right align triangle
        int k = 1;
        for(int i = 1;i <= n;i++)
        {
            for(int s = 1; s < 2 * (n - i) ; s++)
            {
                System.out.print(" ");

            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //reverse of right align triangle
        for(int i = n;i >= 1;i--)
        {
            for(int s = 1; s < 2 * (n - i) ; s++)
            {
                System.out.print(" ");

            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Pyramid star
        for(int i = 1;i <= n;i++)
        {
            for(int s = 1;s<=n - i;s++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //reverse of pyramid star
        for(int i = n;i >= 1;i--)
        {
            for(int s = 1;s<=n - i;s++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //sqaure star
        for(int i = 1;i <= n;i++)
        {
            
            for(int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //holo sqaure
        for(int i = 1;i <= n;i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            
            System.out.println("");
        }
        //star pascel triangle
        for(int i = 1;i <= n;i++)
        {
            for(int s = 1;s<=n - i;s++)
            {
                System.out.print(" ");
            }
            int number = 1;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(number + " ");
                number = number * (i - j) / j;
            }
            System.out.println("");
        }
    }
}
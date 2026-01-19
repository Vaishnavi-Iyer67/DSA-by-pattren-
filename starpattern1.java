

class Star{
    
    void pat1(int n )
    {
        for( int i =0;i<n;i++)
        {
            for (int j =0;j<n;j++)
            {
                System.out.print("*  ");
            }
            System.out.print("\n");
           
        }
    }


    void pat2(int n)
    {
        for( int i=0;i<n;i++)
        {
            for( int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    void pat3(int n )
    {
        for ( int i=1;i<n;i++)
        {
            for ( int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.print("\n");
        }

    }
    void pat4(int n )
    {
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.err.print("\n");
        }
    }
    void pat5 (int n)
    {
        for( int i=0;i<n;i++)
        {
            for( int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");

            }
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            for ( int l =0;l<n-i-1;l++)
            {
                System.out.print(" ");
            }
            System.err.print("\n");
        }
    }
    void pat6(int n )
    {
        for ( int i=1;i<=2*n-1;i++)
        {
            int stars = i;
            if(i>n) stars=2*n-i;
            for ( int j =1;j<=stars ;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    void pat7(int n )
    {
        int start =1;
        for( int i=0;i<n;i++)
        {
            if(i%2==0) start=1;
            else start=0;
            for( int j=0;j<=i;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.print("\n");
        }
    }
    void pat8(int n)

    {
        int space =2*(n-1);
        for ( int i=1;i<=n;i++)

        {
            //num
            for ( int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            //space 
            for ( int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            // num
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.print("\n");
            space-=2;
        }
    }
    void pat9(int n )
    {
        int num=1;
        for ( int i=0;i<n;i++)
        {
            for (int j =0;j<=i;j++)
            {
                System.out.print(num+ " ");
                num+=1;
            }
            System.out.print("\n");
        }
    }

    void pat10(int n )
    {
        for ( int i=0;i<n;i++)
        {
            for ( char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }
    void pat11( int n)
    {
        for ( int i=0;i<n;i++)
        {
            for ( char ch ='A';ch<= 'A'+(n-i-1);ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
    }
    void pat12( int n )
    {
        for ( int i=0;i<n;i++)

        {
            char ch = (char) ( 'A' + i);
            for ( int j =0;j<=i;j++)
            {
                System.out.print(ch);

            }
            System.out.print("\n");
        }

    }
    void pat13( int n )
    {
        for ( int i=0;i<=n;i++)
        {
            for ( int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            char ch ='A';
            int breakpoint ;
            breakpoint  = (2*i+1) /2 ;

            for ( int j=1;j<=2*i+1;j++)
            {
                System.out.print( ch );
                if( j<=breakpoint) ch++;
                else ch--;
            }
            for ( int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print("\n");


        }
    }
    void pat14 ( int n )
    {
        
        for ( int i=0;i<n;i++)
        {
            for( char ch = (char) ('E'- i ); ch<= 'E' ; ch++)
            {
                System.out.print(ch);

            }
            System.out.print("\n");
        }
    }
    void pat15(int n )
    {
        int space =0;

        for( int i=0;i<n;i++)
        {
            //stars 
            for( int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            // spaces 
            for (int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            //stars 
            for( int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            space+=2;
            System.out.print("\n");

            


        }
    
    space=2*n-2;
    
    for ( int i=0;i<n;i++)
    {

        //stars
        for ( int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        //space
        for( int j=0;j<space;j++)
        {
            System.out.print(" ");
        }
         //stars
        for ( int j=0;j<=i;j++)
        {
            System.out.print("*");
        }
        space-=2;
        System.out.print("\n");
        
    }
    

    }
    void pat16( int n)
    {
        int space =2*n-2;
        for ( int i=0;i<2*n-1;i++)
        {
            int stars;
            if (i < n) stars = i + 1;
            else stars = 2 * n - i - 1;

            for ( int j=0;j<stars;j++)
            {
                System.out.print("*");
            }
            //spaces 
            for ( int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            //stars 
            for ( int j=0;j<stars ;j++)
            {
                System.out.print("*");
            }
            if ( i<n-1) space-=2;
            else space +=2;
            System.out.println();
        }
        
    }
    void pat17( int n){
        for ( int i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
            //stars 
                int stars =n;
                for ( int j =0;j<stars;j++)
                {
                    System.out.print("*");
                } 
             
            }
            else 
            
            {
               System.out.print("*");
               for( int j=0;j<n-2;j++)
               {
                System.out.print(" ");
               }
                System.out.print("*");

            }
            System.out.println();
        }

    }
    /*easy approach 
    if (i==0|| j==0 || i==n-1 || j==n-1 )
    System.out.print("*");
    else System.out.print(" "); 
    */
   
}

public class starpattern1 {
    public static void main(String[] args) {
        Star p1=new Star();
        System.out.println("  pat 1 \n");
        p1.pat1(5);
        System.out.println("  pat 2 \n");
        p1.pat2(5);
        System.out.println(" pat 3 \n");
        p1.pat3(5);
         System.out.println(" pat 4 \n");
        p1.pat4(5);
        System.out.println(" pat 5 \n");
        p1.pat5(5);
        System.out.println(" pat 6 \n");
        p1.pat6(5);
        System.out.println(" pat 7 \n");
        p1.pat7(5);
        System.out.println(" pat 8 \n");
        p1.pat8(8);
        System.out.println(" pat 9 \n");
        p1.pat9(10);
        System.out.println(" pat 10 \n");
        p1.pat10(8);
        System.out.println(" pat 11 \n");
        p1.pat11(8);
        System.out.print(" pat 12 \n");
        p1.pat12(5);
        System.out.print(" pat 13 \n");
        p1.pat13(6);
        System.out.print(" pat 14 \n");
        p1.pat14(5);
        System.out.print(" pat 15 \n");
        p1.pat15(5);
        System.out.println(" pat 16 \n ");
        p1.pat16(5);
        System.out.println( " pat 17 \n ");
        p1.pat17( 4);



    }


}   









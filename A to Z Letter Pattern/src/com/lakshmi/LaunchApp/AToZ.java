package com.lakshmi.LaunchApp;

public class AToZ
{
    public static void main(String[] args)
    {
      int n=10;
      System.out.println();
      System.out.println();
      for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i>1 && j==1 && i<=n)||
                (i==1 && j>1 && j<n)||
                (i==n/2 && j>1 && j<n)||
                (i>1 && j==n && j<=n))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
          System.out.print("   ");

          //letter B
          for(int j=1;j<=n;j++)
            {
               if((i>=1 && i<=n && j==1)||
                   (i==1 && j>1 && j<n)||
                   (i==n && j>1&& j<n)||
                   (i==n/2 && j>1 && j<n)||
                   (j==n&&i>1 && i<n/2)||
                   (j==n && i>n/2 && i<n))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
          System.out.print("   ");
          //letter C
           for(int j=1;j<=n;j++)
            {
               if((j==1&& i>1 && i<n)||
                  (i==1 && j>1 && j<=n)||
                  (i==n && j>1 && j<=n))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
          System.out.print("   ");
          //Letter D
           for(int j=1;j<=n;j++)
            {
                if((j==1 && i>=1 && i<=n)||
                    (i==1 && j>1 && j<=n-1)||
                    (j==n &&i>1 && i<n)||
                    (i==n && j>1 && j<=n-1))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            // Letter E
            for(int j=1;j<=n;j++)
            {
               if ((j==1 && i>=1 && i<=n)||
                   (i==1 && j>1 && j<=n)||
                   (i==n &&j>1 && j<=n)||
                   (i==n/2 && j>1 && j<=n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter F
            for(int j=1;j<=n;j++)
            {
               if ((j==1 && i>=1 && i<=n)||
                   (i==1 && j>1 && j<=n)||
                   (i==n/2 && j>1 && j<=n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter G
            for(int j=1;j<=n;j++)
            {
               if ((i==1 && j>1 && j<=n)||
                    (i>1 && i<=n && j==1)||
                    (i==n && j>1 && j<=n)||
                    (i>=n/2 && i<n && j==n)||
                    (i==n/2 && j>=n/2 && j<=n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter H
             for(int j=1;j<=n;j++)
            {
               if ((i>=1 && i<=n && j==1)||
                   (i>=1 && i<=n && j==n)||
                   (i==n/2 && j>1 && j<n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter I
             for(int j=1;j<=n;j++)
            {
               if ((i==1 && j>=1 && j<=n)||
                    (i==n && j>=1 && j<=n)||
                    (i>1 && i<n && j==n/2))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter J
            for(int j=1;j<=n;j++)
            {
               if ((i==1 && j>=1 && j<=n)||
                   (i>1 && i<n && j==n/2)||
                   (i==n && j>=1 && j<=n/2))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter K
             for(int j=1;j<=n;j++)
            {
                if((j==1 && i>=1 && i<=n)||
                    (i<=n/2 && j<=n/2 && i+j==n/2+1)||
                    (i>=n/2 && j<=n/2+1 && i-j==n/2-1))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter L
            for(int j=1;j<=n;j++)
            {
               if ((i>=1 &&i<=n && j==1)||
                    (i==n && j>=1 && j<=n ))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter M
            for(int j=1;j<=n;j++)
            {
                if((i>=1 && j==1)||
                    (i>=1 && j==n)||
                    (i>=1 && j>=1 && j<=n/2 && i==j-1)||
                    (i>=1 && j>=1 && i+j==n &&i<=n/2))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }  
        System.out.println();
        System.out.println();  
        //Letter N
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i>=1 && j==1)||
                    (i>=1 && j==n)||
                    (i>=1 && j>=1 && i==j))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
                       
            

            //Letter O

            for(int j=1;j<=n;j++)
            {
               if ((i>1 &&i<n && j==1)||
                    (i==n && j>1 && j<n)||
                    (j==n && i>1 && i<n)||
                    (i==1 && j>1 && j<n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 

            //Letter P
             for(int j=1;j<=n;j++)
            {
               if ((j==1 && i>1 && i<=n)||
                    (i==1 && j>1 && j<n)||
                    (j==n && i>1 && i<n/2)||
                    (i==n/2 && j>1 && j<n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter Q
            for(int j=1;j<=n;j++)
            {
                if((i==1 && j>1 && j<n-2)||
                    (j==1 && i>1 && i<n-2)||
                    (i==n-2 && j>1 && j<n-2)||
                    (j==n-2 && i>1 && i<n-2)||
                    (i>=n/2 && j>=n/2 && i==j ))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter R
             for(int j=1;j<=n;j++)
            {
               if((i>=1 && j==1)||
                    (i>=n/2 && j<=n/2 && i-j==n/2)||
                    (i==1 && j>1 && j<n-2)||
                    (j==n-2 && i>1 && i<=n/2)||
                    (i==n/2+1 && j>1 && j<n-2)||
                    (i==n && j>=n/2))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter S

             for(int j=1;j<=n;j++)
            {
               if ((i==1 && j>1 && j<=n)||
                    (i==n/2 && j>=1 && j<n)||
                    (i==n && j>=1 && j<n)||
                    (j==1 && i>1 && i<n/2)||
                    (j==n && i>n/2 && i<n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter T
             for(int j=1;j<=n;j++)
            {
               if ((i==1 && j>=1 && j<=n)||
                   (j==n/2 && i>1 && i<=n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter U
            for(int j=1;j<=n;j++)
            {
               if ((j==1 && i>=1 && i<n)||
                    (i==n && j>1 && j<n)||
                    (j==n && i>=1 && i<n))
                   {
                     System.out.print("*");
                   }   
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter V
             
              for(int j=1;j<=n;j++)
            {
                if((i>=1 && i<=n/2 && j==1)||
                   (i>=1 && i<=n/2 && j==n)||
                   (i-j==n/2)||(i+j==n/2+n))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("   ");                                                            

            //Letter W
             for(int j=1;j<=n;j++)
            {
                if((j==1 && i>=1 && i<=n)||
                   (i==j && i>=n/2 && j>=n/2)||
                   (i>=n/2 && j<=n/2 && i+j==n)||
                   (j==n && i>=1 && i<=n))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //Letter X
               for(int j=1;j<=n;j++)
                {
                    if((i==j)||
                    (i+j==n+1))
                    {
                    System.out.print("*");
                    }
                    else{
                    System.out.print(" ");
                    }
                }
            System.out.print("   ");      

            //Letter Y
            for(int j=1;j<=n;j++)
            {
                if((i>=1 && j>=1 && j<=n/2 && i==j)||
                    (i>=1 && j>=1 && i+j==n &&i<=n/2)||
                    (i>=n/2+1 && j==n/2))

                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            //Letter Z 
            for(int j=1;j<=n;j++)
            {
                if((i==1 && j>=1 && j<=n)||
                    (i==n && j>=1 && j<=n)||
                    (i>=1 && j>=1 && i+j==n))
                {
                    System.out.print("*");
                }
                  
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();         
        }  
        System.out.println();
      System.out.println();
    }
}
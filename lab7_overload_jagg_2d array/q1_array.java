// 1. WAP to declare a 3x3 multi-dimensional array, initialize it and find the sum of left diagonal and right diagonal.

 class q1_array{

    public static void main(String[] args)  
    {

         int arr[][]={{3,5,6},{3,4,2},{2,3,4}};
        
        
         int SUM=0;

            System.out.println("PRINTING LEFT DIAGNOL");
             for (int i = 0; i < arr.length; i++) 
                  {   
                       for (int j = 0; j < arr[i].length; j++)
                       {   if(i==j)
                           {System.out.print(arr[i][j] + " ");
                           SUM=SUM+arr[i][j];
                       } 
                       }  
                     System.out.println();
                  }
                  System.out.println("sum of lest diagnot is-->"+SUM);

                  int SUMR=0;
            System.out.println("PRINTING RIGHT DIAGNOL");
            for (int i = 0; i < arr.length; i++) 
                 {  
                      for (int j = 0; j < arr[i].length; j++)
                      {   if(i+j==2)
                        {
                          System.out.print(arr[i][j] + " ");
                          SUMR=SUMR+arr[i][j];
                        }
                      }  
                    System.out.println();
                 }
                 System.out.println("sum of RIGHT diagnot is-->"+SUM);

    }  
}


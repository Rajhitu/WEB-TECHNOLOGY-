
// 1.	A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.

class sheet
{
   int costp=40;
   void calcp(int x)
   {
   System.out.println("cost of 2d plastic sheet forr" + x + "is Rs" +(x*40));
   }
   

}

class box extends sheet
{

int costb=60;
void calcb(int x)
{
System.out.println("cost of plasticbox forr" + x + "cubic ft is Rs"  + (x*60) );
}

}


  class q1A
{


     public static void main(String[] args) 
     {
        //System.outprintln();
        box b=new box();
        b.calcb(20);
        b.calcp(30);

        
    }
}
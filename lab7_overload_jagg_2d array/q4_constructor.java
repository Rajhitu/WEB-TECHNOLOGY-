// 4. WAP to overload the constructor of Perim class which will find the perimeter of circle and rectangle.

class perim


{
  perim(int r)
  {
      double ar;
      ar= 3.14*2*r;
      System.out.println("perim of circle is---->"+ar);
  }

  perim(int l,int b)
  {
      float ar;
      ar=2*(l+b);
      System.out.println("perim of rectangle is---->"+ar);
  }
}

class q4_constructor
{
    public static void main(String[] args) 
    {
       perim s2= new perim(2);
       perim s3=new  perim(3,4);


    }

}
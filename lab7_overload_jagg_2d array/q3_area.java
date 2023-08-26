// 3. WAP to overload the area method which will find the area of a circle and area of a rectangle.



class q3_area


{
   static void area(int r)
  {
      double ar;
      ar= 3.14*r*r;
      System.out.println("area of circle is---->"+ar);
  }

  static void area(int l,int b)
  {
      float ar;
      ar=l*b;
      System.out.println("area of rectangle is---->"+ar);
  }
    public static void main(String[] args) 
    {
        area(2);
        area(3,4);


    }

}
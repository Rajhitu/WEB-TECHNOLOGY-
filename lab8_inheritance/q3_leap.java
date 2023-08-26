// class q3_leap {

//     public static void main(String[] args) {

//         System.out.println("LEAP YEAR CHECKING");

//         int year = 2021;

        

           
           
//             if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)))
// //                 System.out.println(+year +"is a leap year");
// //             else
// //                 System.out.println(+year +"is a not leap year");

// //     }
// // }


// class A
// {
// 	int classVar1 = 1;
//     void m(){
// 		System.out.println("hi");
// 		System.out.println("ClassVar is " + classVar1);
// 	}
// }

// class B extends A
// {
// 	int classVar = 2;
//     void m(){
// 		System.out.println("hello");
// 		System.out.println("ClassVar is " + classVar);
// 	}
// }

// class C extends A
// {
// 	int classVar = 3;
//     void m(){
// 		System.out.println("kiit");
// 		System.out.println("ClassVar is " + classVar);
// 	}
// }

// class q3_leap
// {
//     public static void main(String args[]){
    
//     B b = new B();
// 	C c = new C();
	
// 	System.out.println("ClassVar is " + b.classVar1);
// 	System.out.println();
// 	System.out.println("ClassVar is " + c.classVar);
// 	System.out.println();
	
//     b.m();
// 	System.out.println();
//     c.m();	
	
//     }
// }

class Outer
{

int x=100;
	
		void test()
		{
			   for (int i=0;i<10;i++)
			   {
	
					class Inner{
						void display(){
					   System.out.println("display:x= "+x);
	
					  }
				  }
				   Inner inner=new Inner();
					inner.display();
				 
			  }
	
	
		}
}
	
	
	
	
class q3_leap{
	
		public static void main(String args[]){
  
		 Outer outer=new Outer();
  
		outer.test();
		}
	}
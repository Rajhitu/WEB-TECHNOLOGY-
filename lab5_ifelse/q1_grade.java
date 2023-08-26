
// 1 WAP to print corresponding grades for the given marks using if ekse statement in java

// >90--------------------0
// 81-90 -----------------E
// 71-90-------------------------A
// 61-70---------------------------B 
// 51-60-------------------------C 
// 40-50 --------------------------Pass 
// <40-------------------------Fail 

class q1_grade

{

    public static void main(String[] args) {
        int marks = 99;

        if (marks > 90) {
            System.out.println("grade-->O");

        } else if (marks >= 81) {
            System.out.println("grade-->O");

        } else if (marks >= 71) {
            System.out.println("grade-->A");

        } else if (marks >= 61) {
            System.out.println("grade-->B");

        } else if (marks >= 51) {
            System.out.println("grade-->C");

        } else if (marks >= 40) {
            System.out.println("grade-->pass");

        } else {
            System.out.println("FAIL");

        }
    }
}

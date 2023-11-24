package JavaOopsConcepts;

import org.junit.Test;

public class AT_08Polymorphism_MethodOverLoading01 {
    @Test
    public void sumOfString(){
        String a="School";
        String b=" Bus";
        String c= a+b;
        System.out.println("The valu of c is : "+c);

    }
    @Test
    public void sumOfString(int i){
        int j=20;
        int k=i+j;
        System.out.println("The value of K is: "+k);

    }
    @Test
    public void sumOfString(int g, int h){
        int m=g+h;
        System.out.println("The value of m is: "+m);
    }

}
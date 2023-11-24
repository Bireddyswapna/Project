package JavaOopsConcepts;

import org.junit.Test;

public class AT_03Encapsulation01 {
    @Test
    public void EncMethod01(int i, int j) {
        int m=i+j;
        System.out.println("The value of M is :"+m);
    }
    @Test
    public int EncMethod02(int a,int b){
        int c= a+b;
        return c;

    }
}

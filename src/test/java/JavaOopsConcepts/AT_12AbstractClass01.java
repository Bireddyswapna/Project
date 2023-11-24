package JavaOopsConcepts;

import org.junit.Test;

public abstract class AT_12AbstractClass01 {
    @Test
    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("The value of method o1:"+(i+j));
    }
    @Test
    public void String(){
        String a="swapna";
        String b="Reddy";
        System.out.println("My Name is: "+(a+b));
    }
    public abstract void subOfNUm();
}

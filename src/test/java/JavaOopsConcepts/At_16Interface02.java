package JavaOopsConcepts;


import org.junit.Test;

public class At_16Interface02 implements AT_15Interface01 {
    @Test
    public void add(){
        int y=10+x;
        System.out.println("the value of y = "+y);
    }
    @Test
    public void sub(){
        int k=70-x;
        System.out.println("The value of k = "+k);
    }
    @Test
    public void div(){
        int j=100/x;
        System.out.println("the value of j= "+j);
    }

}

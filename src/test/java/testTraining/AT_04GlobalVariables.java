package testTraining;

import org.junit.Test;

public class AT_04GlobalVariables {

    int i=10;
    int j=20;
    String Name="My training";


    @Test
    public void test05() {
        int k = 40;
        int m=k+j;
        System.out.println("The value of m is " + m);
    }
    @Test
    public void test06(){
        String o=Name+j;
        System.out.println("my training number is: "+o);

    }
}

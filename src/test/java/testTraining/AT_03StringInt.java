package testTraining;

import org.junit.Test;

public class AT_03StringInt {
    @Test
public void test01(){

        int i=29;
        int j=56;
        int k=i+j;
        System.out.println("the value of k= "+k);
    }

@Test
        public void test02(){
    String a="Hello";
    String b="World";
    String c= a+b;
    System.out.println("The value of c is " +c);

        }
        @Test
    public void test03(){
        int i= 10;
        String j= "Bananas";
        String k= i+j;
            System.out.println("The value of k is "+k);
        }
        @Test
    public void test04(){
        String a= "Room no:";
        int b= 34;
        String c=a+b;
            System.out.println("The value of c is "+c);


        }
}

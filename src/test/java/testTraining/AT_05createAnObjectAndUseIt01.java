package testTraining;

import org.junit.Test;

public class AT_05createAnObjectAndUseIt01 {
    @Test
    public void test07() {

        AT_05createAnObjectAndUseIt01 obj = new AT_05createAnObjectAndUseIt01();
        System.out.println("This is my Training");
        obj.test08();
        obj.test09();
    }
    @Test
    public void test08(){
        int i=20;
        int j=30;
        int k=i+j;
        System.out.println(" The value of k is "+k);
    }
    @Test
    public void test09(){
        String a="MySoftware";
        String b=" Training";
        String c=a+b;
        System.out.println("My Training Name is "+c);
    }

}

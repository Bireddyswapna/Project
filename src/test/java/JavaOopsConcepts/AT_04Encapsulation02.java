package JavaOopsConcepts;

import org.junit.Test;

public class AT_04Encapsulation02 {
    @Test
public void EncMethod03(){
        AT_03Encapsulation01 obj=new AT_03Encapsulation01();
        obj.EncMethod01(20,40);
        obj.EncMethod01(90,30);

        int x=obj.EncMethod02(30,40);
        int y=x+50;
        System.out.println("the value of y is:"+y);
    }


}

package JavaOopsConcepts;

import org.junit.Test;

public class AT_09Polymorphism_MethodOverLoading02 {
    @Test
    public void Methodcall(){
        AT_08Polymorphism_MethodOverLoading01 obj=new AT_08Polymorphism_MethodOverLoading01();
        obj.sumOfString();
        obj.sumOfString(50);
        obj.sumOfString(20,30);
    }

}

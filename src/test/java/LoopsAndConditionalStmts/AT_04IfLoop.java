package LoopsAndConditionalStmts;

import org.junit.Test;

public class AT_04IfLoop {
    @Test
    public void IfLoop(){
        int i=10;
        if(i == Integer.parseInt("10")){
            System.out.println("The value of i="+i);
        }
        String name="Reddy";
        if(name.equalsIgnoreCase("Reddy")){
            System.out.println("My Name is "+name);

        }
    }

}

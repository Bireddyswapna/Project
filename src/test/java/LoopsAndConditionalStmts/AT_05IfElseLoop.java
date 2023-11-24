package LoopsAndConditionalStmts;

import org.junit.Test;

public class AT_05IfElseLoop {
    @Test
    public void ifelse() {
        int i = 10;
        if (i == Integer.parseInt("10")) {
            System.out.println("The value of i=" + i);
        }
        String name = "Reddy";
        if (name.equalsIgnoreCase("Reddy")) {
            System.out.println("My Name is " + name);

        }
        else{
            System.out.println("The entered Value is not Correct");
        }
    }
}

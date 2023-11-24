package LoopsAndConditionalStmts;

import org.junit.Test;

public class AT_07SwitchStmt {
    @Test
    public void switchstatement(){
        switch (1) {

            case 1:
                int i = 10;
                int j = 20;
                int k = i + j;
                System.out.println("the value of k is " + k);
                break;
            case 2:
                System.out.println("have a good morning");
                break;
            case 3:
                System.out.println("My name is Reddy");
                break;
            default:
                System.out.println("doesn't exist");
        }

    }
}

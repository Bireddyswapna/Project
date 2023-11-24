package LoopsAndConditionalStmts;

import org.junit.Test;

public class AT_06ElseIf {
    @Test
    public void Elseif(){
        int Number=40;
        if (Number == Integer.parseInt("10")) {
            System.out.println("The Value of Number is 10");
        }else if(Number == Integer.parseInt("20")) {
            System.out.println("The Value of Number is 20");
        }else if(Number == Integer.parseInt("30")) {
            System.out.println("The value of Number is 30");
        }else{
            System.out.println("The Number entered is incorrect");
        }String name="Redy";
        if(name.equalsIgnoreCase("Reddy")){
            System.out.println("My Name is Reddy");
} else if(name.equalsIgnoreCase("puppy")){
            System.out.println("My Name is puppy");}
else{
        System.out.println("name doesn't exist");}
}
}

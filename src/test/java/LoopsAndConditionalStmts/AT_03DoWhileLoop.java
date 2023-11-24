package LoopsAndConditionalStmts;

import org.junit.Test;

public class AT_03DoWhileLoop {
    @Test
    public void Dowhilelopp(){
        int SeatNo = 20;
        do {
            System.out.println("The seat number is : " + SeatNo);
            SeatNo++;
        }
        while(SeatNo<=30);

    }
}

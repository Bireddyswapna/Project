package testTraining;

import org.junit.Test;

public class AT_10ArrayLoop {
    @Test
    public void test14() {
        int[] rows = {10, 20, 30, 40, 50, 60, 70};
        int Arraysize = rows.length;
        System.out.println("Length of Array is "+Arraysize);

        for(int i=0;i<Arraysize;i++){
            System.out.println("Array Index is :"+i+" And its value is "+rows[i]);

        }


    }
}
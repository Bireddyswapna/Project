package testTraining;

import org.junit.Test;

import java.util.ArrayList;

public class AT_11ArrayList {
    @Test
    public void ArrayList() {
        ArrayList<String> ListofColors = new ArrayList<String>();
        ListofColors.add("Red");
        ListofColors.add("Blue");
        ListofColors.add("Green");
        ListofColors.add("Yellow");
        System.out.println("Colors inside ArrayList are : " + ListofColors);
        int ColorsCount =ListofColors.size();
        System.out.println("ColorsCount :" + ColorsCount);
        for (int i=0;i<ColorsCount;i++) {
            System.out.println("Array index is :" + i + "And its value is: " +ListofColors.get(i));
        }
    }
}



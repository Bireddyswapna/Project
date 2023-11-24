package testTraining;

import org.junit.Test;

import java.util.HashMap;

public class AT_12HashMap {
    @Test
    public void test15(){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("BMW",2020);
        map.put("Audi",2022);
        map.put("Benz",2023);
        System.out.println("print data :"+map);

        int mapSize=map.size();
        System.out.println("HashMap size is : "+mapSize);

      if(map.containsKey("BMW"));
      {
            int keyVal= map.get("BMW");
           System.out.println("keyValue is : "+keyVal);
      }




    }
}

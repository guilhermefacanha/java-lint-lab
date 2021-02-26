package main;

import java.io.Serializable;
import java.util.Arrays;

public class CalcUtil implements Serializable {

    private static final long serialVersionUID = -1650509718704982242L;

    public static int sum(int... numbers)
    {return Arrays.stream(numbers).sum();
    }

    public static int sub(int... numbers)
    {if(numbers==null || numbers.length==0) return 0;
     int total = numbers[0];
     for(int i=1;i<numbers.length;i++)
         total=total-numbers[i];
     return total;
    }
}

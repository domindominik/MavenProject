package main;

import java.util.ArrayList;
import java.util.List;

public class Exponentiation
{
    public static List<Integer> exponentiation (List<Integer> integerList)
    {
        List<Integer> resultList = new ArrayList<>();

        PowerInterface powerInterface = x -> (int)Math.pow(x, 3);

        for (Integer integer: integerList)
        {
            if(integer < 20)
            {
                resultList.add(powerInterface.sum(integer));
            }
            else
            {
                resultList.add(integer);
            }
        }
        return resultList;
    }
}

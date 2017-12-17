package week5.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
	public static void main(String[] args)
	{
		List<Integer> nums = new ArrayList<>();
        List<String> texts = new ArrayList<>();

        Map<Integer, String> combo = new HashMap<>();

        for (int i = 0; i < 10; i++)
        {//generate random input
            nums.add((int)(((Math.random() * 10))));
            texts.add("Text for key " + nums.get(i));
        }

        for (Integer i: nums)
        {//put values in combo
            combo.put(i, texts.get(nums.indexOf(i)));
        }

        for (Map.Entry<Integer, String> pair: combo.entrySet())
        {//print result
           System.out.println(pair.getKey().toString() + " " + pair.getValue().toString());
        }
    }
}

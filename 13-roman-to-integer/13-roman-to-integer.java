import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> mymap = new HashMap<>();
    mymap.put("I",1);
    mymap.put("V",5);
    mymap.put("X",10);
    mymap.put("L",50);
    mymap.put("C",100);
    mymap.put("D",500);
    mymap.put("M",1000);
    mymap.put("IV",4);
    mymap.put("IX",9);
    mymap.put("XL",40);
    mymap.put("XC",90);
    mymap.put("CD",400);
    mymap.put("CM",900);
    
    int result=0;
        
    
    if(s.length() == 2 && mymap.containsKey(s))
    {
        result = mymap.get(s);
    }
    else
    {
    	int i;
        for(i=s.length()-1;i>0;i--)
        {
        	if (mymap.containsKey(s.substring(i-1,i+1))) {
        		result = result +  mymap.get( s.substring(i-1,i+1));
        		i--;
        	}
        	else 
        		result = result + mymap.get(s.substring(i,i+1));
        	 
         }
        
        if (i==0) {
        	result = result +  mymap.get( s.substring(i,i+1));
        }
    }
        return result;
    }
}

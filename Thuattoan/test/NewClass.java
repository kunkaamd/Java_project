
import java.util.HashMap;
import java.util.Map;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOC
 */
public class NewClass {
    static String[] fileNaming(String[] names) {
        Map<String,Integer> map = new HashMap<>();
        for(String x : names){
            if(!map.containsKey(x)){
                map.put(x, 0);
            }
            else{
                map.put(x+"("+map.get(x)+")",0);
                map.put(x, map.get(x)+1);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
    }
}

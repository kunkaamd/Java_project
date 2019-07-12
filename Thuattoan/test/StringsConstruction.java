
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
/*  Solution
    How many strings equal to a can be constructed using letters from the string b? Each letter can be used only once and in one string only.

    Example

    For a = "abc" and b = "abccba", the output should be
    stringsConstruction(a, b) = 2.

    We can construct 2 strings a with letters from b.
*/
public class StringsConstruction {
    public static void main(String[] args) {
        String a = "hnccv";
        String b = "hncvohcjhdfnhonxddcocjncchnvohchnjohcvnhjdhihsn";
        System.out.println(stringsConstruction1(a,b));
    }
    private static int stringsConstruction1(String a, String b) {
        Map<Character,Integer> mapB = new HashMap<>();
        for(char i: b.toCharArray()){
            if (mapB.containsKey(i)) {
                mapB.put(i, mapB.get(i)+1);
            }else{
                mapB.put(i,1);
            }
        }
        Map<Character,Integer> mapA = new HashMap<>();
        for(char i: a.toCharArray()){
            if (mapA.containsKey(i)) {
                mapA.put(i, mapA.get(i)+1);
            }else{
                mapA.put(i,1);
            }
        }
        int min = 0;
        if (mapB.containsKey(a.charAt(0))) {
            min = mapB.get(a.charAt(0));
        }else{
            return 0;
        }
        
        for (Map.Entry<Character, Integer> entry : mapA.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (min>mapB.get(key)/value) {
                min = mapB.get(key)/value;
            }
        }
        return min;
    }

}

import java.util.HashMap;
import java.util.Map;

public class CountChars {
    public Map<Character,Integer> countChars(String str){
        char [] chars = str.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        for( char ch : chars){
//            charMap.compute(ch,(k,v)->v==null?0 : v+1);
//            System.out.println(ch +" is " + charMap.get(ch)+" times ");
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }else{
                charMap.put(ch,1);
            }
        }
        return  charMap;
    }

    public static void main(String[] args) {
        CountChars countDup = new CountChars();
        System.out.println(countDup.countChars("Hello Java"));
    }
}

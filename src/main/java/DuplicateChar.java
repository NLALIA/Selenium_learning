import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
    public void findIt(String str)
    {
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();
        char[] arr = str.toLowerCase().toCharArray();
        for(char ch : arr){
            if(charMap.containsKey(ch) ) {
                charMap.put(ch, charMap.get(ch) + 1);

            }
                else
                    charMap.put(ch,1);
            }
        Set<Character> keys = charMap.keySet();
        for(Character c :keys){
//            if(charMap.get(c)>1){

                 System.out.println(c+" is "+charMap.get(c)+" times ");
          //  }

        }
        }


    public static void main(String[] args) {
        DuplicateChar count = new DuplicateChar();
        count.findIt("Hello JAva");
    }
    }


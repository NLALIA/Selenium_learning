import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class CountDup {
    static final int Max_char = 256;

    public static void getOccuringChar(String str){
        int count[] = new int[Max_char];
        int len = str.length();
        for (int i = 0; i <len ; i++)
            count[str.charAt(i)]++;

        char[] ch = new char[len];
        for (int i = 0; i < len ; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <=i ; j++) {
                if(str.charAt(i) == ch[j])
                    find++;

            }
            if(find == 1)
                System.out.println("Number of occurence of "+ str.charAt(i) +" is "+count[str.charAt(i)]);

        }

    }

    public static void main(String[] args) {
        CountDup count = new CountDup();
        count.getOccuringChar("Geeks for geeks");

    }
    }


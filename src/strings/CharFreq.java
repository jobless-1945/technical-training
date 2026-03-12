package strings;

public class CharFreq {
    public static void main(String[] args) {
        //for char, it checks ASCII value
        System.out.println('A'-'a');//65-97
        System.out.println((char)('A'+32));//adding 32 to capital gives small letter
        System.out.println((char)('a'-32));//subtracting 32 to small gives caps
        String st="a";
        int[] freq=new int[26];//All alphabets included
        //Pan-gram
        //A quick brown fox jumps over the lazy dog
        for(int i=0;i<st.length();i++){
            freq[st.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0)
                System.out.println((char)(i+'a')+"->"+freq[i]);
        }
    }
}

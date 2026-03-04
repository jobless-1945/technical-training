package strings;

public class StringBase {
    public static void main(String[] args) {
        char[] l={'v','y','s','h'};
        String name=new String(l);
        System.out.println(name);
        String j="I1Am1Vyshnav1Ajith";
        String[] words=j.split("1");
        System.out.println(words[3]);
        for(Object o:words){
            System.out.print(o+" ");
        }
        System.out.println();
        String data="   SNPSU   ISE ";
        System.out.println(data.trim());
    }
}

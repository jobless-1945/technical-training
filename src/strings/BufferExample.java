package strings;

public class BufferExample {
    public void stringInsert(){
        StringBuffer sb=new StringBuffer("JA");
        System.out.println("Old string: "+sb);
        sb.insert(1,"AV");
        System.out.println("New String: "+sb);
    }
    public void stringAppend(){
        StringBuffer sb=new StringBuffer("SNPSU");
        System.out.println("Old string: "+sb);
        sb.append("ISE");
        System.out.println("New String: "+sb);
    }
    public void stringReverse(){
        StringBuffer sb=new StringBuffer("HELLO");
        System.out.println("Old string: "+sb);
        sb.reverse();
        System.out.println("New String: "+sb);
    }

    public static void main(String[] args) {
        new BufferExample().stringInsert();
        new BufferExample().stringAppend();
        new BufferExample().stringReverse();
    }
}

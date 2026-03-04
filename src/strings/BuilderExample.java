package strings;

public class BuilderExample {
    public void stringInsert(){
        StringBuilder sb=new StringBuilder("JA");
        System.out.println("Old string: "+sb);
        sb.insert(1,"AV");
        System.out.println("New String: "+sb);
    }
    public void stringAppend(){
        StringBuilder sb=new StringBuilder("SNPSU");
        System.out.println("Old string: "+sb);
        sb.append("ISE");
        System.out.println("New String: "+sb);
    }
    public void stringReverse(){
        StringBuilder sb=new StringBuilder("HELLO");
        System.out.println("Old string: "+sb);
        sb.reverse();
        System.out.println("New String: "+sb);
    }

    public static void main(String[] args) {
        new BuilderExample().stringInsert();
        new BuilderExample().stringAppend();
        new BuilderExample().stringReverse();
    }
}

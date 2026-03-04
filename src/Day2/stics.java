package Day2;
public class stics {
    static int c=0;
    int id;
    stics(){
        c++;
        id=c;
        System.out.println("Object ID: "+id);
    }
    public static void main(String[] args) {
        stics c1=new stics();
        stics c2=new stics();
        stics c3=new stics();
        System.out.println("The count "+
                c);
    }
    
}

package strings;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long strttime=System.currentTimeMillis();
        StringBuffer buf=new StringBuffer("Java");
        for(int i=1;i<1000000;i++){
            buf.append("DSA");
        }
        System.out.println("Buffer time: "+(System.currentTimeMillis()-strttime)+"ms");
        strttime=System.currentTimeMillis();
        StringBuilder buil=new StringBuilder("Java");
        for(int i=1;i<1000000;i++){
            buil.append("DSA");
        }
        System.out.println("Builder time: "+(System.currentTimeMillis()-strttime)+"ms");
    }
}

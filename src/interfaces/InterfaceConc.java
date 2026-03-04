package interfaces;

public interface InterfaceConc {
        void display();
    }
    class A{

    }
    class B {
        public static void main(String[] args) {
            A a=new A();
            B b= new B();
            //Old java code - Boring Code : BoilerPlate Code
            InterfaceConc obj=new InterfaceConc() {
                @Override
                public void display() {
                    System.out.println("Hello");
                }
            };
            //java 8 or 1.8 : Lambda expression(Scala)
            InterfaceConc obj1= ()-> System.out.println("Hello");
            obj.display();
        }
    }

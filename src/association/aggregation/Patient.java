package association.aggregation;

public class Patient {
    String patName;
    int patAge;
    String disease,doa;
    Information info;
    Payment pay;

    public Patient(String patName, int patAge, String disease, String doa, Information info,Payment pay) {
        this.patName = patName;
        this.patAge = patAge;
        this.disease = disease;
        this.doa = doa;
        this.info=info;
        this.pay=pay;
    }
    void patDetails(){
        System.out.println("Name"+this.patName);
        System.out.println("Age: "+this.patAge);
        System.out.println("Disease: "+this.disease);
        System.out.println("Date of arrival: "+this.doa);
        System.out.println("Block no.: "+this.info.blockNo);
        System.out.println("Floor no.: "+this.info.floorNo);
        System.out.println("Room no.: "+this.info.roomNO);
        System.out.println("Bed no.: "+this.info.bedNo);
        System.out.println("Admission fee: "+this.pay.adFee);
        System.out.println("Registration fee: "+this.pay.regFee);
        System.out.println("Balance amount: "+this.pay.balFee);
    }

    public static void main(String[] args) {
        Information i=new Information('A',2,4,3);
        Payment p=new Payment(20000,10000,5000);
        Patient p1=new Patient("ABC",25,"Covid","25/2/25",i,p);
        p1.patDetails();
    }
}

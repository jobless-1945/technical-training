package dsa.dataStructure.NonLinear.Heaps;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

//Comparator : Multiple Values
class Patient{
        String name;
        int severity;// 1=high, 3=Medium, 5=low
        LocalDateTime arrivalTime;
        public Patient(String name, int severity, LocalDateTime arrivalTime){
            this.name=name;
            this.severity=severity;
            this.arrivalTime=arrivalTime;
        }
        @Override
        public String toString(){
            return name+" (severity="+severity+",arrival="+arrivalTime+")";
        }
    }
public class EmergencyRoom2 {
    public static void main(String[] args) {
        //Custom Comparator : first by severity, then by arrival time
        Queue<Patient> queue=new PriorityQueue<>(
                (p1,p2) ->{
                    if(p1.severity!=p2.severity){
                        return Integer.compare(p1.severity,p2.severity);
                    }else{
                        return p1.arrivalTime.compareTo(p2.arrivalTime);
                    }
                }
        );
        //Calculating patients arrival with actual timestamp
        queue.offer(new Patient("Allen",3,LocalDateTime.of(2026,4,9,10,8)));
        queue.offer(new Patient("Joe",3,LocalDateTime.of(2026,4,9,10,8)));
        queue.offer(new Patient("Allen",3,LocalDateTime.of(2026,4,9,10,8)));
        //Lets print the patient whos treated first
        Patient treated=queue.poll();
        System.out.println("Patient that gets operated first: "+treated);
        //Remaining patients
        System.out.println("Patients in queue: "+queue);
    }
}
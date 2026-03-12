package arrays.arrayProblems;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a={2,2,1,1,2,2,2};
        int count=0,candidate=0;
        for (int j : a) {
            if (count == 0)
                candidate = j;
            if (candidate == j)
                count++;
            else count--;
        }
        System.out.println("Majority Element: "+candidate);
    }
}

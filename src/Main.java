import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<Integer>();
        numsList.add(3);
        numsList.add(8);
        numsList.add(16);
        numsList.add(1);
        numsList.add(25);
        numsList.add(5);
        numsList.add(90);
        numsList.add(17);

        System.out.println(numsList);
        Collections.sort(numsList);
        System.out.println(numsList);
        System.out.println(Main.binarySearch(numsList, 200));
    }

    public static int binarySearch(ArrayList<Integer> numsList, int target) {
        ArrayList<Integer> numList = new ArrayList<Integer>(numsList);
        int low = 0;
        int high = numList.size()-1;
        int mid = numList.size()/2;
        double median = 0;

        while (true) {
            if (high == low && median != target){
                return -1;
            }

            median = numsList.get(mid);

            if (median == target) {
                return numsList.indexOf(target);
            } else if (median > target) {
                high = mid + 1;
                mid = (high+low)/2;
            } else if (median < target) {
                low = mid + 1;
                mid = (high+low)/2;
            }
        }
    }
}
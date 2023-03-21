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
        System.out.println(Main.binarySearch(numsList, 90));

        int[] listToSort = {7,8,5,4,9,2};
        for(int n: listToSort){
            System.out.print(n + " ");
        }
        System.out.println();
        Main.selectionSort(listToSort);
        for(int n: listToSort){
            System.out.print(n + " ");
        }
        System.out.println();

        int[] listTwoSort = {5,8,1,3,9,6};
        for(int n: listTwoSort){
            System.out.print(n + " ");
        }
        System.out.println();
        Main.insertionSort(listTwoSort);
        for(int n: listTwoSort){
            System.out.print(n + " ");
        }

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

    public static void selectionSort(int[] list){
        int len = list.length;
        for(int i = 0; i < len - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < len; j++){
                if(list[minIndex] > list[j]){
                    minIndex = j;
                }
            }
            int temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
    }
}
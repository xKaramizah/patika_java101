import java.util.Arrays;

public class ArrayFreq {
    static boolean isDone(int[] list, int value) {
        for (int i : list) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] temp = new int[arr.length];
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < temp.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (!isDone(temp, arr[i])) {
                        temp[i] = arr[i];
                    }
                }
            }
            if (temp[i] != 0)
                System.out.println(temp[i] + " sayısı " + count + " kez tekrar edildi");
        }
    }
}

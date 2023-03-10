public class OdevDuplicate {
    static boolean isMet(int[] arr, int value) {
        for (int j : arr) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }

    static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static void main(String[] args) {
        int[] list = {1, 3, 3, 7, 2, 7, 6, 9, 99, 6, 33, 33, 51, 75, 52, 45, 54, 74, 54, 45, 2};
        int[] dList = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length; j++) {
                if (j != i && (list[i] == list[j])) {
                    if (!isMet(dList, list[i]) && isEven(list[i])) {
                        dList[i] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("[ ");
        for (int i : dList) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("]");

    }
}

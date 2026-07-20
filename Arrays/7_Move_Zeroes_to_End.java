public class MoveZeroes {

    public static void moveZeroes(int[] arr) {

        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // No zero present
        if (j == -1) {
            return;
        }
        for (int i = j + 1; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,0,2,3,0,4,0,1};

        moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
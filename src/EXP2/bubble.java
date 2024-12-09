package EXP2;

public class bubble {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Sam", "Mary", "Shelly"};
        printArray(names);

        bubbleSort(names);
        System.out.println("Sorted Array: ");
        printArray(names);
    }

    public static void printArray(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void bubbleSort(String[] names) {
        int n = names.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
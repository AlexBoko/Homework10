public class Main {
    public static void main(String[] args) {
        task1();
       // task2();
      //  task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int b1 : arr) {
            sum += b1;
        }
        System.out.println("Сумма трат за месяц : " + sum);
    }
}
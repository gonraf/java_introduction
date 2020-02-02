package arrays;

public class Exercise {

    public static void main(String[] args) {
        int[] numbers = new int[]{23, 14, 67, 87, 45, 90, 43, 92, 24, 36, 342, 2356};
        // znajdź maksymalną i minimalną wartość w tablicy

        int max = Integer.MIN_VALUE;
        max = numbers[0];
        int min = Integer.MAX_VALUE;
        min = numbers[0];
        double mean = 0.0D;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
            mean += numbers[i];
        }
        mean /= numbers.length;
        System.out.println("Min: " + min + ", max: " + max + ", mean: " + mean);

        for (int elem : numbers) {
            if (elem % 3 == 0) {
                System.out.println(elem + " jest liczbą podzielną przez trzy ");
            }
        }
    }


}

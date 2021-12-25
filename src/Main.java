import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[10];
        for (int i = 0; i < 10; i++) {
            testArray[i] = i;
        }
        // test methods here

    }

    public static int averageValueOfArrayElements(int[] testArray) {
        return arrayTointStream(testArray).sum() / testArray.length;
    }
    public static int minlValueOfArray(int[] testArray){
        return arrayTointStream(testArray).min().getAsInt();
    }

    public static int countElementsEqualZero(int[] testArray){
       return (int) arrayTointStream(testArray).filter(x-> x==0).count();
    }

    public static int countElementsMoreThanZero(int[] testArray){
        return (int) arrayTointStream(testArray).filter(x-> x>0).count();
    }

    public static int[] multiplyElementsOfArray (int[] testArray, int number){
    // use via Arrays.toString
        //arrayTointStream(testArray).map(x -> x * number).forEach(System.out::println);
        return arrayTointStream(testArray).map(x -> x * number).toArray();

    }
    public static IntStream arrayTointStream(int[] array) {
        IntStream intStream = Arrays.stream(array);
        return intStream;
    }
    public static int indexOfMinelement(int[] testArray) {
        return IntStream.range(0, testArray.length).filter(i -> testArray[i] == minlValueOfArray(testArray)).findFirst().orElse(-1);
    }
}



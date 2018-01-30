package task66;

import java.util.Scanner;

public class DegreeOfTwo {
    private static final int DEGREE_NUMBER = 3;

    public static void main(String[] args) {
        System.out.println("Max degree: " + getMaxDegree(getInputString()));
    }

    private static StringBuilder getInputString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your degrees of " + DEGREE_NUMBER + ": ");
        return new StringBuilder().append(scanner.next());
    }

    private static int getMaxDegree(StringBuilder degreesOfTwo) {
        int currentDegree = 0;

        while (degreesOfTwo.length() > 0) {
            ++currentDegree;
            String currentExpectedResultOfPow = calculateExpectedPowResultOfCurDegree(currentDegree);
            String currentActualDegreeFromString = degreesOfTwo.substring(0, currentExpectedResultOfPow.length());
            checkInputDataValidity(currentActualDegreeFromString, currentExpectedResultOfPow);
            degreesOfTwo.delete(0, currentExpectedResultOfPow.length());
        }

        return currentDegree;
    }

    private static String calculateExpectedPowResultOfCurDegree(int currentDegree) {
        Integer currentActualResultOfPow = (int) Math.pow(DEGREE_NUMBER, currentDegree);
        return currentActualResultOfPow.toString();
    }

    private static void checkInputDataValidity(String currentDegreeFromString, String currentExpectedResult) {
        if (!currentDegreeFromString.equals(currentExpectedResult)) {
            throw new WrongSequenceOfDegreesException("Unexpected degree result of " + DEGREE_NUMBER
                    + ". Check input data.");
        }
    }
}

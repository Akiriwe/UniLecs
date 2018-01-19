package task62;

public class Mandarins {
    private static final Integer M = 4;

    private static Integer countMinOfMandarins(Integer m) {
        boolean areConditionsSatisfied = false;
        Integer z = 0;
        Integer n = 2;
        while (!areConditionsSatisfied && n < 5) {
            System.out.println("currentAmountOfPackages = " + n);
            z = m * (n - 1) + m - 1;
            System.out.println("currentAmountOfMandarins = " + z);
            Integer rule1Checker = (m - 1) * n + m - 2;
            System.out.println("rule1Checker = " + rule1Checker);
            Integer rule2Checker = (m - 2) * n  + m - 3;
            System.out.println("rule2Checker = " + rule2Checker);
            Integer rule3Checker = 2 * n + 1;
            System.out.println("rule3Checker = " + rule3Checker);
            areConditionsSatisfied = (z.equals(rule1Checker) &&
                    rule1Checker.equals(rule2Checker) && rule2Checker.equals(rule3Checker));
            System.out.println("areConditionsSatisfied = " + areConditionsSatisfied);
            ++n;
        }
        return z;
    }

    public static void main(String[] args) {
        System.out.println(countMinOfMandarins(M));
    }
}

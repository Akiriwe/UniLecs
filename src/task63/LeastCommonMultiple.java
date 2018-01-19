package task63;

public class LeastCommonMultiple {
    private static Long findGreatestCommonDivisor(Integer... args) {
        Long currentGreatestDivisor = args[0].longValue();

        for (int i = 1; i < args.length; ++i) {
                currentGreatestDivisor = findByEuclidAlgorithm(currentGreatestDivisor.intValue(), args[i]);
        }

        return currentGreatestDivisor;
    }

    private static Long findLeastCommonMultiply(Integer... args) {
        Long leastCommonMultiply = 1L;

        for (Integer arg : args) {
            leastCommonMultiply *= arg;
        }

        return leastCommonMultiply / findGreatestCommonDivisor(args);
    }

    private static Long findByEuclidAlgorithm(int firstArg, int secondArg) {
        return (secondArg > 0) ? findByEuclidAlgorithm(secondArg, firstArg % secondArg) : firstArg;
    }

    public static void main(String[] args) {
        System.out.println(findGreatestCommonDivisor(100,50));
        System.out.println(findLeastCommonMultiply(2,5));
    }
}

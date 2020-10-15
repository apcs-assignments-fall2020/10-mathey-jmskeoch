public class Mathey {

    public static void main(String[] args) {
        System.out.println(randomInteger(3, 7));
        System.out.println(randomInteger(7));
    }

    /**
     * MAX METHODS
     */
    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static double max(double x, double y) {
        return (x > y) ? x : y;
    }

    public static int max(int x, int y, int z) {
        return max(x, max(y, z));
    }

    public static double max(double x, double y, double z) {
        return max(x, max(y, z));
    }

    /**
     * MIN METHODS
     */
     public static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    public static double min(double x, double y) {
        return (x < y) ? x : y;
    }

    public static int min(int x, int y, int z) {
        return min(x, min(y, z));
    }

    public static double min(double x, double y, double z) {
        return min(x, min(y, z));
    }

    /**
     * RANDOM METHODS
     */
    public static int randomInteger(int a, int b) {
        return (int) (Math.random() * (b - a + 1) + a);
    }

    public static int randomInteger(int b) {
        return (int) (Math.random() * (b + 1));
    }

}
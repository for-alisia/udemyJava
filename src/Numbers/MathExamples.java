package Numbers;

public class MathExamples {
    public static void main(String[] args) {
        System.out.println(calcAreaOfCircle(8));
        System.out.println(calcCentripetalForce(0.2, 0.8, 3 ));
    }

    /**
     * This method calculates an area of a circle (area = PI * radius^2)
     * @param radius
     * @return
     */
    public static double calcAreaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calcPathVelocity(double radius, double period) {
        double circumference = 2 * Math.PI * radius;
        return circumference / 3;
    }

    private static double calcCentripetalAcceleration(double pathVelocity, double radius) {
        return Math.pow(pathVelocity, 2) / radius;
    }

    public static double calcCentripetalForce(double accel, double mass) {
        return mass * accel;
    }

    public static double calcCentripetalForce(double mass, double radius, double period) {
        double pathVelocity = calcPathVelocity(radius, period);
        double accel = calcCentripetalAcceleration(pathVelocity, radius);
        return mass * accel;
    }
}

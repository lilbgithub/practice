package interview;

public class AnalogClock {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTES = 6;
    private static final double ANGLE_PER_HOUR_MINUTES = 0.5;

    public static void main(String[] args) {
        int result = findAngle(11, 10);
        System.out.println("Angle is : " + result);
    }

    public static int findAngle(int hours, int minutes) {
        double hourAngle = (hours * DEGREES_PER_HOUR) + (minutes * ANGLE_PER_HOUR_MINUTES);
        double minutesAngle = minutes * DEGREES_PER_MINUTES;

        double diff = Math.abs(hourAngle - minutesAngle);

        if (diff > 180) {
            diff = 360 - diff;
        }

        return (int) diff;
    }
}

package interview;

public class AnalogClock {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTES = 6;
    private static final double DEGREES_PER_HOUR_MINUTES = 0.5;

    public static void main(String[] args) {
        int result = findAngle(6, 30);
        System.out.println("Angle is : " + result);
    }

    public static int findAngle(int hours, int minutes) {
        if (hours > 12 || minutes > 60 || hours < 1 || minutes < 1) {
            throw new IllegalArgumentException("Please enter valid hours and minutes");
        }

        double hourAngle = (hours * DEGREES_PER_HOUR) + (minutes * DEGREES_PER_HOUR_MINUTES);
        double minutesAngle = minutes * DEGREES_PER_MINUTES;

        double diff = Math.abs(hourAngle - minutesAngle);

        if (diff > 180) {
            diff = 360 - diff;
        }
        return (int) diff;
    }
}

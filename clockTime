import java.util.Arrays;

/**
 *
 * @author EP057582
 *
 */

public class clockTime {
    public static void main(String[] args) {
        System.out.println("12:03 -> " + getTime("12:03"));
        System.out.println("00:00 -> " + getTime("00:00"));
        System.out.println("13:00 -> " + getTime("13:00"));
        System.out.println("24:59 -> " + getTime("24:59"));
        System.out.println("21:00 -> " + getTime("21:00"));
    }

    public static String getTime(String time) {
        String endTime = "";

        String[] splitTime = time.split(":");
        String[] digits = new String[4];
        digits[0] = time.substring(0, 1);
        digits[1] = time.substring(1, 2);
        digits[2] = time.substring(3, 4);
        digits[3] = time.substring(4, 5);

        Arrays.sort(digits);
        String minutes;
        int minDistance = 60;
        String timeForMin = splitTime[1];
        int tempMin = 0;

        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                minutes = digits[i] + digits[j];
                tempMin = Integer.parseInt(splitTime[1]) - Integer.parseInt(minutes);

                if (tempMin < minDistance && tempMin > 0) {
                    minDistance = Integer.parseInt(splitTime[1]) - Integer.parseInt(minutes);
                    timeForMin = minutes;
                }
            }
        }

        endTime = splitTime[0] + ":" + timeForMin;

        if (endTime.equals(time)) {
            String hours;
            int minHrsDistance = 25;
            String timeForHrsMin = splitTime[0];
            int tempHrs = 0;

            for (int i = 3; i >= 0; i--) {
                for (int j = 3; j >= 0; j--) {
                    hours = digits[i] + digits[j];
                    tempHrs = Integer.parseInt(splitTime[0]) - Integer.parseInt(hours);

                    if (tempHrs < minHrsDistance && tempHrs > 0) {
                        minHrsDistance = Integer.parseInt(splitTime[0]) - Integer.parseInt(hours);
                        timeForHrsMin = hours;
                    }
                }
            }
            endTime = timeForHrsMin + ":" + timeForMin;
        }
        return endTime;
    }

}

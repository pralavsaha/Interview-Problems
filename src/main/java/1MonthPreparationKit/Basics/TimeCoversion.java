package Arrays.Basics;

public class TimeCoversion {

    public static String timeConversion(String s) {

        String period = s.substring(s.length()-2);
        String[] time = s.substring(0,s.length()-2).split(":");
        int hour = Integer.parseInt(time[0]);
        String min = time[1];
        String sec = time[2];

        if(period.equalsIgnoreCase("AM")) {
            if(hour == 12)
                hour = 0;
        }
        else if(period.equalsIgnoreCase("PM")) {
            if(hour != 12)
                hour += 12;
        }

        return String.format("%02d:%s:%s", hour, min, sec);

    }

}

public class Question_5 {
    public static String date24To12(String date) {
        try {
            String[] time = date.split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            String period = "AM";
            if (hour >= 12) {
                period = "PM";
                if (hour > 12) {
                    hour -= 12;
                }
            }
            return String.format("%02d:%02d%s", hour, minute, period);
        } catch (Exception e) {
            return "Invalid time format, please use HH:MM";
        }
    }

    public static void main(String[] args) {
        System.out.println(date24To12("17:29"));
    }
}

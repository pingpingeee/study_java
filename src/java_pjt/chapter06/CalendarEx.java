package java_pjt.chapter06;

import java.util.Calendar;

public class CalendarEx {
    public static void printCalendar(String msg, Calendar cal) {
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int ampm = cal.get(Calendar.AM_PM);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int milliSecond = cal.get(Calendar.MILLISECOND);

        System.out.print(msg + " : " + year + "-" + month + "-" + day);
//        System.out.println(dayOfWeek); // 일:1, 월:2, 화:3, 수:4 ...
//        System.out.println(Calendar.FRIDAY);
        switch (dayOfWeek) {
            case Calendar.SUNDAY: System.out.print("일요일"); break;
            case Calendar.MONDAY: System.out.print("월요일"); break;
            case Calendar.TUESDAY: System.out.print("화요일"); break;
            case Calendar.WEDNESDAY: System.out.print("수요일"); break;
            case Calendar.THURSDAY: System.out.print("목요일"); break;
            case Calendar.FRIDAY: System.out.print("금요일"); break;
            case Calendar.SATURDAY: System.out.print("토요일"); break;
        }
        System.out.print("(" + hourOfDay + ")"); // 24시간 기준
        if (ampm == Calendar.AM) {
            System.out.print("오전 ");
        } else {
            System.out.print("오후 ");
        }
        System.out.println(hour + "시 " + minute + "분 " + second + "초 " + milliSecond + "밀리초");
    }

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        printCalendar("현재", now);

        Calendar firstDate = Calendar.getInstance();
        firstDate.clear(); // 날짜, 시간정보를 삭제
        firstDate.set(2016, 11, 25);
        firstDate.set(Calendar.HOUR_OF_DAY, 20);
        firstDate.set(Calendar.MINUTE, 30);

        printCalendar("처음 데이트한 날 : ", firstDate);
    }
}

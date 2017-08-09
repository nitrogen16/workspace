package workWithDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* 
Работа с датами
*/
public class Solution {

    public static void main(String[] args) {
        printDate("21.4.2014 15:56:45");
        System.out.println();
        printDate("21.4.2014");
        System.out.println();
        printDate("17:33:40");
    }

    public static void printDate(String date) {
        //напишите тут ваш код
        boolean printDate = false;
        boolean printTime = false;

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = null;

        if (date.contains(":")) {
            sdf = new SimpleDateFormat("HH:mm:ss");
            printTime = true;
        }

        if (date.contains(".")) {
            sdf = new SimpleDateFormat("dd.MM.yy");
            printDate = true;
        }


        if (date.contains(" ")) {
            sdf = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
            printDate = true;
            printTime = true;
        }

        if (sdf == null) {
        	return;
        }
            

        try {
            calendar.setTime(sdf.parse(date));
        } catch (ParseException e) {
            return;
        }

        if (printDate) {
            System.out.println("День: " + calendar.get(Calendar.DATE));
            System.out.println("День недели: " + ((calendar.get(Calendar.DAY_OF_WEEK) - 1) == 0 ? 7 : calendar.get(Calendar.DAY_OF_WEEK) - 1));
            System.out.println("День месяца: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("День года: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Неделя месяца: " + calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println("Неделя года: " + calendar.get(Calendar.WEEK_OF_YEAR));
            System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Год: " + calendar.get(Calendar.YEAR));
        }

        if (printTime) {
            System.out.println("AM или PM: " + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
            System.out.println("Часы: " + calendar.get(Calendar.HOUR));
            System.out.println("Часы дня: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
            System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
        }
    }
}
//	public static void printDate(String date) {
//		// напишите тут ваш код
//		SimpleDateFormat simpleDateFormat = getSimpleDateFormat(date);
//		Calendar calendar = Calendar.getInstance();
//
//		if (date != null) {
//			try {
//				calendar.setTime(simpleDateFormat.parse(date));
//
//				switch (simpleDateFormat.toPattern()) {
//				case "dd.MM.yy HH:mm:ss":
//					printFullDateInfo(calendar);
//					break;
//				case "dd.MM.yy":
//					printMiddleDateInfo(calendar);
//					break;
//				case "HH:mm:ss":
//					printJuniorDateInfo(calendar);
//					break;
//				}
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//	private static void printJuniorDateInfo(Calendar calendar) {
//		// TODO Auto-generated method stub
//		System.out.println("АМ или РМ: " + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
//		System.out.println("Часы: " + calendar.get(Calendar.HOUR));
//		System.out.println("Часы дня: " + calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
//		System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
//	}
//
//	private static void printMiddleDateInfo(Calendar calendar) {
//		// TODO Auto-generated method stub
//		System.out.println("День: " + calendar.get(Calendar.DATE));
//		System.out.println("День недели: " + (calendar.get(Calendar.DAY_OF_WEEK) >= 2 ? calendar.get(Calendar.DAY_OF_WEEK) - 1 : 7));
//		System.out.println("День месяца: " + calendar.get(Calendar.DAY_OF_MONTH));
//		System.out.println("День года: " + calendar.get(Calendar.DAY_OF_YEAR));
//		System.out.println("Неделя месяца: " + calendar.get(Calendar.WEEK_OF_MONTH));
//		System.out.println("Неделя года: " + calendar.get(Calendar.WEEK_OF_YEAR));
//		System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
//		System.out.println("Год: " + calendar.get(Calendar.YEAR));
//	}
//
//	private static void printFullDateInfo(Calendar calendar) {
//		// TODO Auto-generated method stub
//		System.out.println("День: " + calendar.get(Calendar.DATE));
//		System.out.println("День недели: " + (calendar.get(Calendar.DAY_OF_WEEK) >= 2 ? calendar.get(Calendar.DAY_OF_WEEK) - 1 : 7));
//		System.out.println("День месяца: " + calendar.get(Calendar.DAY_OF_MONTH));
//		System.out.println("День года: " + calendar.get(Calendar.DAY_OF_YEAR));
//		System.out.println("Неделя месяца: " + calendar.get(Calendar.WEEK_OF_MONTH));
//		System.out.println("Неделя года: " + calendar.get(Calendar.WEEK_OF_YEAR));
//		System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
//		System.out.println("Год: " + calendar.get(Calendar.YEAR));
//		System.out.println("АМ или РМ: " + (calendar.get(Calendar.AM_PM) == 0 ? "AM" : "PM"));
//		System.out.println("Часы: " + calendar.get(Calendar.HOUR));
//		System.out.println("Часы дня: " + calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
//		System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
//
//	}
//
//	private static SimpleDateFormat getSimpleDateFormat(String date) {
//		if (date.length() <= 8) {
//			return new SimpleDateFormat("HH:mm:ss");
//		}
//		if (date.length() > 8 && date.length() <= 10) {
//			return new SimpleDateFormat("dd.MM.yy");
//		}
//		if (date.length() > 10) {
//			return new SimpleDateFormat("dd.MM.yy HH:mm:ss");
//		}
//		return null;
//	}

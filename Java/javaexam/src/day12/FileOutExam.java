package day12;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileOutExam {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		try(FileWriter writer = new FileWriter("C:/iotest/today.txt");
				PrintWriter out = new PrintWriter(writer)) {
			GregorianCalendar cal = new GregorianCalendar();
			int yearNum = cal.get(Calendar.YEAR);
			int dateNum = cal.get(Calendar.DAY_OF_YEAR);
			int monthNum = dateNum / 30 + 1;
			int dayNum = dateNum % 30;
			int day = cal.get(Calendar.DAY_OF_WEEK);
			
			out.printf("오늘은 %d년 %d월 %d일입니다.\r\n", yearNum, monthNum, dayNum);
			out.printf("오늘은 %s입니다.\r\n", getWeek(day));
			
			cal = new GregorianCalendar(1992, 12-1, 7); // gregorian의 moth는 0부터 읽음
			out.printf("%s은 %s에 태어났습니다.", "고예성", getWeek(cal.get(Calendar.DAY_OF_WEEK)));
			System.out.println("저장이 완료되었습니다.");
			
		} catch(Exception e) {
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
	public static String getWeek(int num) {
		String day = "";
		switch(num) {
		case 1:
			day = "일요일";
			break;
		case 2:
			day = "월요일";
			break;
		case 3:
			day = "화요일";
			break;
		case 4:
			day = "수요일";
			break;
		case 5:
			day = "목요일";
			break;
		case 6:
			day = "금요일";
			break;
		case 7:
			day = "토요일";
			break;
		}
		return day;
	}
}
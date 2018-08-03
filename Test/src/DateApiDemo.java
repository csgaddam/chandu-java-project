import java.util.Date;
import java.time.LocalDateTime;

public class DateApiDemo {
	public static void main(String[] args) throws InterruptedException {
		/*LocalDate date = LocalDate.now();
		System.out.println("This is the system generated date "+date);
		System.out.println("********************************");
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();
		System.out.println("This is the customized date "+dd+"..."+mm+"..."+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println("\n");
		System.out.println("Now to print hour,minute,second and nano second details\n");
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int ns = time.getNano();
		System.out.println("customied time ");
		System.out.printf("%d:%d:%d:%d",h,m,s,ns);
		System.out.println("\n*****************************");*/
		
		
		/*LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		int h = dt.getHour();
		int m = dt.getMinute();
		int s = dt.getSecond();
		int ns = dt.getNano();
		System.out.printf("%d/%d/%d",mm,dd,yyyy);
		System.out.printf("\n%d:%d:%d:%d",h,m,s,ns);*/
		
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		System.out.println("**********************");
		
		Date d = new Date();
		System.out.println(d);
		//Thread.sleep(1000);
		System.out.println("*********************");
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d.after(d1));
		System.out.println(d.before(d1));
		System.out.println(d.compareTo(d1));
		}
}

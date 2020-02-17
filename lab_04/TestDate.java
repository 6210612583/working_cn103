import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author xxxxxxxxxx <xxxxxxxxxx@cn103>
 */

public class TestDate {
	public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Date: " + d);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm z");
        String sd = sdf.format(d);
        System.out.println("Format date: " + sd);

	}
}


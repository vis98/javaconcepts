import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDateFormatter {
    // ThreadLocal that holds SimpleDateFormat for each thread
    private static final ThreadLocal<SimpleDateFormat> formatter =
        ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static void main(String[] args) {
        Runnable task = () -> {
            String dateStr = "2025-07-26";
            try {
                Date parsedDate = formatter.get().parse(dateStr);
                String formatted = formatter.get().format(parsedDate);
                System.out.println(Thread.currentThread().getName() + " - Parsed: " + parsedDate + " - Formatted: " + formatted);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        };

        // Run task in multiple threads to simulate concurrency
        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");

        t1.start();
        t2.start();
        t3.start();
    }
}

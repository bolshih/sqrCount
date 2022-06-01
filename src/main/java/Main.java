import ru.netology.sqr.SQRservice.SQRservice;

public class Main {
    public static void main(String[] args) {
        SQRservice service = new SQRservice();
        int sqrNumber = service.sqrCount(100, 300);
        System.out.println(sqrNumber);
    }
}

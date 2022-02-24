import java.util.Scanner;

public class HomeWork_8 {
    public static void main(String[] args) {
        //Task#1:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Input Your Status Code Here:");
        int statusCode = scanner.nextInt();
        switch (statusCode) {
            case 200:
                System.out.println( "Ok");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanently");
                break;
            case 303:
                System.out.println("See Other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirect");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
                case 404:
                    System.out.println("Not Found");
                    break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal Service Error");
                break;
            case 503:
                System.out.println("Service Unavailable");
            default:
                System.out.println("Invalid Status Code! Please Try Agian!");
        }

    }
}

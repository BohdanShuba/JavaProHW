import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RequestDB requestDB = new RequestDB();

        while (true) {
            System.out.println("1: Show all apartments\n" +
                    "2: Select district\n" +
                    "3: Select a street\n" +
                    "4: Select a building\n" +
                    "5: Select apartment price\n" +
                    "6: Select Area of the apartment");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            switch (s) {
                case "1":
                    requestDB = new RequestDB();
                    requestDB.showResult();
                    break;
                case "2":
                    System.out.print("Enter district name: ");
                    String dst = sc.nextLine();
                    requestDB.addParameter("Dst", dst);
                    requestDB.showResult();
                    break;
                case "3":
                    System.out.print("Enter street name: ");
                    String st = sc.nextLine();
                    requestDB.addParameter("St", st);
                    requestDB.showResult();
                case "4":
                    System.out.print("Enter street name: ");
                    String str = sc.nextLine();
                    System.out.print("Enter building number: ");
                    int bl = sc.nextInt();
                    requestDB.addParameter("St", str, "Bldg", bl);
                    requestDB.showResult();
                    break;
                case "5":
                    System.out.print("Enter MIN price: ");
                    double minP = sc.nextDouble();
                    System.out.print("Enter MAX price: ");
                    double maxP = sc.nextDouble();
                    requestDB.addParameter("Price", minP, maxP);
                    requestDB.showResult();
                    break;
                case "6":
                    System.out.print("Enter MIN area: ");
                    double minA = sc.nextDouble();
                    System.out.print("Enter MAX area: ");
                    double maxA = sc.nextDouble();
                    requestDB.addParameter("Area", minA, maxA);
                    requestDB.showResult();
                    break;
            }

        }
    }
}
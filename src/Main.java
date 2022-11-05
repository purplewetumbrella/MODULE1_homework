import java.util.Scanner;
import java.util.InputMismatchException;

@SuppressWarnings("ALL")
public class Main{static double a =2.0;
    static boolean flagMain = false;
    private static Scanner scanner ;
    public static void main(String[] args) {
           while (!flagMain){showMainDialog();
            workWithChoice(readInputUserChoice());
        }}
    @SuppressWarnings("unused")
    private static void showMainDialog() {
        System.out.println("Hello !!! Please, make your choice:");
        System.out.println("Press key \"1\" to input Integer number");
        System.out.println("Press key \"2\" to input Float number");
        System.out.println("Press key \"3\" to input Long number");
        System.out.println("Press key \"4\" to input Double number");
        System.out.println("Press key \"5\" to Exit program");

    }
    @SuppressWarnings("unused")
    private static int readInputUserChoice() {
        int input = 0;
        boolean flagReadInputUserChoice = false;
        while (!flagReadInputUserChoice) {
            // read input data as string without space
            scanner = new Scanner(System.in);
            String input_s = scanner.next();
            // local scanner to read int from string without space
            Scanner sc_str = new Scanner(input_s);
            try {
                input = sc_str.nextInt();
                flagReadInputUserChoice = true;
            } catch (InputMismatchException IME) {
                System.err.println("Wrong symbol(s): \"" + input_s + "\".\n");
                showMainDialog();
            }
        }
        return input;
    }

   private static void workWithChoice(int choice) {
        switch (choice) {
            case 1:
                oneInt();
                break;
            case 2:
                oneFloat();
                break;
            case 3:
                oneLong();
                break;
            case 4:
                oneDouble();
                break;
            case 5:
                stopProgram();
                break;
            default:
                workWithError();
                break;
        }
    }


    @SuppressWarnings("unused")
    public static void oneLong(){
        Scanner in = new Scanner(System.in);
        System.out.print("Long a number: ");
        String data = in.next();
        String b = "";
        double x1 = 62;
        double data1 = Double.parseDouble(data);
        if (data1 < 0) {
            b = b + "1 ";
            data1 = -data1;}
        else {b = b + "0 ";}
        while (x1 >= 0) {
            double a1 = Math.pow(a, x1);
            if (data1 >= a1) {
                data1 = data1 - a1;
                b = b + "1";
            } else {b = b+ "0";}
            x1--;}
        System.out.println("Long: " + b);


    }
    @SuppressWarnings("unused")
    public static void oneInt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Int a number: ");
        String data = in.next();
        String b = "";
        double x1 = 30;
        double data1 = Integer.parseInt(data);
        if (data1 < 0) {
            b = b + "1 ";
            data1 = -data1;}
        else {b = b + "0 ";}
        while (x1 >= 0) {
            double a1 = Math.pow(a, x1);
            if (data1 >= a1) {
                data1 = data1 - a1;
                b = b + "1";
            } else {b = b+ "0";}
            x1--;}
        System.out.println("Int: " + b);}

    @SuppressWarnings("unused")
    public static void oneDouble(){
        Scanner in = new Scanner(System.in);
        System.out.print("Doulble a number: ");
        String data = in.next();
        double x1 = 11, x2 =51 , A , B;
        String data1 , dataA , dataB, numder2 = "";
        int minus = data.indexOf("-");
        int symbol = data.length();
        if(minus != -1){
            data1 = data.substring(1 , symbol); symbol--; numder2= "1 ";}
        else {data1 = data; numder2= "0 ";}
        int dot = data1.indexOf(".");
        int comma = data1.indexOf(",");
        if (dot != -1){
            dataA = data1.substring(0,dot);
            dataB = data1.substring(dot,symbol);
            A = Double.parseDouble(dataA);
            B = Double.parseDouble(dataB);}
        else if (comma != -1) {
            dataA = data1.substring(0,comma);
            dataB = data1.substring(comma,symbol);
            A = Double.parseDouble(dataA);
            B = Double.parseDouble(dataB.replace(",","."));}
        else {
            dataA = data1;
            dataB = "0";
            A = Double.parseDouble(dataA);
            B = Double.parseDouble(dataB);}
        while (x1 >= 0) {
            double a1 = Math.pow(a, x1);
            if (A >= a1) {A = A - a1;
                numder2 = numder2 + "1";}
            else {numder2 = numder2 + "0";}
            x1--;}
        while (x2 > 0){
            B = B*a;
            x2--;
            if (B>=1){
                B = B -1;
                numder2=numder2+ "1";}
            else {numder2=numder2 + "0";}}
        System.out.println("Double :" + numder2);

    }
    @SuppressWarnings("unused")
    public static void oneFloat() {
        Scanner in = new Scanner(System.in);
        System.out.print("Float a number: ");
        String data = in.next();
        double x1 = 7, x2 =22 , A , B;
        String data1 , dataA , dataB, numder2 = "";
        int minus = data.indexOf("-");
        int symbol = data.length();
        if(minus != -1){
            data1 = data.substring(1 , symbol); symbol--; numder2= "1 ";}
        else {data1 = data; numder2= "0 ";}
        int dot = data1.indexOf(".");
        int comma = data1.indexOf(",");
        if (dot != -1){
            dataA = data1.substring(0,dot);
            dataB = data1.substring(dot,symbol);
            A = Double.parseDouble(dataA);
            B = Double.parseDouble(dataB);}
        else if (comma != -1) {
            dataA = data1.substring(0,comma);
            dataB = data1.substring(comma,symbol);
            A = Double.parseDouble(dataA);
            B = Double.parseDouble(dataB.replace(",","."));}
        else {
            dataA = data1;
            dataB = "0";
            A = Double.parseDouble(dataA);
            B = Double.parseDouble(dataB);}
        while (x1 >= 0) {
            double a1 = Math.pow(a, x1);
            if (A >= a1) {A = A - a1;
                numder2 = numder2 + "1";}
            else {numder2 = numder2 + "0";}
            x1--;}
        while (x2 > 0){
            B = B*a;
            x2--;
            if (B>=1){
                B = B -1;
                numder2=numder2+ "1";}
            else {numder2=numder2 + "0";}}
        System.out.println("Float :" + numder2);
    }
    private static void stopProgram() {
        flagMain = true;
        System.out.println("Your choice is 5. Exit program.");
    }
    private static void workWithError() {
        System.err.println("Wrong choice. Try again!\n");
    }
}
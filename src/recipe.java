import java.util.Scanner;

public class recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        float rate = sc.nextFloat(); // Float 실수는 nextFloat() 메서드로 받습니다.
        String input1 = sc.next();
        String input2 = sc.next();
        String input3 = sc.next();
        String input4 = sc.next();
        String input5 = sc.next();
        String input6 = sc.next();
        String input7 = sc.next();
        String input8 = sc.next();
        String input9 = sc.next();
        String input10 = sc.next();

        System.out.println("[" + title + "]");
        System.out.println("[" + Math.round(rate) + " " + "(" + Math.round(rate) * 20 + ")" + "%" + "]");
        System.out.println("1." + input1 + ".");
        System.out.println("2." + input2 + ".");
        System.out.println("3." + input3 + ".");
        System.out.println("4." + input4 + ".");
        System.out.println("5." + input5 + ".");
        System.out.println("6." + input6 + ".");
        System.out.println("7." + input7 + ".");
        System.out.println("8." + input8 + ".");
        System.out.println("9." + input9 + ".");
        System.out.println("10." + input10 + ".");
    }
}
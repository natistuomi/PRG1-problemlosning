import java.util.Scanner;

public class uppgift {

    public static void main (String[] args){
        String s = "Test phrase";
        String r = reverse(s);
        String camel = camelCase(s);
        System.out.print(s  + " blir baklänges till " + r + " och i camelcase till " + camel);

        String a = "apa";
        if(palindrom(a)){
            System.out.println("Palindrom!");
        }
        else{
            System.out.println("Inte en palindrom");
        }

        System.out.println("Summan av alla tal framtills dess: " + sum());

        System.out.println("Primtal framtills 100 är: \n" + primeUntil(10));
        // Fungerar minst framtills 100

        System.out.println("Summan av alla tal med 3 framtills 100000: " + addAllWithThree(100000));

        System.out.println("Alla primtalstvillingar framills 10000: \n" + primeTwins(100));
        // Fungerar framtills 10 000

        System.out.println("Alla pythagoreiska tripplar framtills x: \n" + pythTriples(100));
        // Fungerar iallafall framtills 100
    }





    public static String reverse(String s){
        String New = "";
        for(int i = s.length()-1; i >= 0; i--){
            New = New + s.charAt(i);
        }
        return New;
    }

    public static String camelCase(String s){
        String New = "";
        String letter;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') {
                i += 1;
                letter = "" + s.charAt(i);
                New = New + letter.toUpperCase();
            }
            else{
                New = New + s.charAt(i);
            }
        }
        return New;
    }

    public static boolean palindrom(String s){
        int length = s.length()/2;
        for(int i = 0; i < length; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static int sum(){
        Scanner tgb = new Scanner(System.in);
        System.out.print("Addera alla heltal fram till och med... ");
        int N = Integer.parseInt(tgb.nextLine());
        int x = 0;
        for(int i = 1; i <= N; i++){
            x += i;
        }
        return x;
    }

    public static String primeUntil(int n){
        String s = "";
        for(double i = 2; n > 0; i++){
            if(isPrime(i)){
                s = s + (int) i + "\n";
                n -= 1;
            }
        }
        return s;
    }

    public static boolean isPrime(double a){
        for(int i = 2; i < a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double addAllWithThree(double a){
        double x = 0;
        for(double i = 1; i <= a; i++){
            if(includesThree(i)){
                x += i;
            }
        }
        return x;
    }

    public static boolean includesThree(double a){
        String s = "" + a;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '3'){
                return true;
            }
        }
        return false;
    }

    public static String primeTwins(double n){
        String s = "";
        double last = 3;
        for(double i = 5; i <= n; i++){
            if(isPrime(i)){
                if((i - last) == 2){
                    s = s + (int) last + " & " + (int) i + "\n";
                }
                last = i;
            }
            else{
                last = 0;
            }
            i += 1;
        }
        return s;
    }

    public static String pythTriples(double x){
        String s = "";
        double c;
        for(int a = 1; a <= x; a++){
            for(int b = 1; b <= x; b++){
                c = Math.sqrt(a*a + b*b);
                if(isInteger(c)){
                    s = s + a + " " + b + " " + (int) c + "\n";
                }
            }
        }
        return s;
    }

    public static boolean isInteger(double a){
        int b = (int) a;
        return b == a;
    }

}

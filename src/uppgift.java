import java.util.Scanner;

public class uppgift {

    public static void main (String[] args){
        String s = "Test phrase";
        String r = reverse(s);
        System.out.println(s + "\n" + r);

        String camel = camelCase(s);
        System.out.println(camel);

        String a = "apa";
        if(palindrom(a)){
            System.out.println("Palindrom!");
        }
        else{
            System.out.println("Inte en palindrom");
        }

        System.out.println(sum());

        System.out.println(primtal(100));

        System.out.println(addAllWithThree(100000));

        System.out.println(primtalsTvillingar(1000000));
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

    public static String primtal(int n){
        String s = "";
        boolean a;
        for(int i = 2; n > 0; i++){
            a = true;
            for(int c = 2; c < i; c++){
                if(i % c == 0){
                    c = i;
                    a = false;
                }
            }
            if(a){
                s = s + i + " ";
                n -= 1;
            }
        }
        return s;
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

    public static String primtalsTvillingar(int n){
        String s = "";
        boolean a;
        int one = 3;
        for(int i = 4; i <= n; i++){
            a = true;
            for(int c = 2; c < i; c++){
                if(i % c == 0){
                    c = i;
                    a = false;
                }
            }
            if(a){
                if(i - one == 2){
                    s = s + " " + one + " " + i + " ";
                }
                one = i;
            }
        }
        return s;
    }

}

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

}

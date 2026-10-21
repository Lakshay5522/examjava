public class Patterns {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j);
            System.out.println();
        }
        String str = "RKT";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) System.out.print(str.charAt(j));
               System.out.println();
           }
    }
}

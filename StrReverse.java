import java.util.Scanner;

class StrReverse {
    public static void main(String[] args){
        String originalStr,reverStr = "";
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        originalStr = sc.nextLine();
        System.out.println("Your main String is :"+ originalStr);
        for(int i = 0; i<originalStr.length();i++){
            ch = originalStr.charAt(i);
            reverStr = ch + reverStr;
        }
        System.out.println("Reverse String is :"+ reverStr);



    }
}
// import java.util.Scanner;

// public class StrReverse {
//     public static void main(String[] args) {
//         String originalStr,reverStr = "";
//         char ch;
//         Scanner sc = new Scanner(System.in);
//         originalStr = sc.nextLine();
//         for(int i = 0;i<originalStr.length();i++){
//             ch = originalStr.charAt(i);
//             reverStr = ch + reverStr;
//         }
//         System.out.println(reverStr);
//     }
// }

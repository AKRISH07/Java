package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeElement {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Elements");
        int num = sc.nextInt();
        String str = "";
        System.out.println("Enter Elements");
        for (int var = 0; var <= num; var++) {
            str = sc.nextLine();
            al.add(str);
        }
        System.out.println("Enter Element To Search");
        String srch = sc.nextLine();
        System.out.println("Enter Element To Replace With");
        String rep = sc.nextLine();
        int src;
        for (String elem : al) {
            if (elem.contains(srch)) {
                src = al.indexOf(srch);
                al.set(src, rep);
            }
        }
        for (String list : al) {
            System.out.println(list);

        }
        sc.close();
    }
}
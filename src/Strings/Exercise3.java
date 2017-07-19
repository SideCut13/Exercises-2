package Strings;

/**
 * Created by Anna Zdrojewska on 2017-02-23.
 * Email: anna_zdrojewska@interia.eu
 *
 *
 * Created for KM-PROGRAMS
 * http://km-programs.pl/
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {
    public static void main(String[] args) {
        String address = "";
        String address2 = "";
        int a = 0, b = 0, c = 0;
        //it's working for 10 addresses
        for(int i = 0; i< 10; i++){
            System.out.println("Enter the address:");
            Scanner sc = new Scanner(System.in);
            address = sc.nextLine();
            //regex of the correct address, name of street with capital letters
            Pattern pattern = Pattern.compile("ul. [A-Z]+ [1-90-9]+ [0-9]{2}-[0-9]{3} (Kraków|Warszawa|Wrocław)");
            //check address with the pattern by matcher
            Matcher matcher = pattern.matcher(address);

            boolean found = false;
            while (matcher.find()){
                System.out.println("CORRECT ADDRESS");
                found = true;
            }
            //alternative for wrong address
            if(!found){
                System.out.println("Wrong address, please enter again:");
                Scanner sc2 = new Scanner(System.in);
                address2 = sc2.nextLine();
                boolean found2 = false;
                Matcher matcher2 = pattern.matcher(address2);
                while (matcher2.find()){
                    System.out.println("CORRECT ADDRESS");
                    found2 = true;
                }
                //count a numbers of addresses with a different cities
                if(address2.contains("Kraków")){
                    a++;
                }
                if(address2.contains("Warszawa")){
                    b++;
                }
                if(address2.contains("Wrocław")){
                    c++;
                }
            }
            //count for addresses entered correctly for the first time
            if(address.contains("Kraków")){
                a++;
            }
            if(address.contains("Warszawa")){
                b++;
            }
            if(address.contains("Wrocław")){
                c++;
            }
        }
        //check the number of addresses from different cities
        if(a>=b && a >=c){
            System.out.println("Most addresses is from Kraków: " + a);
        }
        if(b>=a && b>=c){
            System.out.println("Most addresses is from Warszawa: " + b);
        }
        if(c>=a && c>=b)
        {
            System.out.println("Most addresses is from Wrocław: " + c);
        }
    }
}

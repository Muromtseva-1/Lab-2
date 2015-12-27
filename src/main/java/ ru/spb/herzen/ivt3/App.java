package  ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i = 1 ;
       RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println("Task №1");
        List<String> randomame = new ArrayList<String>();
        for (i=0;i<15;i=i +1) {
            String name = rnd.next();
            randomame.add(name);
        System.out.println((i+1)+" - " + randomame.get(i));
                             }
        System.out.println("Task №2");
        Collections.sort(randomame);
        for (i=0;i<15;i=i +1) {
            System.out.println((i+1)+" - " + randomame.get(i));
        }
        System.out.println("Task №3");
        for (i=2;i<4;i=i +1) {
            System.out.println((i+1)+" - " + randomame.get(i));
        }
        System.out.println("Task №4");
        for (i=0;i<15;i=i +1) {
           System.out.println((i+1)+" - " + randomame.get(i).toUpperCase());
        }
         int k = 0;
        System.out.println("Task №5");
        ArrayList<Integer> numb = new ArrayList<Integer>() ;
        for (i=0;i<30;i++){
         numb.add((int)(Math.random()*100));
         if ( numb.get(i)%2==0) { k ++ ; }
         System.out.println(numb.get(i));
        }
         System.out.println("The number of even elements is : "+k);
        k=0;
        System.out.println("Task №6");
        String myname = "Anna" ;
        char[] MyNameChar = myname.toCharArray() ;
        Arrays.sort(MyNameChar);
        for( char value : MyNameChar ){
            System.out.println(value);
        }
        System.out.println("Task №7");
        String vowel = "eyuioaEYUIOA";
        String val = "";
        for ( char value : MyNameChar ){
            if ( vowel.contains(String.valueOf(value))) {k++ ;}
        }
        System.out.println("The number of vowel: "+k);
    }
}

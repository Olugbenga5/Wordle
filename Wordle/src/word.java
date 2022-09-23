import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class word {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/christianfashole/Downloads/wordlewords.txt");
        File file1 = new File("/Users/christianfashole/Downloads/allowable.txt");
        Scanner scc = new Scanner(System.in);
        Scanner sc = new Scanner(file);
        Scanner scan = new Scanner(file1);

        String temp = "";
        File readin = new File("/Users/christianfashole/Downloads/wordlewords.txt");
        Scanner read = new Scanner(readin);
        String[] wordsarr = new String[0];
        while (read.hasNextLine()) {
            temp = temp.concat("," + read.next());
            wordsarr = new String[temp.length()];
            wordsarr = temp.split(",");
        }
        Random r = new Random();
        int randomNumber = r.nextInt(wordsarr.length);
        String randoo = wordsarr[randomNumber];
        System.out.println(wordsarr[randomNumber]);

        String word = scc.nextLine();

        //System.out.println(sc.nextLine());

        String fileContent = "";

        while (scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }



/*
        while ((word.length() != 5) || !(fileContent.contains(word))) {
            if ((word.length() != 5)) {
                System.out.println("The word " + word + " does not have 5 letters.");
            } else {
                System.out.println("The word " + word + " is not in the word list.");
            }
            // Ask for a new word
            System.out.println("Please, submit a new 5-letter word.");
            //System.out.print("--> " + (index + 1) + ") ");
            word = scc.nextLine();
        }

 */
        //word.charAt(0);

        if (word.contains(randoo) || !(word.contains(randoo))) {

/*
            char c = word.charAt(i);
            char c1 = word.charAt(i + 1);
            char c2 = word.charAt(i + 2);
            char c3 = word.charAt(i + 3);
            char c4 = word.charAt(i + 4);
            //char c5 = word.charAt(i+5);

 */


            if (word.charAt(0) == randoo.charAt(0)) {
                System.out.print("2 ");
            } else if (!(word.charAt(0) == randoo.charAt(0))) {
                System.out.print("0");
            }
            if (word.charAt(1) == randoo.charAt(1)) {
                System.out.print(" 2");
            } else if (!(word.charAt(1) == randoo.charAt(1))) {
                System.out.print("0");
            }
            if (word.charAt(2) == randoo.charAt(2)) {
                System.out.print(" 2");
            } else if (!(word.charAt(2) == randoo.charAt(2))) {
                System.out.print("0");
            }
            if (word.charAt(3) == randoo.charAt(3)) {
                System.out.print(" 2");
            } else if (!(word.charAt(3) == randoo.charAt(3))) {
                System.out.print("0");
            }
            if (word.charAt(4) == randoo.charAt(4)) {
                System.out.print(" 2");
            } else if (!(word.charAt(4) == randoo.charAt(4))) {
                System.out.print("0");
            }


        }
        String word1 = scc.nextLine();

        if (word1.contains(randoo) || !(word1.contains(randoo))) {

/*
            char c = word.charAt(i);
            char c1 = word.charAt(i + 1);
            char c2 = word.charAt(i + 2);
            char c3 = word.charAt(i + 3);
            char c4 = word.charAt(i + 4);
            //char c5 = word.charAt(i+5);

 */


            if (word1.charAt(0) == randoo.charAt(0)) {
                System.out.print("2 ");
            } else if (!(word1.charAt(0) == randoo.charAt(0))) {
                System.out.print("0");
            }
            if (word1.charAt(1) == randoo.charAt(1)) {
                System.out.print(" 2");
            } else if (!(word1.charAt(1) == randoo.charAt(1))) {
                System.out.print("0");
            }
            if (word1.charAt(2) == randoo.charAt(2)) {
                System.out.print(" 2");
            } else if (!(word1.charAt(2) == randoo.charAt(2))) {
                System.out.print("0");
            }
            if (word1.charAt(3) == randoo.charAt(3)) {
                System.out.print(" 2");
            } else if (!(word1.charAt(3) == randoo.charAt(3))) {
                System.out.print("0");
            }
            if (word1.charAt(4) == randoo.charAt(4)) {
                System.out.print(" 2");
            } else if (!(word1.charAt(4) == randoo.charAt(4))) {
                System.out.print("0");
            }


        }
        /*
        else  {
                /*
                char c = word.charAt(i);
                char c1 = word.charAt(i+1);
                char c2 = word.charAt(i+2);
                char c3 = word.charAt(i+3);
                char c4 = word.charAt(i+4);
                //char c5 = word.charAt(i+5);



                if (!(word.charAt(0) == randoo.charAt(0))) {
                    System.out.print("0 ");
                }
                if (!(word.charAt(1) == randoo.charAt(1))) {
                    System.out.print(" 0");
                }
                if (!(word.charAt(2) == randoo.charAt(2))) {
                    System.out.print(" 0");
                }
                if (!(word.charAt(3) == randoo.charAt(3))) {
                    System.out.print(" 0");
                }
                if (!(word.charAt(4) == randoo.charAt(4))) {
                    System.out.print(" 0");
                }
            }

         */
    }
}




        //System.out.println(fileContent);





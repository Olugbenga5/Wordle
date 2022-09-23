import java.io.*;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class example {
    public static String rando;
    static String s3;
    static int count;
    static int end;

    public static void main(String [] args){
        Dictionary dictionary = new Dictionary();
        Random rand = new Random();
        int num = rand.nextInt(dictionary.getSize());
        rando = dictionary.getWord(num);
        //System.out.println(rando);

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++) {
            do {
                System.out.println("Enter a 5 letter word that is allowable.");
                s3 = sc.nextLine();
                s3 = s3.toLowerCase();
                count = 0;
            } while (check2(s3.length()) || allowable(s3));
            for(int j = 0 ; j < s3.length() ; j++){
                check(s3.charAt(j));
                count++;
            }
            if(end==5){
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The word was "+ rando);


    }
    public static void check(char c){
        int num = 0; // if none of the if statements are true it prints out 0
        for(int i = 0 ; i < rando.length() ; i++){
            if(rando.charAt(i) == c){//to check if the letter is in the word and will print 1
                num = 1;
                if(count == i){//count is the positon of the lettter and if it equals
                    end++;
                    num=2;
                    break;
                }
            }
        }
        System.out.print(num);
    }
    public static boolean check2(int num){
        if(num < 5){
            System.out.println("Word too small");
            return true;
        }
        if(num > 5){
            System.out.println("Word too big");
            return true;
        }

        return false;
    }
    /*
    public static boolean check3(String s3)
    {
        if(!(s3.contains(rando)))
        {
            System.out.println("word is not real");
            return true;
        }
       return false;
    }

     */
    public static boolean allowable(String s3){
        Dic dic = new Dic();
        for(int i = 0 ; i < dic.getSize() ; i++){
            if(dic.getWord(i).equalsIgnoreCase(s3)) {
                return false;
            }
        }
        return true;
    }


}
class Dictionary{

    private String input[];

    public Dictionary(){
        input = load("/Users/christianfashole/IdeaProjects/Wordle/src/wordlewords.txt");
    }

    public int getSize(){
        return input.length;
    }

    public String getWord(int n){
        //String s = input[n].substring(0,input[n].length()-1);
        return input[n];
    }

    private String[] load(String file) {
        File aFile = new File(file);
        StringBuffer contents = new StringBuffer();
        BufferedReader input = null;
        try {
            input = new BufferedReader( new FileReader(aFile) );
            String line = null;
            int i = 0;
            while (( line = input.readLine()) != null){
                contents.append(line);
                i++;
                contents.append(System.getProperty("line.separator"));
            }
        }catch (FileNotFoundException ex){
            System.out.println("Can't find the file - are you sure the file is in this location: "+file);
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println("Input output exception while processing file");
            ex.printStackTrace();
        }finally{
            try {
                if (input!= null) {
                    input.close();
                }
            }catch (IOException ex){
                System.out.println("Input output exception while processing file");
                ex.printStackTrace();
            }
        }
        String[] array = contents.toString().split("\n");
        for(String s: array){
            s.trim();
        }
        return array;
    }
}
class Dic{

    private String input[];

    public Dic(){
        input = load("/Users/christianfashole/IdeaProjects/Wordle/src/allowable.txt");
    }

    public int getSize(){
        return input.length;
    }

    public String getWord(int n){
       // String s = input[n].substring(0,input[n].length()-1);
        return input[n];
    }

    private String[] load(String file) {
        File aFile = new File(file);
        StringBuffer contents = new StringBuffer();
        BufferedReader input = null;
        try {
            input = new BufferedReader( new FileReader(aFile) );
            String line = null;
            int i = 0;
            while (( line = input.readLine()) != null){
                contents.append(line);
                i++;
                contents.append(System.getProperty("line.separator"));
            }
        }catch (FileNotFoundException ex){
            System.out.println("Can't find the file - are you sure the file is in this location: "+file);
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println("Input output exception while processing file");
            ex.printStackTrace();
        }finally{
            try {
                if (input!= null) {
                    input.close();
                }
            }catch (IOException ex){
                System.out.println("Input output exception while processing file");
                ex.printStackTrace();
            }
        }
        String[] array = contents.toString().split("\n");
        for(String s: array){
            s.trim();
        }
        return array;
    }
}
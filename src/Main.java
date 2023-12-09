import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //string fdg=Console.ReaDlINE();

        System.out.println("Salam: ");

        String s1=sc.nextLine();

        char[] s1Arr =s1.toCharArray();
        String trimS1="";
        boolean isWord = true;
        int startIndex=0,finishIndex=0;

        //System.out.println(s1Arr[0]);

        for(int i=1;i<s1Arr.length;i++){

            if (s1Arr[i - 1] != ' ') {
                if(s1Arr[i]==' '){
                    finishIndex=i;
                }
            }

            if(isWord) {
                if (s1Arr[i - 1] != ' ') {
                    startIndex = i - 1;
                    isWord = false;

                }
            }

        }
        for(int i =startIndex;i<finishIndex;i++){
            trimS1+=s1Arr[i];
        }


        System.out.println("Alinan cavab:"+ trimS1);

        System.out.println("Methodun ozu ile cavab:"+s1.trim());





        /*
        Bu birinci yol idi etmeye calisdim alinmadi

        for(int i=0;i<s1Arr.length-1;i++){
            if(s1Arr[i]==' ' && !isWord ){

                continue;
            }

                trimS1+= Character.toString(s1Arr[i]);
                if(s1Arr[i+1]==' '){
                    //trimS1+=s1Arr[i];
                    trimS1+="b";
                   isWord=true;
                }else{
                    isWord=false;

                }
                //for (int j = 0;j< s1Arr.length;i++){


                //}

        }
        */






    }
}
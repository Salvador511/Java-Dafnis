import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        String s;
        int option, counter;

        System.out.println("Input the sentence that you want to play");
        s = sc.nextLine();
        System.out.println(" ");
        
        System.out.println("(1)Split the sentence by spaces or (2)Count the number of spaces");
        option = sc.nextInt();


        switch (option) {
            case 1:

                String[] subS = s.split(" ");
                counter = 1;
                String v[] = new String[100];

                for(String i : subS){
                    v[counter] = i;
                
                    counter++;
                }

                System.out.println(" ");
                System.out.println("Select the word that you want to see");
                option = sc.nextInt();

                System.out.println(v[option]);
                break;

            case 2:
                counter = 0;

                for(int i = 0; i < s.length(); i++){
                    if(s.charAt(i) == ' '){
                        counter++;
                    }
                }

                System.out.println("The amount of spaces are " + counter);

                break;
        
            default:
                System.out.println("You are stupid or what. I told you, you only have two option");
                break;
        }


    }
}

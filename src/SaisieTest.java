import java.util.Scanner;

public class SaisieTest {
    private Scanner sc = new Scanner(System.in);

    public int intTest(){
        boolean stop;
        String i;
        do{
            i = sc.next();
            stop = true;
            try{
                int integer = Integer.valueOf(i);
            }catch(NumberFormatException e) {
                stop = false;
                System.out.print("Veuillez entrer un chiffre\n");
            }
        }while(!stop);

        return Integer.valueOf(i);
    }

}

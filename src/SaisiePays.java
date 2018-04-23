import java.util.Scanner;

public class SaisiePays {
    private Scanner sc = new Scanner(System.in);
    private String[] tabPays = {"etats-Unis","Union europeenne", "Chine","Japon","Allemagne","France","Royaume-Uni","Inde","Bresil","Italie","Canada","Coree du Sud","Russie","Australie","Espagne","Mexique"};

    public String testPays(){
        boolean accepter = false;
        for(int i = 0; i < tabPays.length; i++)
        {
            tabPays[i] = tabPays[i].toLowerCase();
        }
        String i;
        do{
            i = sc.next().toLowerCase();
            int y = 0;
            while(y < tabPays.length)
            {
                if(tabPays[y].equals(i))
                {
                    y = tabPays.length-1;
                    accepter = true;
                }
                y++;
            }
            if(!accepter)
                System.out.print("Saisie invalide\n");
        }while(!accepter);

        return i;
    }
}

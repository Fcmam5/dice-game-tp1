/**
 * Created by fcmam5 on 02/10/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("" +
                "    /\\' .\\    _____\n" +
                "   /: \\___\\  / .  /\\\n" +
                "   \\' / . / /____/..\\\n" +
                "    \\/___/  \\'  '\\  /\n" +
                "             \\'__'\\/ Welcome To my TP ");
        // ASCII art from : http://www.chris.com/ascii/index.php?art=objects/dice

        /** Creating players with auto-generated IDs and an Unknown winner**/
        Joueur[] plist = new Joueur[4];

        for (int i = 0; i < plist.length; i++) {
            plist[i]=new Joueur();
        }


        //Defining the winner
        int winnerIndice=0;
        int winnersScore = 0;

        /*Playing 10 rounds*/
        System.out.println("*************** JEU DE DE ***************");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n\nTour n° " + i);

            // They play
            for (int j = 0; j < plist.length; j++) {
                plist[j].lanceDe();
                // Their score is :
                System.out.println(plist[j]);

                //Picking the winner :
                if(plist[j].getScore()>winnersScore){
                    winnerIndice=j;
                    winnersScore=plist[j].getScore();
                }

            }
        }
        System.out.println("\n\nLe gagnant est le "+plist[winnerIndice].getjName()+" avec un score de: "+winnersScore);

    }

}

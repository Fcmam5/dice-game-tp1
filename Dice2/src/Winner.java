/**
 * Created by fcmam5 on 02/10/15.
 */
public class Winner {
    private String name;
    public int score;

    public Winner() {
    }

    public void defineWinner(Joueur winner) {
        this.name = winner.jName;
        this.score = winner.getScore();
        System.out.println("my score is" + this.score);
    }

    public String toString() {
        return "Le gagnant est le " + this.name + " avec le score de: " + this.score + " points";
    }
}


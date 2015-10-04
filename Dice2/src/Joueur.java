/**
 * Created by fcmam5 on 02/10/15.
 */
public class Joueur {
    private int score=0;
    private byte rScore;
    private static int jID = 0;
    public String jName;

    public Joueur() {
        ++jID;
        this.jName = "Joueur" + jID;
    }

    public String getjName() {
        return jName;
    }

    public void lanceDe() {
        this.rScore = (new De()).casHasard();
        this.score += this.rScore;
    }

    public int getScore() {
        return this.score;
    }

    public static int getjID() {
        return jID;
    }

    public String toString() {
        return this.jName + " a " + this.rScore;
    }
}
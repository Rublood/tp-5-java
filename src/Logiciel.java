/**
 * Created by Rublood on 15/03/2017.
 */
public class Logiciel {

    private String nom;
    private int nblicense;

    public Logiciel(int b, String n){
        this.nblicense = b;
        this.nom = n;
    }

    public String toString(){
        String toReturn = "Le logiciel " + this.nom + " a encore " + this.nblicense + " license(s) disponible(s)";
        return toReturn;
    }
}

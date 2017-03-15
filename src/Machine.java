/**
 * Created by Rublood on 15/03/2017.
 */
public class Machine{

    private String nom;
    private String systexploit;//ou reference si pas d'os
    private Utilisateur utilisateur;
    private Logiciel logiciels;
    private Boolean os;

    public Machine(String n, String s, Utilisateur u, Logiciel l){
        systexploit = s;
        nom = n;
        utilisateur = u;
        logiciels = l;
    }

    public String toString(){
        String tmp;
        if (os==true){
            tmp = this.nom + " a comme systeme d'exploitation "+ this.systexploit;
        }else {
            tmp = this.nom + " a pour reference "+ this.systexploit;
        }
        return tmp;
    }
}

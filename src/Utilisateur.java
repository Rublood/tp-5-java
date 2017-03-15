/**
 * Created by Rublood on 15/03/2017.
 */
public class Utilisateur {
    private String nom;
    private String prenom;
    private String service;
    private Boolean chef;

    public Utilisateur (String n,String p,String s,Boolean c){
        nom = n;
        prenom = p;
        service = s;
        chef = c;
    }
    public String toString(){
        String tmp;
        if (chef==true){
            tmp ="L'utilisateur " + this.nom + " " + this.prenom + " " + "Chef du service : " + this.service;
        }else {
            tmp ="L'utilisateur " + this.nom + " " + this.prenom + " " + "Du service : " + this.service;
        }
        return tmp;

    }
}

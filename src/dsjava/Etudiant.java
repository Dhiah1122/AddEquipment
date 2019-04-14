package dsjava;



public class Etudiant {

int cin ; 
String Nom , Prenom ; 

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public Etudiant(int cin, String Nom, String Prenom) {
        this.cin = cin;
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    
}

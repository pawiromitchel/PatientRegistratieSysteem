package sr.unasat.prs.entities;

public class Patient {
    private int ID;
    private String voornaam;
    private String achternaam;

    public Patient(int ID, String voornaam, String achternaam) {
        this.ID = ID;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    @Override
    public String toString() {
        return voornaam + " " + achternaam;
    }
}

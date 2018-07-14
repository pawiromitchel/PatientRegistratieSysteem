package sr.unasat.prs.app;

import sr.unasat.prs.entities.Patient;
import sr.unasat.prs.services.DoublyList;
import sr.unasat.prs.services.RegistryService;

public class App {
    public static void main(String[] args) {

        // Poli Volgsysteem
        DoublyList poliList = new DoublyList();
        poliList.insertFirst(new Patient("Mitchel", "Pawirodinomo", "FO003090"));
        poliList.insertFirst(new Patient("Romario", "Dipopawiro", "F0919294"));
        poliList.insertFirst(new Patient("John", "Doe", "G9810293"));
        poliList.insertFirst(new Patient("Jane", "Doe", "GI000192"));

        // Lijst van alle Patienten
        poliList.displayList();
    }


}

package sr.unasat.prs.services;

import sr.unasat.prs.entities.Patient;

public class Link {
    public Patient patient;
    public Link next;

    public Link(Patient patient) {
        this.patient = patient;
    }

    public void displayLink(){
        System.out.println(this.patient);
    }
}

package sr.unasat.prs.services;

import sr.unasat.prs.entities.Patient;

import java.util.ArrayList;
import java.util.List;

public class RegistryService {
    private static List patientList = new ArrayList();

    public static void addPatient(Patient patient){
        patientList.add(patient);
    }
}

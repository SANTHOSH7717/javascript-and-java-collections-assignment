package Ex;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PatientTester {
	
	public static List<Deque<Patientdetailsqueue>> splitQueue(Deque<Patientdetailsqueue> patientsQueue) {
		List<Deque<Patientdetailsqueue>> queuesList = new ArrayList<Deque<Patientdetailsqueue>>();
		Deque<Patientdetailsqueue> seniorQueue = new ArrayDeque<Patientdetailsqueue>();
		Deque<Patientdetailsqueue> normalQueue = new ArrayDeque<Patientdetailsqueue>();
		
		for (Patientdetailsqueue patient : patientsQueue) {
			if(patient.getAge() >= 60) {
				seniorQueue.add(patient);
			}
			else {
				normalQueue.add(patient);
			}
		}
		
		queuesList.add(seniorQueue);
		queuesList.add(normalQueue);
		
		return queuesList;
	}
	
	public static void main(String[] args) {
		
		Patientdetailsqueue patient1 = new Patientdetailsqueue("Jack","Male",25);
		Patientdetailsqueue patient2 = new Patientdetailsqueue("Tom","Male",64);
		Patientdetailsqueue patient3 = new Patientdetailsqueue("Simona","Female",24);
		
		Deque<Patientdetailsqueue> patientsQueue = new ArrayDeque<Patientdetailsqueue>();
		patientsQueue.add(patient1);
		patientsQueue.add(patient2);
		patientsQueue.add(patient3);
		
		List<Deque<Patientdetailsqueue>> queuesList = splitQueue(patientsQueue);
	
		int counter=0;
		for (Deque<Patientdetailsqueue> queue : queuesList) {
			if(counter==0)
				System.out.println("Patients in the senior queue\n============================");
			else
				System.out.println("Patients in the normal queue\n============================");
			
			for (Patientdetailsqueue patient : queue) {
				System.out.println("Name : "+patient.getName());
				System.out.println("Age : "+patient.getAge());
				System.out.println();
			}
			counter++;
		}	
	}
	
}
package Day6.ArrayListPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class PatientArrayList {

	public static void main(String[] args) {

		ArrayList<PatientOfSimran> patientArray = new ArrayList<PatientOfSimran>();
		
		PatientOfSimran p1 = new PatientOfSimran(121,"Harry Potter","Cold");
		PatientOfSimran p2 = new PatientOfSimran(122,"Ron Weasly","Cough");
		PatientOfSimran p3 = new PatientOfSimran(123,"Draco Malfoy","Fever");

		patientArray.add(p1);
		patientArray.add(p2);
		patientArray.add(p3);
		
		Iterator<PatientOfSimran> itr = patientArray.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

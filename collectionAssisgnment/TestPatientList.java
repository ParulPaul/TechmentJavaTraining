package com.collectionAssisgnments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;



import java.util.ArrayList;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


class  Patient implements Comparable<Patient>
{
private int patientId;
private String name;
private int age;

public Patient(int patientId, String name, int age) {
	super();
	this.patientId = patientId;
	this.name = name;
	this.age = age;
}

public int getPatientId() {
	return patientId;
}

public void setPatientId(int patientId) {
	this.patientId = patientId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "[PatientId :" + patientId + ", Name :" + name + ", Age :" + age + "]";
}

@Override
public int compareTo(Patient o) {
	// TODO Auto-generated method stub
	return 0;
}



}


class NameSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		
		
		return o1.getName().compareTo(o2.getName());
	}
	
}


class AgeSorting implements Comparator<Patient>
{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
			return 0;
		else if (o1.getAge()>o2.getAge())
			return 1;
		else 
			return -1;
	}
	
	
	
}


public class TestPatientList {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient patient1 = new Patient(1,"Krishna",26);
		Patient patient2 = new Patient(2,"Krish",26);
		Patient patient3 = new Patient(3,"Anmol",24);
		
		
		ArrayList <Patient> patients = new ArrayList<Patient>();
		
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);
		
		for (Patient patient : patients)
		{	
			System.out.println("Id : "+patient.getPatientId()+" Name : "+patient.getName()+" Age : "+patient.getAge());
			
		}
		
		Collections.sort(patients,new NameSorting());
		
		System.out.println("After sorting by Name Patients  ");
		for (Patient patient : patients)
		{			
			System.out.println("Id : "+patient.getPatientId()+" Name : "+patient.getName()+" Age : "+patient.getAge());
		}
		
		Collections.sort(patients,new AgeSorting());
		
		System.out.println("After sorting by Age Patients  ");
		for (Patient patient : patients)
		{			
			System.out.println("Id : "+patient.getPatientId()+" Name : "+patient.getName()+" Age : "+patient.getAge());
		}
	
	
		System.out.println("After sorting by Iterator : ");
		Iterator<Patient> itr = patients.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("After Storing patients  ");
		try {
		
		 
		Set<Patient> pPatients = new TreeSet<Patient>();
		
		pPatients.add(patient1);
		pPatients.add(patient2);
		pPatients.add(patient3);
		
		
		System.out.println("Tree set = "+pPatients);
		
		
		
		
		for(Patient patient : pPatients)
        {	
			

            getPatientAge(patient.getName(),pPatients);
            System.out.println();
            
        }
		
		}catch(Exception e)
		{
			System.out.println("caught "+e);
		}
	}

private static void getPatientAge(String name ,Set<Patient> pPatients)
	{
		for(Patient patient :pPatients )
        {	
            System.out.print(name +": "+ patient.getAge());
            System.out.println();
        }
		
			
	}

}
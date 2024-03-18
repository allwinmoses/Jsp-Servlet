package com.doctor.service;

import com.doctor.exception.DoctorNotFoundException;
import com.doctor.model.Doctor;

public interface IDoctorService {
	
	void addDoctor(Doctor doctor);

    void updateDoctor(int doctorId,double fees);

    void deleteDoctor(int doctorId);

    Doctor getById(int doctorId) throws IdNotfoundExceptionxception;

    List<Doctor> getAll();

    List<Doctor> getBySpeciality(String speciality) throws DoctorNotfoundException;
    List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndLessFees(String speciality, double fees)throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings)throws DoctorNotFoundException;

    List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)throws DoctorNotFoundException;

}
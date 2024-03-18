package com.doctor.service;

import java.util.List;

import com.doctor.model.Doctor;
import com.doctor.repository.IDoctorRepository;

public class DoctorServiceImp implements IDoctorService{
	
	  private IDoctorRepository doctorRepository = new DoctorRepositoryImp();


	    @Override
	    public void addDoctor (Doctor doctor) {

	        doctorRepository.addDoctor(doctor);

	    }

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		 doctorRepository.updateDoctor(doctorId,fees);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteDoctor(doctorId);
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotfoundExceptionxception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotfoundExceptionotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	


	  
}

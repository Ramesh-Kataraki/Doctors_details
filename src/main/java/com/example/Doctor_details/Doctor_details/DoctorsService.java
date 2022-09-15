package com.example.Doctor_details.Doctor_details;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DoctorsService {
	@Autowired
	private DoctorsRepository repository;

	public Doctors saveDoctors(Doctors ed) {
	return repository.save(ed);
	}
	public List<Doctors> saveDoctors(List<Doctors> eds){
		return repository.saveAll(eds);
	}
	public List<Doctors> getDoctorss(){
		return repository.findAll();
	}
	public Doctors getDoctorsById(int id) {
		return repository.findById(id).orElse(null);
	}
	public Doctors getDoctorsByName(String name) {
		return repository.findByName(name);
	}
	public String deleteDoctors(int id) {
		repository.deleteById(id);
		return "Doctor is removed"+id;
	}
	public Doctors updateDoctors(Doctors k) {
		Doctors es=repository.findById(k.getId()).orElse(null);
		es.setName(k.getName());
		es.setSpecialist(k.getSpecialist());
		es.setSalary(k.getSalary());
		return repository.save(es);
	}
	public Optional<Doctors> getDoctors(){
		return null;
	}
	}
	


package com.example.Doctor_details.Doctor_details;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DoctorsController {
	@Autowired
	private DoctorsService service;
	@PostMapping("/doctor")
	public Doctors addDoctors(@RequestBody Doctors k) {
		return service.saveDoctors(k);	
	}
	@PostMapping("/Doctors")
	public List<Doctors> addDoctorss(@RequestBody List<Doctors> m){
		return service.saveDoctors(m);
	}
	@GetMapping("/Doctors")
	public Optional<Doctors> findAllDoctorss(){
		return service.getDoctors();
	}
	@GetMapping("/Doctors/{id}")
	public Doctors findDoctorsById(@PathVariable Integer id)
	{
		return service.getDoctorsById(id);
	}
	@GetMapping("/Doctorss/{name}")
	public Doctors findDoctorsByName(@PathVariable String name)
	{
		return service.getDoctorsByName(name);
	}
	@PostMapping("/update")
	public Doctors updateDoctors(@RequestBody Doctors k)
	{
		return service.saveDoctors(k);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDoctors(@PathVariable int id) {
		return service.deleteDoctors(id);
	}
	

}

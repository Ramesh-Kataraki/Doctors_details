package com.example.Doctor_details.Doctor_details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorsRepository extends JpaRepository<Doctors,Integer> {
	Doctors findByName(String name);

}

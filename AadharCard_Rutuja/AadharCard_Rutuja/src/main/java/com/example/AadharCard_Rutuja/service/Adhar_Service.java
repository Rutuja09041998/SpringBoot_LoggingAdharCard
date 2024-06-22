package com.example.AadharCard_Rutuja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AadharCard_Rutuja.entity.Adhar;
import com.example.AadharCard_Rutuja.repository.Repo;

@Service
public class Adhar_Service {

	@Autowired
	private Repo repo;

	public Adhar saveAdhar(Adhar adhar) {
		return repo.save(adhar);
	}

	public List<Adhar> getAdhar(Adhar adhar) {
		return repo.findAll();
	}

	public Adhar getAdharId(int id) {
		Optional<Adhar> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public Adhar deleteAdhar(int id) {
		Optional<Adhar> optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return optional.get();
		}
		return null;
	}

	public Adhar updateAdhar(Adhar adhar, int id) {
		Optional<Adhar> optional=repo.findById(id);
		Adhar dbAadhar= new Adhar();
		if(optional.isPresent())
		{
			dbAadhar=optional.get();
			adhar.setAadharNo(dbAadhar.getAadharNo());
			return repo.save(adhar);
		}
		return null;
	}
}

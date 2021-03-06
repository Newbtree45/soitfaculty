package com.soit.soitfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.soitfaculty.dao.FacultyRepository;
import com.soit.soitfaculty.entity.Faculty;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@Service
public class FacultyServiceImpl implements FacultyService {
	
	private FacultyRepository facultyRepository;
	
	@Autowired
	public FacultyServiceImpl (FacultyRepository theFacultyRepository) {
		facultyRepository = theFacultyRepository;
		
	}

	@Override
	public List<Faculty> findAll() {
		// TODO Auto-generated method stub
		return facultyRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Faculty findById(int theid) {
		// TODO Auto-generated method stub
		java.util.Optional<Faculty>facultyid = facultyRepository.findById(theid);
		Faculty theFaculty = null;
		if(facultyid.isPresent()) {
			theFaculty = facultyid.get();
		}
		else {
			//facultyid not found.
			throw new RuntimeException("The FacultyId you've entered is invalid - "+ theid);
		}
		return theFaculty;
	}

	@Override
	public void save(Faculty theFaculty) {
		// TODO Auto-generated method stub
		facultyRepository.save(theFaculty);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		facultyRepository.deleteById(theId);
	}

}

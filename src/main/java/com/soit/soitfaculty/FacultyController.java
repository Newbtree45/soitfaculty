package com.soit.soitfaculty;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soit.soitfaculty.entity.Faculty;
import com.soit.soitfaculty.service.FacultyService;

@Controller
@RequestMapping("/Faculty")
public class FacultyController {
	
	public FacultyService facultyService;
	
	public FacultyController (FacultyService theFacultyService) {
		facultyService = theFacultyService;
	}

	// Upload Faculty Info
	private List<Faculty> theFaculties;

	// Mapping for "/list"
	@GetMapping("/list")
	public String listFaculties(Model theModel) {
		
		//Retrieve Faculties from the database
		List<Faculty> theFaculties = facultyService.findAll();

		// Add Faculties to Spring Model
		theModel.addAttribute("faculties", theFaculties);

		return "list-faculties";

	}

}

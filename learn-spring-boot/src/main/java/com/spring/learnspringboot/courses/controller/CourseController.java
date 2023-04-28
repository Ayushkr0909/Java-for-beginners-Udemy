package com.spring.learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learnspringboot.courses.bean.Courses;
import com.spring.learnspringboot.courses.repository.CoursesRepository;

@RestController
public class CourseController {
	
	@Autowired
	private CoursesRepository repository;
	
	@GetMapping("/courses")   //to get this output-->https://localhost:8080/courses
	
	public List<Courses> getAllCourses() {
		return repository.findAll();
	}

//REST API to retrieve course details using GET
	@GetMapping("/courses/{id}")   //get course detail of a specific id ------>to get this output-->https://localhost:8080/courses/id_value
	public Courses getCourseDetails(@PathVariable long id) {    
		Optional<Courses> courseId = repository.findById(id);
		
		if(courseId.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
		return courseId.get();
	}
	
//REST API to create a new resource using POST
	@PostMapping("/courses")
	public void createCourse(@RequestBody Courses course) {    
		repository.save(course);       //.save is the repository method to post/update a resource
	}

//REST API to update a resource with specific id using PUT
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Courses course) {    
		repository.save(course);
	}
	
//REST API to delete a resource with specific id using PUT
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {    
		repository.deleteById(id);
		}
	
}

/* command to launch mysql using Docker
 docker run --detach 
  --env MYSQL_ROOT_PASSWORD=dummypassword          --->configure admin password
  --env MYSQL_USER=courses-user                    --->create a user
  --env MYSQL_PASSWORD=dummycourses                --->user password
  --env MYSQL_DATABASE=courses                     --->create a database
  --name mysql                                     --->container name
  --publish 3306:3306 mysql:5.7                    --->should run on port 3306
  */

/*URLs used in this application
 * https://localhost:8080/courses                        --to get list of all the courses
 * https://localhost:8080/courses/id_value               --to get course details of a specific id
 * https://localhost:8080/actuator                       --URL for actuator
 * https://localhost:8080/h2-console                     --URL for h2 database 
 */

/*@GetMapping is an Annotation for mapping HTTP GET requests onto specific handler methods.
 *@PathVariable indicates that a method parameter should be bound to a URI template variable. Supported for RequestMapping annotated handler methods.
    If the method parameter is Map<String, String>then the map is populated with all path variable names and values.
 *@PostMapping is an Annotation for mapping HTTP POST requests onto specific handler methods.
 *@RequestBody Annotation indicating a method parameter should be bound to the body of the web request.
    The body of the request is passed through an HttpMessageConverter to resolve the method argument depending on the content type of the request.
    Optionally, automatic validation can be applied by annotating the argument with @Valid. Supported for annotated handler methods.
 *@PutMapping is an Annotation for mapping HTTP PUT requests onto specific handler methods
 *@DeleteMapping is an Annotation for mapping HTTP DELETE requests onto specific handler methods
  *To execute Post,delete,update,etc, we have to use chrome extensions, they cannot be done on browsers by default.
  *.save method creates a new resource if the given entity doesn't exist and updates the resource if entity exists.
  */

package com.davidNest.mongoDbProject.resources;

import com.davidNest.mongoDbProject.domain.Post;
import com.davidNest.mongoDbProject.domain.User;
import com.davidNest.mongoDbProject.dto.UserDTO;
import com.davidNest.mongoDbProject.services.PostService;
import com.davidNest.mongoDbProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

	@Autowired
	private PostService service;

	//FIND BY ID
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
 	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}

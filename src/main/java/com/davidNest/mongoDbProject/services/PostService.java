package com.davidNest.mongoDbProject.services;

import com.davidNest.mongoDbProject.domain.Post;
import com.davidNest.mongoDbProject.domain.User;
import com.davidNest.mongoDbProject.dto.AuthorDTO;
import com.davidNest.mongoDbProject.dto.UserDTO;
import com.davidNest.mongoDbProject.repository.PostRepository;
import com.davidNest.mongoDbProject.repository.UserRepository;
import com.davidNest.mongoDbProject.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> user = repo.findById(id);
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}

}

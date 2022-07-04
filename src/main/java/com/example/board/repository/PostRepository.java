package com.example.board.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	public Optional<Post> findById(String id);
	
	List<Post> findAllByOrderByUpdatedDateDesc();
	
	List<Post> findByDeletedFalseOrderByUpdatedDateDesc();
}

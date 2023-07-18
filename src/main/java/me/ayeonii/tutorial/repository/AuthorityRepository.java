package me.ayeonii.tutorial.repository;


import me.ayeonii.tutorial.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
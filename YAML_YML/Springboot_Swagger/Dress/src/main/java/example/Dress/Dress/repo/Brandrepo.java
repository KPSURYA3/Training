package example.Dress.Dress.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import example.Dress.Dress.dto.Branddto;

public interface Brandrepo extends JpaRepository<Branddto, Integer> {

}

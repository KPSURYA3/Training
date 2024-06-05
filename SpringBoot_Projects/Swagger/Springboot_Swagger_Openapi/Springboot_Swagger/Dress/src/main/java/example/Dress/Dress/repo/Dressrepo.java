package example.Dress.Dress.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import example.Dress.Dress.dto.Dressdto;

public interface Dressrepo extends JpaRepository<Dressdto, Integer> {

	public List<Dressdto> findByDressQuantity(int dressQuantity);

	public List<Dressdto> findByDressQuantityAndDressPrice(int dressqQuantity, int dressprice);
}

package example.Dress.Dress.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import example.Dress.Dress.dto.Dressdto;
import example.Dress.Dress.repo.Dressrepo;

@Repository
public class Dressdao {

    @Autowired
    Dressrepo obj;

    public Dressdto addDress(Dressdto d) {
        return obj.save(d);
    }

    public List<Dressdto> getDress() {
        return obj.findAll();
    }

    public Dressdto getbyId(int id) {
        java.util.Optional<Dressdto> o = obj.findById(id);
        return o.orElse(null);
    }

    public List<Dressdto> getByQuantity(int quantity) {
        return obj.findByDressQuantity(quantity);
    }
    
    public List<Dressdto> getByQuantityAndPrice(int quantity, int price)
    {
    	return obj.findByDressQuantityAndDressPrice(quantity,price);
    }

}


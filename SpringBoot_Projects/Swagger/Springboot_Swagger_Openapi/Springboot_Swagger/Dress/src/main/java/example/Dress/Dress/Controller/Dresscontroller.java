package example.Dress.Dress.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import example.Dress.Dress.dao.Dressdao;
import example.Dress.Dress.dto.Dressdto;

@RestController
@RequestMapping("dress_restapi")
public class Dresscontroller {

	@Autowired
	Dressdao obj;

	@PostMapping("save")
	public Dressdto addDressdetails(@RequestBody Dressdto d) {
		return obj.addDress(d);
	}

	@GetMapping("get")
	//@QueryMapping
	public List<Dressdto> getDressdetails() {
		return obj.getDress();
	}

	@GetMapping("getbyid")
	//@QueryMapping
	public Dressdto getById(@RequestParam int id) {
		return obj.getbyId(id);
	}

	@GetMapping("getbydq")
	//@QueryMapping
	private List<Dressdto> getByQuantity(@RequestParam int dq) {
		return obj.getByQuantity(dq);
	}
	
	@GetMapping("getbydqandprice")
	//@QueryMapping
	private List<Dressdto> getByQunatityAndPrice(@RequestParam int dq, @RequestParam int price) {
		return obj.getByQuantityAndPrice(dq,price);

	}
}

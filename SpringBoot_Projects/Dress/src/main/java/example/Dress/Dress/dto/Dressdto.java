package example.Dress.Dress.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;

@Entity
//@AllArgsConstructor
public class Dressdto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dress_id")
	private int dressId;
	@Column(name = "dress_quantity")
	private int dressQuantity;
	@Column(name = "dress_price")
	private int dressPrice;
	@OneToOne(cascade = CascadeType.ALL)
	private Branddto brandDto;
	public int getDressId() {
		return dressId;
	}
	public void setDressId(int dressId) {
		this.dressId = dressId;
	}
	public int getDressQuantity() {
		return dressQuantity;
	}
	public void setDressQuantity(int dressQuantity) {
		this.dressQuantity = dressQuantity;
	}
	public int getDressPrice() {
		return dressPrice;
	}
	public void setDressPrice(int dressPrice) {
		this.dressPrice = dressPrice;
	}
	public Branddto getBrandDto() {
		return brandDto;
	}
	public void setBrandDto(Branddto brandDto) {
		this.brandDto = brandDto;
	}
	@Override
	public String toString() {
		return "Dressdto [dressId=" + dressId + ", dressQuantity=" + dressQuantity + ", dressPrice=" + dressPrice
				+ ", brandDto=" + brandDto + "]";
	}
	
	
}

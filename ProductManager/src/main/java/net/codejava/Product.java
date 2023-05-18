package net.codejava;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Product {
	
	private  Long id;
	private String medicinename;
	private String distributor;
	private String madein;
	private float price;
	private float discount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	protected Product() {
		
	}

	protected Product(Long id, String medicinename, String distributor, String madein, float price, float discount, Date date) {
		super();
		this.id =id;
		this.medicinename = medicinename;
		this.distributor = distributor;
		this.madein = madein;
		this.price = price;
		this.discount = discount;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public  Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicinename() {
		return medicinename;
	}

	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}

	public String getDistributor() {
		return distributor;
	}

	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}

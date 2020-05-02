package net.codejava.productREST;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Product {
    private Integer id;
    private String name;
    private float price;
 
    public Product() {
    }
 
    public Product(Integer id, String name, float price) {
        this.id = id;
        this.setName(name);
        this.setPrice(price);
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
    // other getters and setters...
}

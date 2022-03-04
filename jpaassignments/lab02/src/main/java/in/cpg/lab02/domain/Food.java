package in.cpg.lab02.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	
	@Id
	private int id;
	private String name;
	private String description;
	private int price;
	private int serve_qty;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getServe_qty() {
		return serve_qty;
	}
	public void setServe_qty(int serve_qty) {
		this.serve_qty = serve_qty;
	}
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", serve_qty=" + serve_qty + "]";
	}
	
	
}

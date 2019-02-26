package co.grandcircus.lab.Coffee_Shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class cartitems {

	// Fields
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String itemname;
	private Double itemprice;
	private Integer itemquan;
	@ManyToOne
	private Items item;
	@ManyToOne
	private Users user;
	
	// constructors
	public cartitems() {}
	
	public cartitems(Long id, String itemname, Double itemprice, Integer itemquan) {
		setId(id);
		setItemname(itemname);
		setItemprice(itemprice);
		setItemquan(itemquan);
	}
	
	// getters and setters
	public void setId(Long id){
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Double getItemprice() {
		return itemprice;
	}
	public void setItemprice(Double itemprice) {
		this.itemprice = itemprice;
	}
	public Integer getItemquan() {
		return itemquan;
	}
	public void setItemquan(Integer itemquan) {
		this.itemquan = itemquan;
	}
}

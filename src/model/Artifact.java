package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="artifact")
public class Artifact {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ARTIFACT_ID")
	private int id;
	@Column(name="PRICE")
	private int price;
	@Column(name="LABEL")
	private String label;
	@ManyToOne
	@JoinColumn(name="PRESIDENT_ID")
	private President president;
	
	public Artifact(int price, String label, President president) {
		super();
		this.price = price;
		this.label = label;
		this.president = president;
	}
	
	public Artifact() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public President getPresident() {
		return president;
	}
	public void setPresident(President president) {
		this.president = president;
	}
	
	@Override
	public String toString() {
		return "Artifact [id:" + id + ", price:" + price +
				", name:" + label + ", president:" + president + "]";
	}
}

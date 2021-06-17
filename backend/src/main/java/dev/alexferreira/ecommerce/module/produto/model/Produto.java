package dev.alexferreira.ecommerce.module.produto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Produto {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	@Column
	private BigDecimal price;
	@Column
	private Integer score;
	@Column
	private String image;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Produto{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", score=" + score +
				", image='" + image + '\'' +
				'}';
	}
}

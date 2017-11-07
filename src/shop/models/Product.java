package shop.models;

public class Product {
	private int pro_id;
	private int cat_id;
	private String pro_name;
	private String pro_image;
	private String description;
	private Double price;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	public Product(int pro_id, int cat_id, String pro_name, String pro_image, String description, Double price) {
		super();
		this.pro_id = pro_id;
		this.cat_id = cat_id;
		this.pro_name = pro_name;
		this.pro_image = pro_image;
		this.description = description;
		this.price = price;
	}
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getPro_image() {
		return pro_image;
	}
	public void setPro_image(String pro_image) {
		this.pro_image = pro_image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

package com.posbravo.model;

// Generated Jun 10, 2014 6:20:56 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private Integer productId;
	private ProductType productType;
	private ProductCustomizationGroup productCustomizationGroup;
	private TaxClass taxClass;
	private String name;
	private String description;
	private BigDecimal price;
	private String barcode;
	private String size;
	private String image;
	private String thumbnail;
	private Date dateAdded;
	private Date dateLastModified;
	private Date dateAvailable;
	private BigDecimal kilograms;
	private Set cartItems = new HashSet(0);
	private Set productTagToProducts = new HashSet(0);
	private Set menuClassifications = new HashSet(0);

	public Product() {
	}

	public Product(String name, BigDecimal price, Date dateAdded,
			Date dateLastModified, Date dateAvailable) {
		this.name = name;
		this.price = price;
		this.dateAdded = dateAdded;
		this.dateLastModified = dateLastModified;
		this.dateAvailable = dateAvailable;
	}

	public Product(ProductType productType,
			ProductCustomizationGroup productCustomizationGroup,
			TaxClass taxClass, String name, String description,
			BigDecimal price, String barcode, String size, String image,
			String thumbnail, Date dateAdded, Date dateLastModified,
			Date dateAvailable, BigDecimal kilograms, Set cartItems,
			Set productTagToProducts, Set menuClassifications) {
		this.productType = productType;
		this.productCustomizationGroup = productCustomizationGroup;
		this.taxClass = taxClass;
		this.name = name;
		this.description = description;
		this.price = price;
		this.barcode = barcode;
		this.size = size;
		this.image = image;
		this.thumbnail = thumbnail;
		this.dateAdded = dateAdded;
		this.dateLastModified = dateLastModified;
		this.dateAvailable = dateAvailable;
		this.kilograms = kilograms;
		this.cartItems = cartItems;
		this.productTagToProducts = productTagToProducts;
		this.menuClassifications = menuClassifications;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductCustomizationGroup getProductCustomizationGroup() {
		return this.productCustomizationGroup;
	}

	public void setProductCustomizationGroup(
			ProductCustomizationGroup productCustomizationGroup) {
		this.productCustomizationGroup = productCustomizationGroup;
	}

	public TaxClass getTaxClass() {
		return this.taxClass;
	}

	public void setTaxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateLastModified() {
		return this.dateLastModified;
	}

	public void setDateLastModified(Date dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	public Date getDateAvailable() {
		return this.dateAvailable;
	}

	public void setDateAvailable(Date dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public BigDecimal getKilograms() {
		return this.kilograms;
	}

	public void setKilograms(BigDecimal kilograms) {
		this.kilograms = kilograms;
	}

	public Set getCartItems() {
		return this.cartItems;
	}

	public void setCartItems(Set cartItems) {
		this.cartItems = cartItems;
	}

	public Set getProductTagToProducts() {
		return this.productTagToProducts;
	}

	public void setProductTagToProducts(Set productTagToProducts) {
		this.productTagToProducts = productTagToProducts;
	}

	public Set getMenuClassifications() {
		return this.menuClassifications;
	}

	public void setMenuClassifications(Set menuClassifications) {
		this.menuClassifications = menuClassifications;
	}

}

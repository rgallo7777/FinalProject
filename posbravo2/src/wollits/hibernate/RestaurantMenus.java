package wollits.hibernate;

// Generated Jun 14, 2014 7:45:27 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RestaurantMenus generated by hbm2java
 */
@Entity
@Table(name = "restaurant_menus", catalog = "wollits")
public class RestaurantMenus implements java.io.Serializable {

	private int restaurantMenuId;
	private Menus menus;
	private Restaurants restaurants;

	public RestaurantMenus() {
	}

	public RestaurantMenus(int restaurantMenuId, Menus menus,
			Restaurants restaurants) {
		this.restaurantMenuId = restaurantMenuId;
		this.menus = menus;
		this.restaurants = restaurants;
	}

	@Id
	@Column(name = "restaurant_menu_id", unique = true, nullable = false)
	public int getRestaurantMenuId() {
		return this.restaurantMenuId;
	}

	public void setRestaurantMenuId(int restaurantMenuId) {
		this.restaurantMenuId = restaurantMenuId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_id", nullable = false)
	public Menus getMenus() {
		return this.menus;
	}

	public void setMenus(Menus menus) {
		this.menus = menus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurant_id", nullable = false)
	public Restaurants getRestaurants() {
		return this.restaurants;
	}

	public void setRestaurants(Restaurants restaurants) {
		this.restaurants = restaurants;
	}

}

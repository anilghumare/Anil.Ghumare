package com.zensar.springbootcoupon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int couponId;
	private String couponName;
	private int couponCost;

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponName, int couponCost) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponCost = couponCost;
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public int getCouponCost() {
		return couponCost;
	}

	public void setCouponCost(int couponCost) {
		this.couponCost = couponCost;
	}

	@Override
	public String toString() {
		return "Coupon [couponId=" + couponId + ", couponName=" + couponName + ", couponCost=" + couponCost + "]";
	}

}

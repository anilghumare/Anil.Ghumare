package com.zensar.springbootcoupon.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.springbootcoupon.entity.Coupon;

public interface CouponService {

	public Coupon getCoupon(int couponId);
	public List<Coupon> getAllCoupons();
	public void insertCoupon(Coupon coupon);
	public void deleteCoupon(int couponId);
	public void updateCoupon(int couponId, Coupon coupon);

	
}

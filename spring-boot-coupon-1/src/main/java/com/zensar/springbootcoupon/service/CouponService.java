package com.zensar.springbootcoupon.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.springbootcoupon.dto.CouponDto;
import com.zensar.springbootcoupon.entity.Coupon;

public interface CouponService {

	public CouponDto getCoupon(int couponId);
	public List<CouponDto> getAllCoupons();
	public CouponDto insertCoupon(CouponDto coupon);
	public void deleteCoupon(int couponId);
	public void updateCoupon(int couponId, CouponDto coupon);

	
}

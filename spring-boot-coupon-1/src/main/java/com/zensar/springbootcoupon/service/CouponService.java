package com.zensar.springbootcoupon.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.zensar.springbootcoupon.dto.CouponDto;

public interface CouponService {

	public CouponDto getCoupon(int couponId);

	public List<CouponDto> getAllCoupons(int pageNumber, int pageSize, String sortBy, Direction dir);

	public CouponDto insertCoupon(CouponDto coupon);

	public void deleteCoupon(int couponId);

	public void updateCoupon(int couponId, CouponDto coupon);

	List<CouponDto> getByCouponCode(String couponCode);

	List<CouponDto> getByCouponCodeAndCouponExpDate(String couponCode, String couponExpDate);

}

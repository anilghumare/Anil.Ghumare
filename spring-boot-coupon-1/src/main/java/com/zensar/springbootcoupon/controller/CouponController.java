package com.zensar.springbootcoupon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootcoupon.dto.CouponDto;
import com.zensar.springbootcoupon.entity.Coupon;
import com.zensar.springbootcoupon.service.CouponService;

@RestController
@RequestMapping(value = "/coupon-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
public class CouponController {

	@Autowired
	private CouponService couponService;

	// @RequestMapping("/coupons/{couponId}")
	@GetMapping(value = "/coupons/{couponId}")
	public ResponseEntity<CouponDto> getCoupon(@PathVariable("couponId") int couponId) {
		return new ResponseEntity<CouponDto>(couponService.getCoupon(couponId), HttpStatus.OK);

	}

	// @RequestMapping("/coupons")
	@GetMapping("/coupons")
	public List<CouponDto> getAllCoupons() {
		return couponService.getAllCoupons();

	}

	// @RequestMapping(value="/coupons", method=RequestMethod.POST)
	@PostMapping(value = "/coupons")
	public ResponseEntity<CouponDto> insertCoupon(@RequestBody CouponDto couponDto) {
		return new ResponseEntity<CouponDto>(couponService.insertCoupon(couponDto), HttpStatus.CREATED);

	}

	// @RequestMapping(value="/coupons/{couponId}", method=RequestMethod.DELETE)
	@DeleteMapping("/coupons/{couponId}")
	public ResponseEntity<String> deleteCoupon(@PathVariable("couponId") int couponId) {
		couponService.deleteCoupon(couponId);
		return new ResponseEntity<String>("Student deleted successfully", HttpStatus.OK);

	}

	// @RequestMapping(value="/coupons/{couponId}", method=RequestMethod.PUT)
	@PutMapping(value = "/coupons/{couponId}", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public void updateCoupon(@PathVariable("couponId") int couponId, @RequestBody CouponDto couponDto) {
		couponService.updateCoupon(couponId, couponDto);

	}

}

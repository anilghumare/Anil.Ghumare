package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.dto.BusRouteDto;
import com.zensar.service.BusRouteService;

@RestController
public class BusRouteController {

	@Autowired
	private BusRouteService buRouteService;

	@GetMapping("/busRoute/{id}")
	public ResponseEntity<BusRouteDto> readBusRouteById(@PathVariable("id") int id) {
		return new ResponseEntity<BusRouteDto>(buRouteService.readBusRouteById(id), HttpStatus.OK);

	}

	@DeleteMapping("/busRoute/{id}")
	public ResponseEntity<String> deleteBusRouteById(@PathVariable("id") int id) {
		buRouteService.deleteBusRouteById(id);
		return new ResponseEntity<String>("BusRoute deleted Successfully....", HttpStatus.OK);

	}

	@PostMapping("/busRoute")
	public ResponseEntity<BusRouteDto> createABusRoute(@RequestBody BusRouteDto busRouteEntity) {
		return new ResponseEntity<BusRouteDto>(buRouteService.createABusRoute(busRouteEntity), HttpStatus.CREATED);

	}

}

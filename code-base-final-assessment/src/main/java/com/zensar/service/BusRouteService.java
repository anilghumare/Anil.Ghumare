package com.zensar.service;

import com.zensar.dto.BusRouteDto;

public interface BusRouteService {

	public BusRouteDto readBusRouteById(int id);

	public void deleteBusRouteById(int id);

	public BusRouteDto createABusRoute(BusRouteDto busRouteDto);

}

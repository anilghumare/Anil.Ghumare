package com.zensar.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dto.BusRouteDto;
import com.zensar.entity.BusRouteEntity;
import com.zensar.repository.BusRouteRepo;

@Service
public class BusRouteServiceImpl implements BusRouteService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BusRouteRepo busRouteRepo;

	@Override
	public BusRouteDto readBusRouteById(int id) {

		BusRouteEntity busRouteEntity = busRouteRepo.findById(id).get();

		return modelMapper.map(busRouteEntity, BusRouteDto.class);
	}

	@Override
	public void deleteBusRouteById(int id) {
		busRouteRepo.deleteById(id);

	}

	@Override
	public BusRouteDto createABusRoute(BusRouteDto busRouteDto) {

		BusRouteEntity busRouteEntity = modelMapper.map(busRouteDto, BusRouteEntity.class);

		BusRouteEntity insertedBusRoute = busRouteRepo.save(busRouteEntity);

		return modelMapper.map(insertedBusRoute, BusRouteDto.class);
	}

}

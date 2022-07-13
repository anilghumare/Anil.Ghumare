package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.BusRouteEntity;

public interface BusRouteRepo extends JpaRepository<BusRouteEntity, Integer> {

}

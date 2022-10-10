package com.parking_spaces.services

import com.parking_spaces.models.ParkingSpaceModel
import com.parking_spaces.repositories.ParkingSpaceRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping


@Service
class ParkingSpaceService (
   private  val parkingSpaceRepository: ParkingSpaceRepository

        ){

    fun create(cadastroVaga: ParkingSpaceModel): ParkingSpaceModel {
        return parkingSpaceRepository.save(cadastroVaga)
    }

    fun getAll(): List<ParkingSpaceModel> {

            return parkingSpaceRepository.findAll()
        }

    fun findById(id: Int): ParkingSpaceModel {
        return parkingSpaceRepository.findById(id).orElseThrow()

    }

    fun delete(parkingSpaceModel: ParkingSpaceModel){

         parkingSpaceRepository.delete(parkingSpaceModel)
    }

}


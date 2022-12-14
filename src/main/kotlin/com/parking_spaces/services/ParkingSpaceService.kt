package com.parking_spaces.services

import com.parking_spaces.models.ParkingSpaceModel
import com.parking_spaces.repository.ParkingSpaceRepository
import org.springframework.stereotype.Service
import java.lang.Exception


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

    fun update(parkingSpaceModel: ParkingSpaceModel) {
        if(!parkingSpaceRepository.existsById(parkingSpaceModel.id!!)){
            throw Exception()
        }

        parkingSpaceRepository.save(parkingSpaceModel)
    }

}


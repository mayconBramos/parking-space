package com.parking_spaces.controllers

import com.parking_spaces.controllers.request.PostParkingSpaceRequest
import com.parking_spaces.controllers.request.PutParkingSpaceRequest
import com.parking_spaces.controllers.response.ParkingSpaceResponse
import com.parking_spaces.extension.toCustomerModel
import com.parking_spaces.extension.toParkingSpaceModel
import com.parking_spaces.extension.toResponse
import com.parking_spaces.services.ParkingSpaceService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/parking-space")
 class ParkingSpaceController (

    val parkingSpaceService: ParkingSpaceService

        ) {

     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
     fun create (@RequestBody @Valid parkingSpaceRequest: PostParkingSpaceRequest){
         parkingSpaceService.create(parkingSpaceRequest.toParkingSpaceModel())
     }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<ParkingSpaceResponse> {
        return parkingSpaceService.getAll().map { it.toResponse() }
    }

    @GetMapping("/{id}")
    fun getSpace(@PathVariable id: Int): ParkingSpaceResponse {
        return parkingSpaceService.findById(id).toResponse()
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody @Valid vagasCadastradas: PutParkingSpaceRequest) {
        val parkingSpaceSaved = parkingSpaceService.findById(id)
        parkingSpaceService.update(vagasCadastradas.toCustomerModel(parkingSpaceSaved))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int) {
        val findById = parkingSpaceService.findById(id)

        parkingSpaceService.delete(findById)



    }
}


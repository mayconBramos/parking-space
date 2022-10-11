@file:Suppress("UNREACHABLE_CODE")

package com.parking_spaces.extension

import com.parking_spaces.controllers.request.PostParkingSpaceRequest
import com.parking_spaces.controllers.request.PutParkingSpaceRequest
import com.parking_spaces.controllers.response.ParkingSpaceResponse
import com.parking_spaces.models.ParkingSpaceModel
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

fun PostParkingSpaceRequest.toParkingSpaceModel(): ParkingSpaceModel {

    return ParkingSpaceModel(

        numeroVaga = this.numeroVaga,
        placaCarro = this.placaCarro,
        marcaCarro= this.marcaCarro,
        modeloCarro= this.modeloCarro,
        corCarro = this.corCarro,
        nomeResponsavel = this.nomeResponsavel,
        apartamento=this.apartamento,
        dataRegistro = LocalDateTime.now(),
        bloco=this.bloco

    )

}

fun PutParkingSpaceRequest.toCustomerModel(previousValue: ParkingSpaceModel): ParkingSpaceModel {
    return ParkingSpaceModel(
        id = previousValue.id,
        numeroVaga = this.numeroVaga,
        placaCarro = this.placaCarro,
        marcaCarro = this.marcaCarro,
        modeloCarro = this.modeloCarro,
        corCarro = this.corCarro,
        nomeResponsavel = this.nomeResponsavel,
        apartamento = this.apartamento,
        dataRegistro = previousValue.dataRegistro,
        bloco = this.bloco
    )
}

fun ParkingSpaceModel.toResponse(): ParkingSpaceResponse {

    return ParkingSpaceResponse(
        id = this.id,
        numeroVaga = this.numeroVaga,
        placaCarro = this.placaCarro,
        marcaCarro = this.marcaCarro,
        modeloCarro = this.modeloCarro,
        corCarro = this.corCarro,
        nomeResponsavel = this.nomeResponsavel,
        apartamento = this.apartamento,
        dataRegistro = this.dataRegistro,
        bloco = this.bloco
    )

}
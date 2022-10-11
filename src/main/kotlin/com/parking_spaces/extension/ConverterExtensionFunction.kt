@file:Suppress("UNREACHABLE_CODE")

package com.parking_spaces.extension

import com.parking_spaces.dto.PostParkingSpaceRequest
import com.parking_spaces.dto.PutParkingSpaceRequest
import com.parking_spaces.models.ParkingSpaceModel
import java.time.LocalDateTime

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

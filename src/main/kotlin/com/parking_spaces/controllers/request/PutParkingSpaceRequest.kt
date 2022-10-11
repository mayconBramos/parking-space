package com.parking_spaces.controllers.request

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class PutParkingSpaceRequest (

   @field:NotBlank(message="Numero da vaga deve ser informado")
   var numeroVaga: String,

   @field:NotBlank(message="Placa inválida")
   @Size(max=7)
   var placaCarro:String,

   @field:NotBlank(message="Marca do carro deve ser informado")
   var marcaCarro: String,

   @field:NotBlank(message="Modelo carro deve ser informado")
   var modeloCarro: String,

   @field:NotBlank(message="Cor do carro deve ser informado")
   var corCarro: String,

   @field:NotBlank(message="Nome do responsável deve ser informado")
   var nomeResponsavel:String,

   @field:NotBlank(message="Apartamento do responsável deve ser informado")
   var apartamento:String,

   @field:NotBlank(message="Bloco do responsável deve ser informado")
    var bloco:String
) {


}
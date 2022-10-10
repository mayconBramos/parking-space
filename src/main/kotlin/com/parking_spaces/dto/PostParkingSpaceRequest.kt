package com.parking_spaces.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

data class PostParkingSpaceRequest (

   @NotBlank
   var numeroVaga: String,
   @NotBlank
   @Size(max=7)
   var placaCarro:String,
   @NotBlank
   var marcaCarro: String,
   @NotBlank
   var modeloCarro: String,
   @NotBlank
   var corCarro: String,
   @NotBlank
   var nomeResponsavel:String,
   @NotBlank
   var apartamento:String,
   @NotBlank
    var bloco:String
)
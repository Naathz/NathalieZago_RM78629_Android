package com.paiflogistica.nathalie.nathalierm78629.model

import com.google.gson.annotations.SerializedName

data class Cep(
        @SerializedName("cep") val cep: String,
        @SerializedName("logradouro") val logradouro: String,
        @SerializedName("bairro") val bairro: String,
        @SerializedName("localidade") val cidade: String,
        @SerializedName("uf") val estado: String
)
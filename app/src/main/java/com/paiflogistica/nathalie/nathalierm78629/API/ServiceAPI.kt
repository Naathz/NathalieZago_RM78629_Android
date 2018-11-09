package com.paiflogistica.nathalie.nathalierm78629.API

import com.paiflogistica.nathalie.nathalierm78629.model.Cep
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceAPI{
    @GET("/ws/{cepcodigo}/json/")
    fun buscarCEP (@Path("cepcodigo")cepcodigo: String):Call<Cep>
}
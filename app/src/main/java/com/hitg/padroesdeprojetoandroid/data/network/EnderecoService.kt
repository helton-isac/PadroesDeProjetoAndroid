package com.hitg.padroesdeprojetoandroid.data.network

import com.hitg.padroesdeprojetoandroid.model.Endereco
import retrofit2.Call
import retrofit2.http.GET

interface EnderecoService {

    @GET("/ws/{cep}/json")
    fun pesquisar(cep: String): Call<Endereco>


}
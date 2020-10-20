package com.hitg.padroesdeprojetoandroid.data.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


object APIService {
    private var INSTANCE: EnderecoService? = null

    val instance: EnderecoService?
        get() {
            if (INSTANCE == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://viacep.com.br")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build()

                INSTANCE = retrofit.create(EnderecoService::class.java)
            }
            return INSTANCE
        }
}
package com.hitg.padroesdeprojetoandroid.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hitg.padroesdeprojetoandroid.R
import com.hitg.padroesdeprojetoandroid.model.Endereco

class MainActivity : AppCompatActivity(), MainContract.MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun mostrarEndereco(endereco: Endereco?) {
        TODO("Not yet implemented")
    }

    override fun mostrarErro(mensagem: String) {
        TODO("Not yet implemented")
    }
}
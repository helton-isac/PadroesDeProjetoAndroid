package com.hitg.padroesdeprojetoandroid.ui.main

import com.hitg.padroesdeprojetoandroid.model.Endereco

interface MainContract {
    interface MainView {
        fun mostrarEndereco(endereco: Endereco?)
        fun mostrarErro(mensagem: String)
    }

    interface MainPresenter {
        fun pesquisar(cep: String)
    }
}
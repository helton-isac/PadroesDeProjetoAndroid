package com.hitg.padroesdeprojetoandroid.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hitg.padroesdeprojetoandroid.R
import com.hitg.padroesdeprojetoandroid.data.network.APIService
import com.hitg.padroesdeprojetoandroid.model.Endereco
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPesquisar.setOnClickListener {
            pesquisar()
        }
    }

    private fun pesquisar() {
        APIService.instance
            ?.pesquisar(etCEP.text.toString())
            ?.enqueue(object : Callback<Endereco> {
                override fun onResponse(call: Call<Endereco>, response: Response<Endereco>) {
                    if (response.isSuccessful) {
                        val endereco = response.body()
                        endereco?.let {
                            tvLogradouro.text = endereco.logradouro
                            tvBairro.text = endereco.bairro
                            tvLocalidade.text = endereco.localidade
                            tvUF.text = endereco.uf
                        }
                    } else {
                        Toast.makeText(
                            this@MainActivity,
                            "Endereço não encontrado",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onFailure(call: Call<Endereco>, t: Throwable) {
                    Toast.makeText(
                        this@MainActivity,
                        t.message.toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                }

            })
    }
}
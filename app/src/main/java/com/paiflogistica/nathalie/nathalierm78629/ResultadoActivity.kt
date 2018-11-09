package com.paiflogistica.nathalie.nathalierm78629

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paiflogistica.nathalie.nathalierm78629.API.ServiceAPI
import com.paiflogistica.nathalie.nathalierm78629.model.Cep
import kotlinx.android.synthetic.main.activity_resultado.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val receberDados = intent.getStringExtra("DADOS")

        val retrofit = Retrofit.Builder()
                .baseUrl("http://viacep.com.br")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service = retrofit.create(ServiceAPI::class.java)
        service.buscarCEP(receberDados)
                .enqueue(object : Callback<Cep> {
                    override fun onFailure(call: Call<Cep>?, t: Throwable?) {
                        Toast.makeText(this@ResultadoActivity, "Não funcionou", Toast.LENGTH_SHORT).show()

                    }

                    override fun onResponse(call: Call<Cep>?, response: Response<Cep>?) {
                        val numero = response?.body()
                        tvCep.text = numero?.cep
                        tvLogradouro.text = numero?.logradouro
                        tvBairro.text = numero?.bairro
                        tvCidade.text = numero?.cidade
                        tvEstado.text = numero?.estado
                    }
                })
    }
}

package com.paiflogistica.nathalie.nathalierm78629

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pesquisa.*

class PesquisaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        btPesquisar.setOnClickListener(){
            val mandarDados = Intent(this, ResultadoActivity::class.java)
            mandarDados.putExtra("DADOS", etDigitar.text.toString())
            startActivity(mandarDados)
        }

        btSobre.setOnClickListener(){
            val abrirTela = Intent(this, SobreActivity::class.java)
            startActivity(abrirTela)
        }
    }
}

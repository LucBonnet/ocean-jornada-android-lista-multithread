package com.oceanbrasil.oncean_android_lista_multithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Adapter -> Classe do android que serve como base para a lista
        // * Toda lista deve ter um adapter customizado
        // * A customixação diz como o adapter irá carregar os elementos
        // * Define o Layout XML de cada item, e como faremos para inserir informações nesse layout

        // LayoutManager -> Classe do android que usamos para definir como uma lista será estruturada
        // * Opções: Linear (Horizontal ou Vertical), Staggered, etc

        val rvList = findViewById<RecyclerView>(R.id.rvList)
        rvList.layoutManager = LinearLayoutManager(this)

        val bulbasaur = Pokemon("Bulbasaur", imagemUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png")
        val charmander = Pokemon("Charmander", imagemUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png")
        val squirtle = Pokemon("Squirtle", imagemUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png")
        val items = listOf(bulbasaur, charmander, squirtle)
        rvList.adapter = ItemAdapter(items)
    }
}
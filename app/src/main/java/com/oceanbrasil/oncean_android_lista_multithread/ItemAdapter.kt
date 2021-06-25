package com.oceanbrasil.oncean_android_lista_multithread

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Pokemon(
    val nome: String,
    val imagemUrl: String
)

class ItemAdapter(
    val items: List<Pokemon>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(item: Pokemon) {
            val ivImage = itemView.findViewById<ImageView>(R.id.ivImage)
            val tvName = itemView.findViewById<TextView>(R.id.tvName)

            tvName.text = item.nome
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    /*
    override fun getItemCount(): Int {
        return items.count()
    }
    */
    // Versão simplificada:
    override fun getItemCount() = items.count()
}
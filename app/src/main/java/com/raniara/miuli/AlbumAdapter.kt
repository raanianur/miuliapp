package com.raniara.miuli

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView

class AlbumAdapter (private val listAlbum: ArrayList<MyAlbums>)
    : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    // Class Holder
    class AlbumViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val albumChar: AppCompatButton = itemView.findViewById(R.id.btn_album_char)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.album_item, parent, false)
        return AlbumViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val (albumchar) = listAlbum[position]
        holder.albumChar.text = albumchar
    }

    override fun getItemCount(): Int {
        return listAlbum.size
    }
}
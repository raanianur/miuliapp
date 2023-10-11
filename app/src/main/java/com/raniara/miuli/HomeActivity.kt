package com.raniara.miuli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val adapter = AlbumAdapter(getAlbumsData())

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val recyclerView = findViewById<RecyclerView>(R.id.album_chars)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter

    }

    private fun getAlbumsData(): ArrayList<MyAlbums> {
        val albumsArray = resources.getStringArray(R.array.albums_char)

        val albumsArrayList = ArrayList<MyAlbums>()

        for (i in albumsArray.indices) {
            val albums = MyAlbums(
                albumsArray[i]
            )
            albumsArrayList.add(albums)
        }

        return albumsArrayList
    }
}
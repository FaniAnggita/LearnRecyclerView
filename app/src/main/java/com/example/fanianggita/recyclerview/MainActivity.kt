package com.example.fanianggita.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.fanianggita.recyclerview.adapter.ItemAdapter
import com.example.fanianggita.recyclerview.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengisialiasi data source afirmasi.
        val myDataset = Datasource().loadAffirmations()

        // variabel dipakai untuk untuk menemukan id 'recycler_view' di dalam activity_main.xml.
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        // menetapkan recyclerView untuk menggunakan class ItemAdapter. Argumen 'this' pada 'ItemAdapter' untuk merujuk ke activity ini.
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // untuk mengatur bahwa perubahan ukuran konten tidak mengubah ukuran tata letak RecyclerView.
        // Selain itu, untuk meningkatkan performa.
        recyclerView.setHasFixedSize(true)
    }
}
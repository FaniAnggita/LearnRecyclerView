package com.example.fanianggita.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fanianggita.recyclerview.R
import com.example.fanianggita.recyclerview.model.Affirmation

// TODO 4: Kelas ini sebagai Adapter, yaitu kelas yang mengambil data dan menyiapkannya agar RecyclerView bisa ditampilkan.
// Parameter private val dataset: List<Affirmation> pada konstruktor ItemAdapter supaya dapat meneruskan daftar afirmasi ke adaptor.
// Parameter Context untuk mengolah informasi resource string an informasi lainnya tentang aplikasi.
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /*
    Metode onCreateViewHolder() untuk membuat holder tampilan baru pada RecyclerView
    saat tidak ada holder tampilan yang ada yang dapat digunakan kembali.
    */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /*
     Metode onBindViewHolder untuk mengelola layout untuk mengganti isi tampilan pada daftar item.
    */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    // Metode getItemCount untuk menampilkan ukuran set data di properti dataset konstruktor ItemAdapter.
    override fun getItemCount() = dataset.size

    // TODO 5: Kelas viewholder untuk menampung kumpulan tampilan RecyclerView yang akan digunakan kembali untuk menampilkan item teks afirmasi dan gambarnya.
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        // menemukan elemen TextView ID 'item_title' dan menetapkannya ke variabel 'textView'
        val textView: TextView = view.findViewById(R.id.item_title)

        // menemukan elemen ImageView ID 'item_image' dan menetapkannya ke variabel 'imageView'
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
}
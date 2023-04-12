package org.diyorbek.recyclerview_h1.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import org.diyorbek.recyclerview_h1.model.ItemInfo
import org.diyorbek.recyclerview_h1.R


class ItemAdapter(context: Context, private val itemList: MutableList<ItemInfo>) :
    BaseAdapter() {
    private val layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = itemList.size

    override fun getItem(p0: Int): Any = itemList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = layoutInflater.inflate(R.layout.items_list, p2, false)
        val itemImage2: ImageView = view.findViewById(R.id.itemImage)
        val itemName2: TextView = view.findViewById(R.id.itemName)
        val itemDescription2: TextView = view.findViewById(R.id.itemDescription)
        val itemCount: TextView = view.findViewById(R.id.itemCount)
        val item2 = getItem(p0) as ItemInfo
        itemImage2.setImageResource(item2.itemImage)
        itemName2.text = item2.itemName
        itemDescription2.text = item2.itemDescriptor
        itemCount.text = item2.itemCount
        return view
    }
}
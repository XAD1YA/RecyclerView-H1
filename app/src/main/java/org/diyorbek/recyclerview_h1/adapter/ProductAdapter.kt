package org.diyorbek.recyclerview_h1.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import org.diyorbek.recyclerview_h1.model.ProductInfo
import org.diyorbek.recyclerview_h1.R

class ProductAdapter(context: Context, private val productList: MutableList<ProductInfo>) :
    BaseAdapter() {
    private val layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = productList.size

    override fun getItem(p0: Int): Any = productList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = layoutInflater.inflate(R.layout.menu, p2, false)
        val productImage2: ImageView = view.findViewById(R.id.productImage)
        val productName2: TextView = view.findViewById(R.id.productName)
        val productInfo2: TextView = view.findViewById(R.id.productInfo)
        val productBought: SwitchCompat = view.findViewById(R.id.productBought)
        val product = getItem(p0) as ProductInfo
        productImage2.setImageResource(product.image)
        productName2.text = product.productName
        productInfo2.text = product.productInfo
        productBought.isChecked = product.productBought
        return view
    }
}
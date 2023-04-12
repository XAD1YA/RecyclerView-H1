package org.diyorbek.recyclerview_h1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import org.diyorbek.recyclerview_h1.adapter.ProductAdapter
import org.diyorbek.recyclerview_h1.model.ProductInfo

class SecondActivty : AppCompatActivity() {
    private lateinit var listView: ListView
    private val productAdapter by lazy { ProductAdapter(this, productList()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_activty)
        supportActionBar?.hide()
        listView = findViewById(R.id.listView)
        listView.adapter = productAdapter
        val btn: ImageView = findViewById(R.id.btnBack)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun productList(): MutableList<ProductInfo> {
        val list = mutableListOf<ProductInfo>()
        list.add(ProductInfo(R.drawable.lapm_foto, "Lamp", "85% lightness", true))
        list.add(ProductInfo(R.drawable.tv_foto, "Tv", "27% Watches", false))
        list.add(ProductInfo(R.drawable.air_condition_foto, "Air condition", "35% hotness", true))
        list.add(ProductInfo(R.drawable.fridge_foto, "Fridge", "9% C coldness", true))
        list.add(ProductInfo(R.drawable.cam_foto, "CCTV Cam", "Make records home", false))
        return list

    }
}
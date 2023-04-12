package org.diyorbek.recyclerview_h1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import org.diyorbek.recyclerview_h1.adapter.ItemAdapter
import org.diyorbek.recyclerview_h1.model.ItemInfo
import com.google.android.material.button.MaterialButton

class ThirdActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private val itemAdapter by lazy { ItemAdapter(this, itemList()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        supportActionBar?.hide()
        listView = findViewById(R.id.listView2)
        listView.adapter = itemAdapter
        val btn: ImageView = findViewById(R.id.backToFirst)
        btn.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val btn2: MaterialButton = findViewById(R.id.toLast)
        btn2.setOnClickListener {
            startActivity(Intent(this, LastActivity::class.java))
            finish()
        }


    }

    private fun itemList(): MutableList<ItemInfo> {
        val list = mutableListOf<ItemInfo>()
        list.add(ItemInfo(R.drawable.termos, "Reinstall OS", "Remove software", "\$5/Unit", "2"))
        list.add(ItemInfo(R.drawable.keyboard, "KeyBoard Service", "Fix keyboard", "\$10/Unit", "0"))
        list.add(ItemInfo(R.drawable.hard_service, "Hard Service", "Install software", "\$25/Unit", "1"))
        list.add(ItemInfo(R.drawable.pc_service, "Pc Service", "Fix pc", "\$15/Unit", "1"))
        list.add(ItemInfo(R.drawable.image, "Download photo", "Download photo", "\$3/Unit", "5"))
        return list

    }
}
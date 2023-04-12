package org.diyorbek.recyclerview_h1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import org.diyorbek.recyclerview_h1.adapter.ContactAdapter
import org.diyorbek.recyclerview_h1.model.ContactInfo

class LastActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private val contactAdapter by lazy { ContactAdapter(this, contactList()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        supportActionBar?.hide()
        listView = findViewById(R.id.listView3)
        listView.adapter = contactAdapter
        val btn: ImageView = findViewById(R.id.backToBack)
        btn.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
            finish()
        }
    }

    private fun contactList(): MutableList<ContactInfo> {
        val list = mutableListOf<ContactInfo>()
        list.add(ContactInfo("Java", "Learn Kotlin!", "28.10.22"))
        list.add(ContactInfo("Android Kotlinov", "Nice job", "02.11.22"))
        list.add(ContactInfo("Kotlinjon", "Good App", "Yesterday"))
        list.add(ContactInfo("Martin Lopar", "Nice room Smit", "Today at 10:22"))
        list.add(ContactInfo("J.Carolina", "Thanks for order", "29.10.22"))
        list.add(ContactInfo("Malvin Firdaus", "You make them", "20.09.22"))
        return list

    }
}
package org.diyorbek.recyclerview_h1.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.diyorbek.recyclerview_h1.model.ContactInfo
import org.diyorbek.recyclerview_h1.R

class ContactAdapter(context: Context, private val contactList: MutableList<ContactInfo>) :
    BaseAdapter() {
    private val layoutInflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = contactList.size

    override fun getItem(p0: Int): Any = contactList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = layoutInflater.inflate(R.layout.last_list, p2, false)
        val contactName: TextView = view.findViewById(R.id.contactName)
        val contactMessage: TextView = view.findViewById(R.id.contactMessage)
        val contactDate: TextView = view.findViewById(R.id.messageDate)
        val item2 = getItem(p0) as ContactInfo
        contactName.text = item2.contactName
        contactMessage.text = item2.contactMessage
        contactDate.text = item2.contactDate
        return view
    }
}
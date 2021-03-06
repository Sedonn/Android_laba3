package com.example.laba3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class DBListAdapter(val context: Context, val dbDataList: ArrayList<DBItem>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.db_list_item, parent, false)

        val idTextView = view.findViewById(R.id.ID) as TextView
        val lastNameTextView = view.findViewById(R.id.lastName) as TextView
        val firstNameTextView = view.findViewById(R.id.firstName) as TextView
        val middleNameTextView = view.findViewById(R.id.middleName) as TextView
        val dateOfAddTextView = view.findViewById(R.id.dateOfAdd) as TextView

        idTextView.text = dbDataList[position]._ID.toString()
        lastNameTextView.text = dbDataList[position].lastName
        firstNameTextView.text = dbDataList[position].firstName
        middleNameTextView.text = dbDataList[position].middleName
        dateOfAddTextView.text = dbDataList[position].dateOfAdd

        return view
    }

    override fun getItem(position: Int): Any {
        return dbDataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return dbDataList.size
    }


}
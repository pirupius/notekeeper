package com.pirumart.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            val activityIntent =  Intent(this, NewNoteActivity::class.java)
            startActivity(activityIntent)
        }

        noteList.adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataManager.notes)

        noteList.setOnItemClickListener{parent, view, position, id ->
            val activityIntent = Intent(this, NewNoteActivity::class.java)
            activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
            startActivity(activityIntent)
        }
    }

}

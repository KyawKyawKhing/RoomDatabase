package com.onlineclass.nw.kcube.roomdatabasetesting

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.onlineclass.nw.kcube.roomdatabasetesting.adapter.UserAdapter
import com.onlineclass.nw.kcube.roomdatabasetesting.other.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFab.setOnClickListener({
            val intent = Intent(this@MainActivity, AddDataActivity::class.java)
            startActivity(intent)
        })
        val DB = AppDatabase.getAppDatabase(this)
        val adapter = UserAdapter(DB.userDao().all)
        recyclerView.adapter = adapter
        recyclerView!!.layoutManager = LinearLayoutManager(this@MainActivity)
    }
}

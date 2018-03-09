package com.onlineclass.nw.kcube.roomdatabasetesting

import android.arch.persistence.room.Room
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.onlineclass.nw.kcube.roomdatabasetesting.entity.User
import com.onlineclass.nw.kcube.roomdatabasetesting.model.UserModel
import com.onlineclass.nw.kcube.roomdatabasetesting.other.AppDatabase
import kotlinx.android.synthetic.main.activity_add_data.*

class AddDataActivity : AppCompatActivity() {
    var myDB: AppDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_data)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        myDB = AppDatabase.getAppDatabase(applicationContext)
//        val myDB = Room.databaseBuilder(applicationContext,
//                AppDatabase::class.java, "UserDatabase").build()
        addDataBtn.setOnClickListener({
            val user = User(myDB!!.userDao().all.size + 1, "ko mg mg", "komgmg@gmail.com", "k_yangon")
            val userone = User(2, "ko ko", "koko@gmail.com", "yangon")
            myDB!!.userDao().insertAll(user)
//            myDB!!.userDao().insertAll(userone)
            val result = myDB!!.userDao().all.size
            Log.e("result size", result.toString())
        })
    }
}

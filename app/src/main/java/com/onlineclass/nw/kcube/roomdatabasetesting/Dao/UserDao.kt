package com.onlineclass.nw.kcube.roomdatabasetesting.Dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import com.onlineclass.nw.kcube.roomdatabasetesting.entity.User

/**
 * Created by K Cube on 12/3/2017.
 */
@Dao
interface UserDao {

    @get:Query("SELECT * FROM User")
    val all: List<User>

    @Insert(onConflict = REPLACE)
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}
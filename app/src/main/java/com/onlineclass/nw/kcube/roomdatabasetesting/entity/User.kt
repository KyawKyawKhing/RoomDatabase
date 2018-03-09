package com.onlineclass.nw.kcube.roomdatabasetesting.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by K Cube on 12/3/2017.
 */
@Entity
class User {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

    @ColumnInfo(name = "name")
    var name: String? = null

    @ColumnInfo(name = "email")
    var email: String? = null

    @ColumnInfo(name = "address")
    var address: String? = null

    constructor(id: Int, name: String, email: String, address: String) : this() {
        this.id = id
        this.name = name
        this.email = email
        this.address = address
    }

    constructor()

}

//@Entity
//class Brand_Model(@field:PrimaryKey
//                  var id: Int, var brand_name: String, var brand_id: String)

//@Entity(tableName = "users")
//class User(@field:PrimaryKey
//           var id: Int, var name: String, var email: String, var address: String)
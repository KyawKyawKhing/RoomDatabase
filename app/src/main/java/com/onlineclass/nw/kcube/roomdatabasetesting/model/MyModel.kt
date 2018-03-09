package com.onlineclass.nw.kcube.roomdatabasetesting.model

/**
 * Created by K Cube on 12/3/2017.
 */
class UserModel {
    var id: Int? = null
    var name: String? = null
    var email: String? = null
    var address: String? = null

    constructor(name: String, email: String, address: String) : this() {
        this.name = name
        this.email = email
        this.address = address
    }

    constructor()
}
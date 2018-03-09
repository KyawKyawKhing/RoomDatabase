package com.onlineclass.nw.kcube.roomdatabasetesting.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.onlineclass.nw.kcube.roomdatabasetesting.R
import com.onlineclass.nw.kcube.roomdatabasetesting.entity.User
import com.onlineclass.nw.kcube.roomdatabasetesting.model.UserModel

/**
 * Created by K Cube on 12/3/2017.
 */
class UserAdapter(var arrayList: List<User>) : RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        holder!!.name!!.text = arrayList[position].name
        holder.email!!.text = arrayList[position].email
        holder.address!!.text = arrayList[position].address
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent?.context).inflate(R.layout.user_listitem, parent, false)
        return MyViewHolder(itemView)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView? = null
        var email: TextView? = null
        var address: TextView? = null

        init {
            name = itemView.findViewById(R.id.nameTV)
            email = itemView.findViewById(R.id.emailTV)
            address = itemView.findViewById(R.id.addressTV)
        }
    }

}
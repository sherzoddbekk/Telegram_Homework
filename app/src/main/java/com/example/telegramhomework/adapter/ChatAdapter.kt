package com.example.telegramhomework.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramhomework.R
import com.example.telegramhomework.model.Chat
import com.google.android.material.imageview.ShapeableImageView

data class ChatAdapter(var context: Context, var items: ArrayList<Chat>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_INVITE = 0
    private val TYPE_FIND = 1
    private val TYPE_CONTACT = 2


    override fun getItemViewType(position: Int): Int {
        if (isInvite(position)) return TYPE_INVITE
        if (isFind(position)) return TYPE_FIND
        return TYPE_CONTACT
    }

    fun isInvite(position: Int): Boolean {
        return position == 1
    }

    fun isFind(position: Int): Boolean {
        return position == 0
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == TYPE_INVITE){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_invity_friends,parent,false)
            return InviteViewHolder(view)
        }
        if (viewType == TYPE_FIND){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout_find_people,parent,false)
            return FindViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MessageViewHolder(view)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        if (holder is MessageViewHolder) {
            val user = items.get(position-2)
            holder.iv_profile.setImageResource(user.profile)
            holder.tv_fullname.setText(user.fullname)
            holder.online_or_not.setText(user.online)
        }
    }

    override fun getItemCount(): Int {

        return items.size+2
    }

    class MessageViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var online_or_not: TextView

        init {
            iv_profile = view.findViewById(R.id.sh_profile)
            tv_fullname = view.findViewById(R.id.fullname)
            online_or_not = view.findViewById(R.id.online_or_not)
        }
    }
    class InviteViewHolder(var view: View):RecyclerView.ViewHolder(view){}

    class FindViewHolder(var view: View):RecyclerView.ViewHolder(view){}
}
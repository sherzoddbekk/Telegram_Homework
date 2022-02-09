package com.example.telegramhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegramhomework.adapter.ChatAdapter
import com.example.telegramhomework.model.Chat

class MainActivity : AppCompatActivity() {

    lateinit var recycleView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        recycleView = findViewById(R.id.recycle_view)
        recycleView.setLayoutManager(GridLayoutManager(this, 1))
        refreshAdapter(getAllChats())

    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recycleView!!.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {


        val chats: ArrayList<Chat> = ArrayList()


        chats.add(Chat(R.drawable.sherzod, "Jurabekov Sherzod", "Assalomu alaykum yaxshimisiz"))
        chats.add(Chat(R.drawable.rasul, "Qodirov  Rasulbek", "Va alaykum  assalom rahmat"))
        chats.add(Chat(R.drawable.jamshid, "Xudoyberdiyev Jamshid", "Qayerdasan"))
        chats.add(Chat(R.drawable.utkir, "Qo'ziboyev O'tkir", "Uyda oshna"))
        chats.add(
            Chat(
                R.drawable.qobiljon,
                "Jumaboyev Qobiljon",
                "Men ham uydaman o'tiribman mol boqib"
            )
        )
        chats.add(Chat(R.drawable.sherzod, "Jurabekov Sherzod", "Assalomu alaykum yaxshimisiz"))
        chats.add(Chat(R.drawable.rasul, "Qodirov  Rasulbek", "Va alaykum  assalom rahmat"))
        chats.add(Chat(R.drawable.jamshid, "Xudoyberdiyev Jamshid", "Qayerdasan"))
        chats.add(Chat(R.drawable.utkir, "Qo'ziboyev O'tkir", "Uyda oshna"))
        chats.add(
            Chat(
                R.drawable.qobiljon,
                "Jumaboyev Qobiljon",
                "Men ham uydaman o'tiribman mol boqib"
            )
        )
        chats.add(Chat(R.drawable.sherzod, "Jurabekov Sherzod", "Assalomu alaykum yaxshimisiz"))
        chats.add(Chat(R.drawable.rasul, "Qodirov  Rasulbek", "Va alaykum  assalom rahmat"))
        chats.add(Chat(R.drawable.jamshid, "Xudoyberdiyev Jamshid", "Qayerdasan"))
        chats.add(Chat(R.drawable.utkir, "Qo'ziboyev O'tkir", "Uyda oshna"))
        chats.add(
            Chat(
                R.drawable.qobiljon,
                "Jumaboyev Qobiljon",
                "Men ham uydaman o'tiribman mol boqib"
            )
        )
        chats.add(Chat(R.drawable.sherzod, "Jurabekov Sherzod", "Assalomu alaykum yaxshimisiz"))
        chats.add(Chat(R.drawable.rasul, "Qodirov  Rasulbek", "Va alaykum  assalom rahmat"))
        chats.add(Chat(R.drawable.jamshid, "Xudoyberdiyev Jamshid", "Qayerdasan"))
        chats.add(Chat(R.drawable.utkir, "Qo'ziboyev O'tkir", "Uyda oshna"))
        chats.add(
            Chat(
                R.drawable.qobiljon,
                "Jumaboyev Qobiljon",
                "Men ham uydaman o'tiribman mol boqib"
            )
        )
        chats.add(Chat(R.drawable.sherzod, "Jurabekov Sherzod", "Assalomu alaykum yaxshimisiz"))
        chats.add(Chat(R.drawable.rasul, "Qodirov  Rasulbek", "Va alaykum  assalom rahmat"))
        chats.add(Chat(R.drawable.jamshid, "Xudoyberdiyev Jamshid", "Qayerdasan"))
        chats.add(Chat(R.drawable.utkir, "Qo'ziboyev O'tkir", "Uyda oshna"))
        chats.add(
            Chat(
                R.drawable.qobiljon,
                "Jumaboyev Qobiljon",
                "Men ham uydaman o'tiribman mol boqib"
            )
        )
        return chats
    }

}
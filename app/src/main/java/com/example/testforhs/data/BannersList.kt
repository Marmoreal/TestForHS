package com.example.testforhs.data

import com.example.testforhs.ui.menu.Banner

object BannersList {

    fun getBannersList() = list

    private val list = listOf(
        Banner(
            0,
            "https://avatars.mds.yandex.net/i?id=8af8b33d7f953707938179c174441740-4104102-images-thumbs&ref=rim&n=33&w=225&h=150"
        ),

        Banner(
            1,
            "https://sc01.alicdn.com/kf/HTB1DQn4NPTpK1RjSZKPq6y3UpXaO/230803871/HTB1DQn4NPTpK1RjSZKPq6y3UpXaO.jpg"
        ),

        Banner(
            2,
            "https://advicehowtodo.com/userfiles/103/484_1.webp"
        )
    )
}
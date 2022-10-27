package com.indra.ViewPagerSlide

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listMyFriends:ArrayList<MyFriends>

    private fun simulasiDataTeman() {
        listMyFriends= ArrayList()
        listMyFriends.add(
            MyFriends("samsul kopling", "pria", "samkop@gmail.com", "08233456789","kuvukiland")
        )
        listMyFriends.add(MyFriends("reza kecap", "pria", "bangosedap@gmail.com", "082334533322","konoha")
        )
        listMyFriends.add(MyFriends("siti gorila", "wanita", "sisilhit@gmail.com", "084577753322","sunagakure")
        )
        listMyFriends.add(MyFriends("paijo wimcycle", "pria", "mtbresing@gmail.com", "08233454588","cybertron")
        )
        listMyFriends.add(MyFriends("alok", "pria", "pristeldulu@gmail.com", "089511465798","pochinki")
        )

    }


    @SuppressLint("UseRequireInsteadOfGet")
    private fun tampilTeman() {
        rv_listMyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyFriends.adapter=MyFriendAdapter(activity!!, listMyFriends)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}
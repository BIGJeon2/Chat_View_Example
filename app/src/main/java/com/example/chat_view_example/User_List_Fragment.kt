package com.example.chat_view_example

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chat_view_example.databinding.FragmentUserListBinding

class User_List_Fragment : Fragment() {

    private var _binding: FragmentUserListBinding? = null
    private val binding get() = _binding!!
    private var list = mutableListOf<RCV_Item>(
        RCV_Item(R.drawable.ic_launcher_background, "Big_Jeon", "테스트"),
        RCV_Item(R.drawable.ic_launcher_foreground, "Ahn_Soo_Hyun", "사업을 하자"),
        RCV_Item(R.drawable.ic_launcher_background, "정민재", "꾸준하게하자"),
        RCV_Item(R.drawable.ic_launcher_foreground, "전희태", "이건 프로필용"),
        RCV_Item(R.drawable.ic_launcher_background, "MUJI", "프로필"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentUserListBinding.inflate(inflater, container, false)
        val view = binding.root
        var adapter = rcv_Adapter(list, view.context)
        var layout_manager = LinearLayoutManager(view.context)
        binding.UserRCV.adapter = adapter
        binding.UserRCV.layoutManager = layout_manager
        binding.UserRCV.setHasFixedSize(true)
        return view
    }

}
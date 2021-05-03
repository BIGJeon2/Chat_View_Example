package com.example.chat_view_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chat_view_example.databinding.FragmentChatListBinding
import com.example.chat_view_example.databinding.FragmentUserListBinding

class Chat_List_Fragment : Fragment() {

    private var _binding : FragmentChatListBinding? = null
    private val binding get() = _binding!!
    private var list = mutableListOf<RCV_Item>(
        RCV_Item(R.drawable.ic_launcher_background, "Big_Jeon", "개웃기넼ㅋㅋㅋ"),
        RCV_Item(R.drawable.ic_launcher_foreground, "Ahn_Soo_Hyun", "아니 진짜롴ㅋㅋㅋ"),
        RCV_Item(R.drawable.ic_launcher_background, "정민재", "LOL~"),
        RCV_Item(R.drawable.ic_launcher_foreground, "전희태", "확인이"),
        RCV_Item(R.drawable.ic_launcher_background, "MUJI", "이건 채팅용"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatListBinding.inflate(inflater, container, false)
        val view = binding.root
        var adapter = rcv_Adapter(list, view.context)
        var layout_manager = LinearLayoutManager(view.context)
        binding.ChatRCV.adapter = adapter
        binding.ChatRCV.layoutManager = layout_manager
        binding.ChatRCV.setHasFixedSize(true)
        return view
    }

}
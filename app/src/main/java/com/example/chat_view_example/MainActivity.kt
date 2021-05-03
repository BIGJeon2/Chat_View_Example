package com.example.chat_view_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.chat_view_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val user_fragmnet = User_List_Fragment()
        val chat_fragment = Chat_List_Fragment()
        var transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.Frame_Layout, user_fragmnet)
        transaction.commit()

        binding.UserListBtn.setOnClickListener {
            changeFrag(user_fragmnet)
        }
        binding.ChatListBtn.setOnClickListener {
            changeFrag(chat_fragment)
        }
    }
    fun changeFrag(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.Frame_Layout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
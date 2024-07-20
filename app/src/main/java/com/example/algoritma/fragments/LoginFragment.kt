package com.example.algoritma.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.algoritma.R
import com.example.algoritma.data.Urun
import com.example.algoritma.databinding.FragmentLoginBinding



class LoginFragment : Fragment() {

      private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding=FragmentLoginBinding.inflate(inflater,container,false)


        binding.imageView4.setOnClickListener {

            val urun=Urun(100,"computer")
            val gecis=LoginFragmentDirections.actionLoginFragmentToRegisterFragment(
                urun=urun,ad="Osman", age = 24, boy = 181.0f, bekar = true)
            Navigation.findNavController(it).navigate(gecis)
        }

        binding.goToShareFragment.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_bottomSheetDialog)
        }

        return (binding.root)
    }

}
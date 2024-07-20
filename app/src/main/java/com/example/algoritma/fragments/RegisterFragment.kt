package com.example.algoritma.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.algoritma.R
import com.example.algoritma.data.Urun
import com.example.algoritma.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentRegisterBinding.inflate(inflater,container,false)


        binding.loginButton.setOnClickListener {
            findNavController().popBackStack()
        }
       val args: RegisterFragmentArgs by navArgs()

        val gelenAd=args.ad
        val gelenYas=args.age
        val gelenBoy=args.boy
        val gelenBekar=args.bekar
        val urunId=args.urun.id
        val urunAd=args.urun.ad

        binding.textView7.text="$gelenAd - $gelenYas - $gelenBoy - $gelenBekar- $urunAd - $urunId"





        return binding.root
    }

}
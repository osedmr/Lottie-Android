package com.example.algoritma.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.airbnb.lottie.LottieDrawable
import com.example.algoritma.R
import com.example.algoritma.databinding.FragmentBottomSheetDialogBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar


class BottomSheetDialog : BottomSheetDialogFragment() {
    private lateinit var binding:FragmentBottomSheetDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentBottomSheetDialogBinding.inflate(inflater,container,false)

        binding.shareAnimation.apply {
            setAnimation(R.raw.animation) // Bu satırı XML'de zaten yapmışsınız
            playAnimation()
            repeatCount = LottieDrawable.INFINITE
        }

        binding.copyAnimation.apply {
            setAnimation(R.raw.copy)
            playAnimation()
            repeatCount=LottieDrawable.INFINITE
        }

        binding.shareAnimation.setOnClickListener {

            Snackbar.make(it,"Paylaşıldı",Snackbar.LENGTH_LONG).show()
        }

        binding.copyAnimation.setOnClickListener {

            Snackbar.make(it,"Kopyalandı",Snackbar.LENGTH_LONG).show()
        }



        return binding.root
    }


}
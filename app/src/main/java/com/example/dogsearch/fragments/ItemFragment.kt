package com.example.dogsearch.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.dogsearch.R
import com.example.dogsearch.databinding.FragmentItemBinding


class ItemFragment : Fragment() {

    private var _binding: FragmentItemBinding? = null
    private val binding get() = _binding!!

    private val item by navArgs<ItemFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentItemBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){
        binding.apply {
            detailsImage.setImageResource(item.itemData.img)
            detailsTitle.text = item.itemData.title
            detailsDescription.text = item.itemData.description
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.example.dogsearch.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dogsearch.R
import com.example.dogsearch.adapters.DogItemsAdapter
import com.example.dogsearch.databinding.FragmentSearchBinding
import com.example.dogsearch.model.Items
import com.example.dogsearch.model.dogList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.contains as contains1

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    var searchList = mutableListOf<Items>()

    private val adapter: DogItemsAdapter by lazy {
        DogItemsAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchList.addAll(dogList)

        setUpSearch()
        setUpRecycler()

    }

    private fun setUpRecycler() {
        binding.apply {
            recycler.adapter = adapter
        }
        adapter.setData(searchList)
        adapter.clickItem = {
            findNavController().navigate(
                SearchFragmentDirections.actionSearchFragmentToItemFragment(itemData = it)
            )
        }
    }

    private fun setUpSearch() {

        binding.search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun onQueryTextChange(newText: String?): Boolean {

                if (newText!!.isNotEmpty()) {
                    searchList.clear()
//                    searchList = dogList.filter {
//                        it.title.lowercase(Locale.getDefault()).contains(search)
//                    } as MutableList<Items>

                    dogList.forEach {
                        if (it.title.contains(newText, true)) {
                            searchList.add(it)
                        }
                    }

//                    adapter.notifyDataSetChanged()
                    adapter.setData(searchList)

                } else {
                    searchList.clear()
                    searchList.addAll(dogList)
                    adapter.setData(searchList)
//                    adapter.notifyDataSetChanged()
                }
                return true
            }

        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
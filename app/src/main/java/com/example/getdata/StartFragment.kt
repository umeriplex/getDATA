package com.example.getdata

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.getdata.databinding.FragmentStart2Binding
import com.example.getdata.generals.showToast

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStart2Binding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStart2Binding.inflate(inflater, container, false)

        binding.startBtn.setOnClickListener{
            val PERMISSION_ALL = 1
            val PERMISSIONS = arrayOf(
                android.Manifest.permission.READ_PHONE_STATE,
                android.Manifest.permission.ACCESS_COARSE_LOCATION,
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            )
            if (!hasPermissions(requireActivity(), *PERMISSIONS)) {
                ActivityCompat.requestPermissions(requireActivity(), PERMISSIONS, PERMISSION_ALL)
                return@setOnClickListener


            }
        }




        return binding.root
    }
    fun hasPermissions(context: Context, vararg permissions: String): Boolean = permissions.all {
        ActivityCompat.checkSelfPermission(context, it) == PackageManager.PERMISSION_GRANTED
    }
}
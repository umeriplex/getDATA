package com.example.getdata.generals

import android.content.Context
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigation.findNavController
import com.example.getdata.R
import org.apache.http.util.Args.check
import org.apache.http.util.Asserts.check
import java.security.Permission
import java.security.Permissions
import java.util.ArrayList

fun Fragment.showToast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
}

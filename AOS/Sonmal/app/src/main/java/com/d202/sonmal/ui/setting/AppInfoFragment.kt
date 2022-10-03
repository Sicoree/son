package com.d202.sonmal.ui.setting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.d202.sonmal.R
import com.d202.sonmal.databinding.FragmentAppInfoBinding
import com.d202.sonmal.ui.setting.dialog.PrivacyPolishDialog
import com.d202.sonmal.ui.sign.dialog.PermissionDialog


class AppInfoFragment : Fragment() {

    private lateinit var binding: FragmentAppInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAppInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnBack.setOnClickListener { findNavController().popBackStack() }
            btnPrivacyPolish.setOnClickListener {
                PrivacyPolishDialog(requireContext()).show(parentFragmentManager, null)
            }
        }
    }
}
package com.fairtiq.navigationdemo.dest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.navArgs
import com.fairtiq.navigationdemo.R
import kotlinx.android.synthetic.main.gallery_fragment.*

class GalleryFragment : Fragment() {

    companion object {
        fun newInstance() = GalleryFragment()
    }

    private lateinit var viewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gallery_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        // TODO: Use the ViewModel

        arguments?.let {
            val safeArgs: GalleryFragmentArgs by navArgs()
            safeArgs.user?.let { user ->
                userName.text = user.name
                imageView.setImageResource(user.avatar)
            }
        } ?: run {
            userName.text = "Arguments not provided"
            imageView.setImageResource(0)
        }
    }

}

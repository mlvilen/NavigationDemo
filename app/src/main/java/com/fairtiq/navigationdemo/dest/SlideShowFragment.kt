package com.fairtiq.navigationdemo.dest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.fairtiq.navigationdemo.R
import kotlinx.android.synthetic.main.slide_show_fragment.*

class SlideShowFragment : Fragment() {

    private lateinit var viewModel: SlideShowViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.slide_show_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SlideShowViewModel::class.java)
        // TODO: Use the ViewModel
        goHome.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.next_action, null)
        )
    }

}

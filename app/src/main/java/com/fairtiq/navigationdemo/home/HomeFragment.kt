package com.fairtiq.navigationdemo.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.fairtiq.navigationdemo.R
import com.fairtiq.navigationdemo.User
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)


        val options = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        val navigationArguments = HomeFragmentDirections.nextAction(User("Droid", R.drawable.droid_on_board))
        go_to_gallery_button.setOnClickListener {
            findNavController().navigate(R.id.nav_gallery, navigationArguments.arguments, options)
        }


        // navigate using an action
        go_to_gallery_button_with_action.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.next_action, null)
        )

        go_to_slide_button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.slide_action, null)
        )
    }

}

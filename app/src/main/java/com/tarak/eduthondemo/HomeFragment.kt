package com.tarak.eduthondemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class HomeFragment : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        toolbar = (view?.findViewById(R.id.toolbar) as Toolbar?)!!
        drawerLayout = requireActivity().findViewById(R.id.drawer_layout) as DrawerLayout
        navView= requireActivity().findViewById(R.id.nav_view) as NavigationView
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
  //      setSupportActionBar(toolbar)

        val toogle= ActionBarDrawerToggle(activity, drawerLayout, toolbar, 0, 0)
        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
        navView.setNavigationItemSelectedListener(this)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")
    }

}
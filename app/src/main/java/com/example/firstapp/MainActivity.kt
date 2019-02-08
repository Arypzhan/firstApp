package com.example.firstapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_first_layout -> {
                loadFirst(frag1 = FirstFragment())
            }
            R.id.nav_second_layout -> {
                loadSecond(frag2 = SecondFragment())
            }
            R.id.nav_third_layout -> {
                loadThird(frag3 = ThirdFragment())
            }
            R.id.nav_service_layout -> {
                loadService(frag4 = ServiceFragment())
            }
            R.id.nav_calculator_layout -> {
                loadCalculator(frag5 = CalculatorFragment())
            }
            R.id.nav_calendar_layout -> {
                loadCalendar(frag6 = CalendarFragment())
            }
            R.id.nav_documents_layout -> {
                loadDocuments(frag7 = DocumentsFragment())
            }
            R.id.nav_report_layout -> {
                loadReport(frag8 = ReportFragment())
            }
            R.id.nav_pays_layout -> {
                loadPays(frag9 = PaysFragment())
            }
            R.id.nav_documentation_layout -> {
                loadDocumentation(frag10 = DocumentationFragment())
            }
            R.id.nav_contacts_layout -> {
                loadContacts(frag11 = ContactsFragment())
            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
    private fun loadFirst(frag1:FirstFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag1)
        fm.commit()
    }
    private fun loadSecond(frag2:SecondFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag2)
        fm.commit()
    }
    private fun loadThird(frag3:ThirdFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag3)
        fm.commit()
    }
    private fun loadService(frag4:ServiceFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag4)
        fm.commit()
    }
    private fun loadCalculator(frag5:CalculatorFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag5)
        fm.commit()
    }
    private fun loadCalendar(frag6: CalendarFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag6)
        fm.commit()
    }
    private fun loadDocuments(frag7:DocumentsFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag7)
        fm.commit()
    }
    private fun loadReport(frag8:ReportFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag8)
        fm.commit()
    }
    private fun loadPays(frag9:PaysFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag9)
        fm.commit()
    }
    private fun loadDocumentation(frag10:DocumentationFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag10)
        fm.commit()
    }
    private fun loadContacts(frag11:ContactsFragment){
        val fm =supportFragmentManager.beginTransaction()
        fm.replace(R.id.frameLayout,frag11)
        fm.commit()
    }

}

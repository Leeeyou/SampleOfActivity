package com.leeeyou.sampleoflifecycle

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        btnGotoSubActivity.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    SubActivity::class.java
                )
            )
        }

        btnGotoClubActivity.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    ClubActivity::class.java
                )
            )
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        Log.e(TAG, "onCreateOptionsMenu")
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Log.e(TAG, "onPrepareOptionsMenu")
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onPostCreate")
        super.onPostCreate(savedInstanceState)
    }

    override fun onRestart() {
        Log.e(TAG, "onRestart")
        super.onRestart()
    }

    override fun onStart() {
        Log.e(TAG, "onStart")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.e(TAG, "onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.e(TAG, "onResume")
        super.onResume()
    }

    override fun onPostResume() {
        Log.e(TAG, "onPostResume")
        super.onPostResume()
    }

    override fun onAttachedToWindow() {
        Log.e(TAG, "onAttachedToWindow")
        super.onAttachedToWindow()
    }

    override fun onPause() {
        Log.e(TAG, "onPause")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.e(TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Log.e(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy")
        super.onDestroy()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        Log.e(TAG, "onAttachFragment")
        super.onAttachFragment(fragment)
    }

    override fun onContentChanged() {
        Log.e(TAG, "onContentChanged")
        super.onContentChanged()
    }


}

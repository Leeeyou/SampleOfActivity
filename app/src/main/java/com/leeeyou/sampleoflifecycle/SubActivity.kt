package com.leeeyou.sampleoflifecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.orhanobut.logger.Logger

class SubActivity : AppCompatActivity() {
    
    private val tag = SubActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Logger.e(tag)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        Logger.e(tag)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Logger.e(tag)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        Logger.e(tag)
        super.onPostCreate(savedInstanceState)
    }

    override fun onRestart() {
        Logger.e(tag)
        super.onRestart()
    }

    override fun onStart() {
        Logger.e(tag)
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Logger.e(tag)
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Logger.e(tag)
        super.onResume()
    }

    override fun onPostResume() {
        Logger.e(tag)
        super.onPostResume()
    }

    override fun onAttachedToWindow() {
        Logger.e(tag)
        super.onAttachedToWindow()
    }

    override fun onPause() {
        Logger.e(tag)
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Logger.e(tag)
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Logger.e(tag)
        super.onStop()
    }

    override fun onDestroy() {
        Logger.e(tag)
        super.onDestroy()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        Logger.e(tag)
        super.onAttachFragment(fragment)
    }

    override fun onContentChanged() {
        Logger.e(tag)
        super.onContentChanged()
    }
}

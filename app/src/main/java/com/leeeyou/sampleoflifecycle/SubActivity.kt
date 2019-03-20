package com.leeeyou.sampleoflifecycle

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem

class SubActivity : AppCompatActivity() {
    val TAG = SubActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
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

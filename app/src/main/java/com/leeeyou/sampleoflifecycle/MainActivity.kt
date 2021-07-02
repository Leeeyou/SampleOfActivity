package com.leeeyou.sampleoflifecycle

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    private val tag: String = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        initClick()

        initLogger()
        Logger.d(tag)
    }

    private fun initClick() {
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

    private fun initLogger() {
        val formatStrategy: FormatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)
            .methodCount(1)
            .build()
        Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        Logger.d(tag)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Logger.d(tag)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        Logger.d(tag)
        super.onPostCreate(savedInstanceState)
    }

    override fun onRestart() {
        Logger.d(tag)
        super.onRestart()
    }

    override fun onStart() {
        Logger.d(tag)
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Logger.d(tag)
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Logger.d(tag)
        super.onResume()
    }

    override fun onPostResume() {
        Logger.d(tag)
        super.onPostResume()
    }

    override fun onAttachedToWindow() {
        Logger.d(tag)
        super.onAttachedToWindow()
    }

    override fun onPause() {
        Logger.d(tag)
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Logger.d(tag)
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Logger.d(tag)
        super.onStop()
    }

    override fun onDestroy() {
        Logger.d(tag)
        super.onDestroy()
    }

    override fun onAttachFragment(fragment: Fragment?) {
        Logger.d(tag)
        super.onAttachFragment(fragment)
    }

    override fun onContentChanged() {
        Logger.d(tag)
        super.onContentChanged()
    }

}

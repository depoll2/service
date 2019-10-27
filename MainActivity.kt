package com.example.serviceee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.content.Intent
import android.net.Uri
import com.example.seviceee.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnface.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.facebook.com/Deva Tuswidya"))
            startActivity(i)
        })
        btnig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.instagram.com/ langitinsprirasi.co.id"))
            startActivity(i)
        })
        var  MediaPlayer : MediaPlayer? = MediaPlayer.create(this, R.raw.everlong)
        btn_play.setOnClickListener {
            MediaPlayer?.start()
        }
        btn_pause.setOnClickListener {
            MediaPlayer?.pause()
        }
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)

        }
    }
}

package com.example.bgcolorchanger

import android.graphics.Color
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

private var vR:Int = 0
private var vG:Int = 0
private var vB:Int = 0

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val skR = findViewById<SeekBar>(R.id.seekBarR)
        val skG = findViewById<SeekBar>(R.id.seekBarG)
        val skB = findViewById<SeekBar>(R.id.seekBarB)

        skR.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                findViewById<TextView>(R.id.textView1).text = "R = $progress"
                vR = skR.progress
                doSome()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seek: SeekBar) {}
        })

        skG.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                findViewById<TextView>(R.id.textView2).text = "G = $progress"
                vG = skG.progress
                doSome()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seek: SeekBar) {}
        })

        skB.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                findViewById<TextView>(R.id.textView3).text = "B = $progress"
                vB = skB.progress
                doSome()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seek: SeekBar) {}
        })
    }

    private fun doSome() {
        val color: Int = Color.rgb(vR, vG, vB)
        findViewById<ConstraintLayout>(R.id.mainbg).setBackgroundColor(color)
    }
}




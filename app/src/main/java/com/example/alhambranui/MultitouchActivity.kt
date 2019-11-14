package com.example.alhambranui

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MultitouchActivity : AppCompatActivity() {
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multitouch)

        var mylayout : RelativeLayout = findViewById(R.id.multitouch_layout)

        mylayout.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v : View, m : MotionEvent) : Boolean{
                handleTouch(m)
                return true
            }
        })
    }
    fun handleTouch(m : MotionEvent){
        var pointer_count = m.pointerCount;
        for(i in  0..pointer_count){
            var id=m.getPointerId(i);
            if(id==0){
                findViewById<TextView>(R.id.multitouch).setText("PULSANDO CON UN DEDO");
            }else{
                findViewById<TextView>(R.id.multitouch).setText("PULSANDO CON VARIOS DEDOS");
            }
        }
    }
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_help)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        super.onTouchEvent(event)
        var action: Int = event.getAction()
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                //setPoints(event)
                //invalidate()
                Log.i("INFO", "Presión:" + event.getPressure())
                Log.i("INFO", "Tamaño:" + event.getSize())
            }
        }
        return true
    }
}
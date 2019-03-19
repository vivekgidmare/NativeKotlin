package sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

actual class Sample {
    actual fun checkMe() = 44
}


actual object Platform {
    actual val name: String = "Android"
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloMessage = hello()
        val checked = Sample().checkMe()
        Log.d("TAG", "$checked::$helloMessage")
        tv_hello.text = helloMessage
    }
}
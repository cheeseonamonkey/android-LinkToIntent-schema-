package com.smol.httpthing.ui




import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


fun String?.logit() {
    Log.d("logit", "${this?.toString()}")
}

class InvisibleActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (" --- invisible activity:" +
                "\nIntent:" +
                "\n\tData: ${intent.dataString}" +
                "\n\tHost: ${intent.data?.host}" +
                "\n\tPath: ${intent.data?.path}").logit()






        finish()


    }
}
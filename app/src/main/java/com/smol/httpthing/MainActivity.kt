package com.smol.httpthing

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import com.smol.httpthing.ui.logit
/*
import androidx.compose.Rfoundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

 */
import com.smol.httpthing.ui.theme.HttpThingTheme
import java.util.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Button(
                onClick = {
                    val intent = Intent(Intent.ACTION_PICK_ACTIVITY).apply {
                        /*
                        putExtra(Intent.EXTRA_INTENT, packageManager.queryIntentActivities(intent, PackageManager.MATCH_ALL).toString())
                         */

                    }

                    startActivity(intent)
                    startActivityForResult(intent, 0)
                } ) {
                Text("asdfasdf")

            }

        }



/*
   if ((intent?.hasCategory(Intent.CATEGORY_DEFAULT) == true)  ||
            (intent?.hasCategory(Intent.CATEGORY_DEFAULT) == true) ) {
*/
        if(intent?.action == Intent.ACTION_VIEW)
            "action was view - ${intent?.toString()}".logit()

        "main activity - ${intent?.toURI().toString()}".logit()
       
//Intent.parseUri()
           

        //val server = MyServer(8080)
    }
}
/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HttpThingTheme {
        Greeting("Android")
    }
}

 */
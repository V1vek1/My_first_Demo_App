package com.example.myfirstdemoappbysaumyadi   //Yeh Package name hai

//Yeh like Header Files h, matlab jo chiz hum code me use kar rhe hote h usko phele import karna hota h
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {            //yha "MainActivity" class h jo AppCompatActivity ko inharit kar rha h

    override fun onCreate(savedInstanceState: Bundle?) {  //Yha maine override(Matlab iske Parent class se liya h) function ke help se onCreate ko
                                                          // call kiya h jaab bhi hum kisi aoo ko open karte h to wha onCreate hi work karta h,
                                                          //Or yha per ek parameter pass ho rh h jiska naam h bundle, bundle ki help se app
                                                          //aapne latest atate me hi rhta na ki wo new home page chala jata h

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)      //jaisa ki hum yeh ek source code likh rhe h, jiska ki Design/ layout h, wo yeh "setContentView" se
                                                    // call karke set kar rhe h "activity_main.xml" ko


        //Yha per "val" ki jagah "var" bhi use kar sakte h kyuki dono hi final variable name dene keliye use hote h
        val buttonUpload= findViewById<Button>(R.id.btnUpload)
        val buttonDownload= findViewById<Button>(R.id.btnDownload)




        //Yha maine Button ko assign kiya h ki usper koi jab click karega to wo button kya kaam karega:-

        buttonUpload.setOnClickListener {         //phele maine button ka naam likha phir "setOnClickListener" Function ko call karke
                                                         //Yeh btaya ki iss Button per jab koi click kare to yeh karo

            Toast.makeText(applicationContext, "Uploading......", Toast.LENGTH_SHORT).show()   //hame Yeh msg milega jab koi iss Button per click karega
        }

        buttonDownload.setOnClickListener {
            Toast.makeText(applicationContext, "Downloading......", Toast.LENGTH_SHORT).show()
        }

    }
}
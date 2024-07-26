package com.muhasib.photoframeapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var current=0

    lateinit var image :ImageView
    var names= arrayOf("Babar Azam", "Saim Ayub", "Fakhar Zaman", "Shadab Khan")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var next=findViewById<ImageButton>(R.id.imgNext)
        var prev= findViewById<ImageButton>(R.id.imgPrev)
        var name= findViewById<TextView>(R.id.tvName)




        prev.setOnClickListener{
            val idCurrentImageString="pic$current"
            //this is the string to get its alpha we have to convert the id into what? into a int

            var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString ,"id", packageName)
            image=findViewById(idCurrentImageInt)

            image.alpha=0f

            current=(4+current-1)%4
            var idNextToShowString="pic$current"
            //this is the string to get its alpha we have to convert the id into what? into a int

            var idNextToShowInt=this.resources.getIdentifier(idNextToShowString ,"id", packageName)
            image=findViewById(idNextToShowInt)
            image.alpha=1f

            name.text=names[current]

        }
        next.setOnClickListener{

            var idCurrenrImageString="pic$current"
            //this is the string to get its alpha we have to convert the id into what? into a int

            var idCurrentImageInt=this.resources.getIdentifier(idCurrenrImageString ,"id", packageName)
            image=findViewById(idCurrentImageInt)

            image.alpha=0f

            current=(4+current+1)%4
            var idNextToShowString="pic$current"
            //this is the string to get its alpha we have to convert the id into what? into a int

            var idNextToShowInt=this.resources.getIdentifier(idNextToShowString ,"id", packageName)
            image=findViewById(idNextToShowInt)
            image.alpha=1f

            name.text=names[current]

        }



    }
}
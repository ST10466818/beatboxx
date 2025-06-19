package za.co.varsitycollege.beatboxx

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val startButton = findViewById<AppCompatButton>(R.id.startButton)
        startButton.setOnClickListener {
            Log.d("MainActivity", "Start button clicked") //Log statement for debugging
            val intent = Intent(this, detailedDisplayView::class.java)
            startActivity(intent)
            }
        val exitButton = findViewById<AppCompatButton>(R.id.exitButton)
        exitButton.setOnClickListener {
            finish()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
             val nextbtn = findViewById<AppCompatButton>(R.id.nextbtn)
            nextbtn.setOnClickListener {
                Log.d("MainActivity", "Next button clicked") //Log statement for debugging
                val intent = Intent(this, detailedDisplayView::class.java)
                startActivity(intent)
            }
            val information = findViewById<EditText>(R.id.information)
            Log.d("MainActivity","Information: ${information.text}") //debugging
            Log.d("MainActivity", "Exit button clicked") // debugging
            Log.e("MainActivity", "Error message") //error handling
        }
    }
}
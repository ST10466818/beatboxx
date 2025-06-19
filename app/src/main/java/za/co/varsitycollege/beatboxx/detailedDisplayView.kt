package za.co.varsitycollege.beatboxx

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detailedDisplayView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_display_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnBack = findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {
            finish()
            val intent = Intent(this, MainActivity::getDisplay.java)
            startActivity(intent)
            val avgRatingBtn = findViewById<Button>(R.id.avgRatingBtn)
            avgRatingBtn.setOnClickListener {
                fun calculateAverageRating(): Double {
                    ()
                    val avgRating = calculateAverageRating()
                    val information = findViewById<TextView>(R.id.tv_items)
                    information.text = "Average rating: $avgRating"
                }
            }
        }
    }
}
    private fun calculateAverageRating(): Double {






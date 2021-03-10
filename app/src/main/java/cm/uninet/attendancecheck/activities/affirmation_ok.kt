package cm.uninet.attendancecheck.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import cm.uninet.attendancecheck.R

class affirmation_ok : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmation_ok)

        val bt_affirmation = findViewById<Button>(R.id.bt_affirmation_ok)
        bt_affirmation.setOnClickListener { back_to_home() }
        finish()
    }

    fun back_to_home(){
        startActivity(Intent(this@affirmation_ok, MainActivity::class.java))
    }
}
package cm.uninet.attendancecheck

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import cm.uninet.attendancecheck.activities.MainActivity

class affirmation_error : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmation_error)

        val bt_affirmation = findViewById<Button>(R.id.bt_affirmation_error)
        bt_affirmation.setOnClickListener { back_to_home() }
        finish()
    }

    fun back_to_home(){
        startActivity(Intent(this@affirmation_error, MainActivity::class.java))
    }
}
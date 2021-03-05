package cm.uninet.attendancecheck

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        val bt_confirm = findViewById<Button>(R.id.bt_verification_confirm)
        bt_confirm.setOnClickListener { confirm() }
        finish()
    }

    fun confirm(){
        //Traitement A effectuer

        //Chargement de la page d'affirmation Ok
        startActivity(Intent(this@VerificationActivity, affirmation_ok::class.java))
    }
}
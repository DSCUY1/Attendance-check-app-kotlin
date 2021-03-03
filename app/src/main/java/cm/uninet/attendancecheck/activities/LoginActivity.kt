package cm.uninet.attendancecheck.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import cm.uninet.attendancecheck.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Activation du plein ecran sur le splash screen
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        btn_login.setOnClickListener(){
//          startActivity(Intent(this@LoginActivity, MainActivity::class.java))
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            finish()
        }
    }
}
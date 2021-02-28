package cm.uninet.attendancecheck.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import cm.uninet.attendancecheck.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

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

        // Rediriger vers le login page apres 2,5 secondes
        @Suppress("DEPRECATION")
        Handler().postDelayed(
            {
                // Launch the Login Activity
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            },
            2500
        )

    }
}
package cm.uninet.attendancecheck.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.text.TextUtils
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import cm.uninet.attendancecheck.R
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity(), View.OnClickListener {
//class LoginActivity : BaseActivity() {
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

        email.inputType = InputType.TYPE_CLASS_TEXT or  InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS
//        email.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS)

//        btn_login.setOnClickListener(){
////          startActivity(Intent(this@LoginActivity, MainActivity::class.java))
//            val intent = Intent(this@LoginActivity, MainActivity::class.java)
//            intent.putExtra("key", "Kotlin")
//            startActivity(intent)
//            finish()
//        }
        btn_login.setOnClickListener(this)
        forgot.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.forgot -> {
                    showDialog("Veuillez contacter l'administrateur")
                }
                R.id.btn_login -> {
                    loginUser()
                }
            }
        }
    }

    private fun validateLoginDetails(): Boolean{
        return when{
            TextUtils.isEmpty(email.text.toString().trim { it <= ' '}) -> {
                showErrorSnackBar("Veuillez entrer un nom d'utilisateur", true)
                false
            }
            TextUtils.isEmpty(password.text.toString()) -> {
                showErrorSnackBar("Veuillez entrer un mot de passe", true)
                false
            }
            else -> {
                showErrorSnackBar("Your details are valid.", false)
                true
            }
        }
    }

    private fun loginUser(){
        if (validateLoginDetails()){
            showProgressDialog("Please wait...")

            val user = email.text.toString().trim { it <= ' '}
            val pass = password.text.toString()

            if (user == "admin" && pass == "admin"){
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("username", user)
                startActivity(intent)
                finish()

            } else {
                if (user != "admin"){
                    hideProgressDialog()
                    showErrorSnackBar("Username incorrect !!!", true)
                    t_email.endIconMode = TextInputLayout.END_ICON_NONE
                    email.error = "Username incorrect !!!"
                }
                if (pass != "admin"){
                    hideProgressDialog()
                    showErrorSnackBar("Password incorrect !!!", true)
                    t_password.endIconMode = TextInputLayout.END_ICON_NONE
                    password.error = "Password incorrect !!!"
                }
            }
        }
    }
}
package cm.uninet.attendancecheck.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cm.uninet.attendancecheck.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        bottom_navigation.selectedItemId = R.id.page_1
    }
}
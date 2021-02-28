package cm.uninet.attendancecheck.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class MSPButton(context: Context, attrs: AttributeSet) : AppCompatButton(context, attrs) {
    init {
        // call the function to apply the font to the components.
        applyFont()
    }

    private fun applyFont() {

        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Roboto-Regular.ttf")
        setTypeface(typeface)
    }
}
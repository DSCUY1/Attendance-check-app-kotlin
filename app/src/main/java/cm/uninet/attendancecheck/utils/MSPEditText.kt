package cm.uninet.attendancecheck.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class MSPEditText(context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {
    init {
        // call the function to apply the font to the components.
        applyFont()
    }

    private fun applyFont() {

        val typeface: Typeface =
            Typeface.createFromAsset(context.assets, "Roboto-Thin.ttf")
        setTypeface(typeface)
    }
}
package coml.amen.loginactivity

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.sign_in)
        val spannable = SpannableStringBuilder("Sign in to Zappos.com using Amazon account")
        val start = spannable.indexOf("Zappos.com")
        val end = start + "Zappos.com" .length
        spannable.setSpan(StyleSpan(Typeface.BOLD), start, end, SpannableStringBuilder.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = spannable

        val amazonColor = findViewById<Button>(R.id.button2)
        amazonColor.setBackgroundColor(ContextCompat.getColor(this, R.color.amazon))
    }
}
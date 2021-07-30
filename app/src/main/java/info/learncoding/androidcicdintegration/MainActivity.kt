package info.learncoding.androidcicdintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ")
        Toast.makeText(this, "Showing message", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
    }
}

package com.uberelbalad.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.uberelbalad.app.databinding.ActivityAdminLoginBinding

class AdminLoginActivity : AppCompatActivity() {
    private val adminCode = "010100"
    private lateinit var b: ActivityAdminLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAdminLoginBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.loginBtn.setOnClickListener {
            if (b.codeInput.text.toString() == adminCode) {
                startActivity(Intent(this, AddProductActivity::class.java))
            } else {
                Toast.makeText(this, "الكود غير صحيح", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

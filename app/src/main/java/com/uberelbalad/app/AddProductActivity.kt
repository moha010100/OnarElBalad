
package com.uberelbalad.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uberelbalad.app.databinding.ActivityAddProductBinding

class AddProductActivity : AppCompatActivity() {
    private lateinit var b: ActivityAddProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityAddProductBinding.inflate(layoutInflater)
        setContentView(b.root)

        // Placeholder - Firebase upload will be added later
    }
}

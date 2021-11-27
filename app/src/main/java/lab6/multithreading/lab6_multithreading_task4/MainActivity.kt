package lab6.multithreading.lab6_multithreading_task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import lab6.multithreading.lab6_multithreading_task4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val newURL = "https://www.aziko.ru/images/NRc0e18c39b2399be3a56b8c64240db6da.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Picasso.get().load(newURL).into(binding.imageView)
    }
}
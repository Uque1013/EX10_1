package kr.hs.emirim.kye.ex10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var btnMain: Button
    lateinit var rg: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMain = findViewById(R.id.btnMain)
        rg = findViewById(R.id.rg)
        var intent = Intent(application, SecondActivity::class.java)
        btnMain.setOnClickListener {
            if(rg.checkedRadioButtonId == R.id.rbSecond){
                intent = Intent(application, SecondActivity::class.java)
            } else {
                intent = Intent(application, ThirdActivity::class.java)
            }
            startActivity(intent)
        }
    }
}
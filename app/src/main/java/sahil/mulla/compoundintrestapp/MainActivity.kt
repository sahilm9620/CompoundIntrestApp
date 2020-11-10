package sahil.mulla.compoundintrestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myedit=findViewById<EditText>(R.id.editTextTextPersonName)
        val myedit2=findViewById<EditText>(R.id.editTextTextPersonName2)
        val myedit3=findViewById<EditText>(R.id.editTextTextPersonName3)
        val mytv =findViewById<TextView>(R.id.textView)
        val btn =findViewById<Button>(R.id.button)
        btn.setOnClickListener(View.OnClickListener {
            val num: Int = myedit.text.toString().toInt()
            val num2: Int = myedit2.text.toString().toInt()
            val num3: Int = myedit3.text.toString().toInt()

            val compoundInterest = num.toDouble() * Math.pow((1 + num2.toDouble()/100.00),num3.toDouble())
            mytv.text =("Compound Interest is :$compoundInterest")
        })
    }
}
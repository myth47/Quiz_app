package com.example.quizapp
import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Gravity
import android.view.View
import android.widget.TextSwitcher
import android.widget.TextView
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat

@Suppress("DEPRECATION")
class MainActivity : Activity() {
    @SuppressLint("MissingInflatedId")

    val questions = arrayOf("none","Which country has recently been declared by the US as a “non-NATO ally” status?", "What is the dangerous disease caused by bacteria in humans and cattle called?", "In which of the following state, the Sabarimala Sri Dham Shashtha temple dedicated to Lord Ayyappa is located?", "In which of the following year was the budget system introduced for the first time in India?", "On which day is the World Oral Health Day celebrated every year?", "Who of the following is the only Chief of Air Staff to be given the rank of Marshall of the Indian Air Force?", "Which state government has recently launched 'one family, one job' scheme?")
    var index = 0
    val options = arrayOf("none","China","Qatar","Iraq","Iran","Little Mother","Measles","Anthrax","Malaria","Maharashtra",
        "Karnataka","Manipur","Kerala","1867","1860","1897","1890","18 January","20 January","30 July","20 March","Arjan Singh","Subroto Mukherjee","P.C. Lal"," O.P. Mehra","Rajasthan","Madhya Pradesh","Chhattisgarh","Sikkim")
    val answers = arrayOf("none","2","3","4","2","4","1","4")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getWindow().setFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT)
        getWindow().getDecorView().systemUiVisibility = 3328

        val ans = findViewById<TextView>(R.id.answer)
        val opt1 = findViewById<TextSwitcher>(R.id.option1)
        val opt2 = findViewById<TextSwitcher>(R.id.option2)
        val opt3 = findViewById<TextSwitcher>(R.id.option3)
        val opt4 = findViewById<TextSwitcher>(R.id.option4)


        index = if (index + 1 < questions.size) index + 1 else index + 1

        val question = findViewById<TextSwitcher>(R.id.question)
        question.setFactory {
            val textView = TextView(this@MainActivity)
            textView.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            textView.textSize = 20f
            textView.setTextColor(Color.BLACK)
            textView
        }
        question.setText(questions[index])
        ans.setText(answers[index])

        ans.visibility = View.INVISIBLE //keeps size just cant see it.

        val nextopt = findViewById<TextView>(R.id.nextoptions)
        nextopt.visibility = View.INVISIBLE //keeps size just cant see it.

        val timeshow = findViewById<TextView>(R.id.timer)
        timeshow.visibility = View.INVISIBLE //keeps size just cant see it.






        opt1.setFactory {
            val textView = TextView(this@MainActivity)
            textView.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            textView.textSize = 20f
            textView.setTextColor(Color.BLACK)
            textView
        }
        opt1.setText(options[1])



        opt2.setFactory {
            val textView = TextView(this@MainActivity)
            textView.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            textView.textSize = 20f
            textView.setTextColor(Color.BLACK)
            textView
        }
        opt2.setText(options[2])



        opt3.setFactory {
            val textView = TextView(this@MainActivity)
            textView.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            textView.textSize = 20f
            textView.setTextColor(Color.BLACK)
            textView
        }
        opt3.setText(options[3])


        opt4.setFactory {
            val textView = TextView(this@MainActivity)
            textView.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL
            textView.textSize = 20f
            textView.setTextColor(Color.BLACK)
            textView
        }
        opt4.setText(options[4])












        opt1.setOnClickListener {

            val timer = MyCounter(3000, 300)
            timer.start()
            val ta  = ans.text.toString()
            if( ta.equals("1") )
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt1.setBackgroundColor(getColor(R.color.green))
                }
            }
            else{
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt1.setBackgroundColor(getColor(R.color.red))
                }
                if( ta.equals("2") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt2.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("3") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt3.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("4") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt4.setBackgroundColor(getColor(R.color.green))
                    }
                }

            }
        }


        opt2.setOnClickListener {

            val timer = MyCounter(3000, 300)
            timer.start()
            val ta  = ans.text.toString()
            if( ta.equals("2") )
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt2.setBackgroundColor(getColor(R.color.green))
                }
            }
            else{
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt2.setBackgroundColor(getColor(R.color.red))
                }
                if( ta.equals("1") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt1.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("3") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt3.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("4") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt4.setBackgroundColor(getColor(R.color.green))
                    }
                }

            }
        }









        opt3.setOnClickListener {

            val timer = MyCounter(3000, 300)
            timer.start()
            val ta  = ans.text.toString()
            if( ta.equals("3") )
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt3.setBackgroundColor(getColor(R.color.green))
                }
            }
            else{
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt3.setBackgroundColor(getColor(R.color.red))
                }
                if( ta.equals("1") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt1.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("2") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt2.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("4") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt4.setBackgroundColor(getColor(R.color.green))
                    }
                }

            }
        }




        opt4.setOnClickListener {

            val timer = MyCounter(3000, 300)
            timer.start()
            val ta  = ans.text.toString()
            if( ta.equals("4") )
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt4.setBackgroundColor(getColor(R.color.green))
                }
            }
            else{
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    opt4.setBackgroundColor(getColor(R.color.red))
                }
                if( ta.equals("1") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt1.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("2") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt2.setBackgroundColor(getColor(R.color.green))
                    }
                }

                if( ta.equals("3") )
                {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        opt3.setBackgroundColor(getColor(R.color.green))
                    }
                }

            }
        }


























    }

    inner class MyCounter(millisInFuture: Long, countDownInterval: Long) : CountDownTimer(millisInFuture, countDownInterval) {

        val question = findViewById<TextSwitcher>(R.id.question)
        val ans = findViewById<TextView>(R.id.answer)
        val nextopt = findViewById<TextView>(R.id.nextoptions)

        val timeshow = findViewById<TextView>(R.id.timer)


        override fun onFinish() {
            //   println("Timer Completed.")

            //   timeshow.text = "Timer Completed."
            index = if (index + 1 < questions.size) index + 1 else index + 1
            question.setText(questions[index])
            ans.setText(answers[index])
            val optseq  = nextopt.text.toString()
            val optseqi: Int = optseq.toInt()
            val optseqnext: Int = optseqi + 4
            val optseqnexts = optseqnext.toString()
            nextopt.setText(optseqnexts)

            val opt1 = findViewById<TextSwitcher>(R.id.option1)
            val opt2 = findViewById<TextSwitcher>(R.id.option2)
            val opt3 = findViewById<TextSwitcher>(R.id.option3)
            val opt4 = findViewById<TextSwitcher>(R.id.option4)

            opt1.setText(options[optseqnext + 1])
            opt2.setText(options[optseqnext + 2])
            opt3.setText(options[optseqnext + 3])
            opt4.setText(options[optseqnext + 4])

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                opt1.setBackgroundColor(getColor(R.color.white))
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                opt2.setBackgroundColor(getColor(R.color.white))
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                opt3.setBackgroundColor(getColor(R.color.white))
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                opt4.setBackgroundColor(getColor(R.color.white))
            }


        }

        override fun onTick(millisUntilFinished: Long) {
            timeshow.textSize = 50f

            timeshow.text = (millisUntilFinished / 1000).toString() + ""
            println("Timer  : " + millisUntilFinished / 1000)
        }
    }
}
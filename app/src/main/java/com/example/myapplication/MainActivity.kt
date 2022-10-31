package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Viewer {
    private val controller = Controller(this)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.oneBtn.setOnClickListener {
            controller.onOnePressed()
        }

        binding.twoBtn.setOnClickListener {
            controller.onTwoPressed()
        }

        binding.threeBtn.setOnClickListener {
            controller.onThreePressed()
        }
        binding.fourBtn.setOnClickListener {
            controller.onFourPressed()
        }
        binding.fiveBtn.setOnClickListener {
            controller.onFivePressed()
        }
        binding.sixBtn.setOnClickListener {
            controller.onSixPressed()

        }
        binding.sevenBtn.setOnClickListener {
            controller.onSevenPressed()
        }
        binding.eightBtn.setOnClickListener {
            controller.onEightPressed()

        }
        binding.nineBtn.setOnClickListener {
            controller.onNinePressed()
        }
        binding.zeroBtn.setOnClickListener {
            controller.onZeroPressed()
        }
        binding.divideBtn.setOnClickListener {
            controller.onDividePressed()
        }
        binding.minusBtn.setOnClickListener {
            controller.onMinusPressed()
        }
        binding.multiplyBtn.setOnClickListener {
            controller.onMultiplyPressed()
        }
        binding.openBracketBtn.setOnClickListener {
            controller.onOpenBracketPressed()
        }
        binding.closeBracketBtn.setOnClickListener {
            controller.onCloseBracketPressed()
        }



        binding.plusBtn.setOnClickListener {
            controller.onPlusPressed()
        }
        binding.equalBtn.setOnClickListener {
            controller.onEqualPressed()
        }
        binding.backButton.setOnClickListener {
            controller.onBackPressed()
        }
        binding.clearBtn.setOnClickListener {
            controller.onClearPressed()
        }
        binding.dotBtn.setOnClickListener {
            controller.onDotPressed()
        }
    }


    override fun updateInput(value: String) {
        binding.tvInput.text = value
    }

    override fun updateResult(value: String) {
        binding.tvResult.text = value

    }


}
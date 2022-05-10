package com.example.potatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.CompoundButton




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val HatImage : ImageView = findViewById(R.id.HatPic);
        val EyebrowsImage : ImageView = findViewById(R.id.EyebrowsPic);
        val EyesImage : ImageView = findViewById(R.id.EyesPic);
        val GlassesImage : ImageView = findViewById(R.id.GlassesPic);
        val NoseImage : ImageView = findViewById(R.id.NosePic);
        val MouthImage : ImageView = findViewById(R.id.MouthPic);
        val MustacheImage : ImageView = findViewById(R.id.MustachePic);
        val EarsImage : ImageView = findViewById(R.id.EarsPic);
        val ArmsImage : ImageView = findViewById(R.id.ArmsPic);
        val ShoesImage : ImageView = findViewById(R.id.ShoesPic);

        HatImage.setVisibility(View.INVISIBLE);
        EyebrowsImage.setVisibility(View.INVISIBLE);
        EyesImage.setVisibility(View.INVISIBLE);
        GlassesImage.setVisibility(View.INVISIBLE);
        NoseImage.setVisibility(View.INVISIBLE);
        MouthImage.setVisibility(View.INVISIBLE);
        MustacheImage.setVisibility(View.INVISIBLE);
        EarsImage.setVisibility(View.INVISIBLE);
        ArmsImage.setVisibility(View.INVISIBLE);
        ShoesImage.setVisibility(View.INVISIBLE);


        val HatCheck : CheckBox = findViewById(R.id.hatCheck);
        val EyebrowsCheck : CheckBox = findViewById(R.id.EyeBrowsCheck);
        val EyesCheck : CheckBox = findViewById(R.id.EyesCheck);
        val GlassesCheck : CheckBox = findViewById(R.id.GlassesCheck);
        val NoseCheck : CheckBox = findViewById(R.id.NoseCheck);
        val MouthCheck : CheckBox = findViewById(R.id.MouthCheck);
        val MustacheCheck : CheckBox = findViewById(R.id.MustacheCheck);
        val EarsCheck : CheckBox = findViewById(R.id.EarsCheck);
        val ArmsCheck : CheckBox = findViewById(R.id.ArmsCheck);
        val ShoesCheck : CheckBox = findViewById(R.id.ShoesCheck);

        HatCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                HatImage.setVisibility(View.VISIBLE)
            } else {
                HatImage.setVisibility(View.INVISIBLE)
            }
        })

        EyebrowsCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                EyebrowsImage.setVisibility(View.VISIBLE)
            }
            else{
                EyebrowsImage.setVisibility(View.INVISIBLE)
            }

        })

        EyesCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                EyesImage.setVisibility(View.VISIBLE)
            }
            else{
                EyesImage.setVisibility(View.INVISIBLE)
            }

        })

        GlassesCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                GlassesImage.setVisibility(View.VISIBLE)
            }
            else{
                GlassesImage.setVisibility(View.INVISIBLE)
            }
        })

        NoseCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                NoseImage.setVisibility(View.VISIBLE)
            }
            else{
                NoseImage.setVisibility(View.INVISIBLE)
            }

        })

        MouthCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                MouthImage.setVisibility(View.VISIBLE)
            }
            else{
                MouthImage.setVisibility(View.INVISIBLE)
            }

        })

        MustacheCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                MustacheImage.setVisibility(View.VISIBLE)
            }
            else{
                MustacheImage.setVisibility(View.INVISIBLE)
            }

        })

        EarsCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                EarsImage.setVisibility(View.VISIBLE)
            }
            else{
                EarsImage.setVisibility(View.INVISIBLE)
            }

        })

        ArmsCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                ArmsImage.setVisibility(View.VISIBLE)
            }
            else{
                ArmsImage.setVisibility(View.INVISIBLE)
            }

        })

        ShoesCheck.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener{ buttonView, isChecked ->
            if (isChecked){
                ShoesImage.setVisibility(View.VISIBLE)
            }
            else{
                ShoesImage.setVisibility(View.INVISIBLE)
            }

        })

    }
}

package com.example.susanne.susannebinkhorst_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView Eyes, Nose, Ears, Shoes, Mustache, Arms, Glasses, Mouth, Eyebrows, Hat;

    // Create the app and the global variables for the images.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Eyes = findViewById(R.id.Eyes);
        Nose = findViewById(R.id.Nose);
        Ears = findViewById(R.id.Ears);
        Eyebrows = findViewById(R.id.Eyebrows);
        Glasses = findViewById(R.id.Glasses);
        Shoes = findViewById(R.id.Shoes);
        Mouth = findViewById(R.id.Mouth);
        Hat = findViewById(R.id.Hat);
        Arms = findViewById(R.id.Arms);
        Mustache = findViewById(R.id.Mustache);
    }

    // Save whether the images are visible or invisible in the current state.
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("eyes_im", Eyes.getVisibility());
        outState.putInt("ears_im", Ears.getVisibility());
        outState.putInt("nose_im", Nose.getVisibility());
        outState.putInt("mouth_im", Mouth.getVisibility());
        outState.putInt("eyebrows_im", Eyebrows.getVisibility());
        outState.putInt("hat_im", Hat.getVisibility());
        outState.putInt("shoes_im", Shoes.getVisibility());
        outState.putInt("mustache_im", Mustache.getVisibility());
        outState.putInt("arms_im", Arms.getVisibility());
        outState.putInt("glasses_im", Glasses.getVisibility());
    }

    // Restore the invisible and visible images to current state.
    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Eyes.setVisibility(inState.getInt("eyes_im"));
        Ears.setVisibility(inState.getInt("ears_im"));
        Nose.setVisibility(inState.getInt("nose_im"));
        Mouth.setVisibility(inState.getInt("mouth_im"));
        Eyebrows.setVisibility(inState.getInt("eyebrows_im"));
        Mustache.setVisibility(inState.getInt("mustache_im"));
        Shoes.setVisibility(inState.getInt("shoes_im"));
        Hat.setVisibility(inState.getInt("hat_im"));
        Glasses.setVisibility(inState.getInt("glasses_im"));
        Arms.setVisibility(inState.getInt("arms_im"));
    }


    // Checks which checkbox is checked and make the belonging image visible or invisible.
    public void checkboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.eyes:
                if (checked)
                    Eyes.setVisibility(View.VISIBLE);
                else
                    Eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.nose:
                if (checked)
                    Nose.setVisibility(View.VISIBLE);
                else
                    Nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.ears:
                if (checked)
                    Ears.setVisibility(View.VISIBLE);
                else
                    Ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows:
                if (checked)
                    Eyebrows.setVisibility(View.VISIBLE);
                else
                    Eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoes:
                if (checked)
                    Shoes.setVisibility(View.VISIBLE);
                else
                    Shoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.mustache:
                if (checked)
                    Mustache.setVisibility(View.VISIBLE);
                else
                    Mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.hat:
                if (checked)
                    Hat.setVisibility(View.VISIBLE);
                else
                    Hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.arms:
                if (checked)
                    Arms.setVisibility(View.VISIBLE);
                else
                    Arms.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth:
                if (checked)
                    Mouth.setVisibility(View.VISIBLE);
                else
                    Mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses:
                if (checked)
                    Glasses.setVisibility(View.VISIBLE);
                else
                    Glasses.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
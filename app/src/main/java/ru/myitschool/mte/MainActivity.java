package ru.myitschool.mte;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import ru.myitschool.mte.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    int clickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.content.ibCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickCounter++;
                switch (clickCounter % 3) {
                    case 1:
                        ((ImageFilterButton) view).setImageResource(R.drawable.car2);
                        break;
                    case 2: ((ImageFilterButton) view).setImageResource(R.drawable.car3);
                        break;
                    case 0: ((ImageFilterButton) view).setImageResource(R.drawable.car1);
                }
            }
        });
    }
}

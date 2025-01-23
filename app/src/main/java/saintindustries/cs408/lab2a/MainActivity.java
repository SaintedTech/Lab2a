package saintindustries.cs408.lab2a;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

import saintindustries.cs408.lab2a.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
    public void OnClickHelp(View v){
        Random random = new Random();
        int randomNumber;
        randomNumber = random.nextInt(21);
        String[] messages = getResources().getStringArray(R.array.helpMessages);

        binding.message.setText(messages[randomNumber]);


    }
}


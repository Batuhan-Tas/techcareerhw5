package com.example.techcareerandroiddeveloperodev5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewResult;
    MaterialButton buttonIslemTopla,buttonIslemEsit,buttonIslemCikar,buttonIslemBol,buttonIslemCarp,
            buttonOndalik,buttonSayi0,buttonSayi1,buttonSayi2,buttonSayi3,buttonSayi4,buttonSayi5,buttonSayi6,
            buttonSayi7,buttonSayi8,buttonSayi9,buttonPercent,buttonChange,buttonClear;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.textViewResult);

        assignButtons(buttonChange,R.id.buttonChange);
        assignButtons(buttonClear,R.id.buttonClear);
        assignButtons(buttonIslemBol,R.id.buttonIslemBol);
        assignButtons(buttonOndalik,R.id.buttonOndalik);
        assignButtons(buttonIslemCikar,R.id.buttonIslemCikar);
        assignButtons(buttonIslemCarp,R.id.buttonIslemCarp);
        assignButtons(buttonIslemEsit,R.id.buttonIslemEsit);
        assignButtons(buttonIslemTopla,R.id.buttonIslemTopla);
        assignButtons(buttonPercent,R.id.buttonPercent);
        assignButtons(buttonSayi1,R.id.buttonSayi1);
        assignButtons(buttonSayi2,R.id.buttonSayi2);
        assignButtons(buttonSayi3,R.id.buttonSayi3);
        assignButtons(buttonSayi4,R.id.buttonSayi4);
        assignButtons(buttonSayi5,R.id.buttonSayi5);
        assignButtons(buttonSayi6,R.id.buttonSayi6);
        assignButtons(buttonSayi7,R.id.buttonSayi7);
        assignButtons(buttonSayi8,R.id.buttonSayi8);
        assignButtons(buttonSayi9,R.id.buttonSayi9);
        assignButtons(buttonSayi0,R.id.buttonSayi0);



    }

    void assignButtons(MaterialButton buttonAssign,int id){
        buttonAssign = findViewById(id);
        buttonAssign.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        MaterialButton clickedButton = (MaterialButton) view;
        String buttonText = clickedButton.getText().toString();
        String data = textViewResult.getText().toString();


        if(buttonText.equals("C")){
            textViewResult.setText("");
            return;
        }else if(buttonText.equals("=")){
            int result = 0;
            String[] numbers = data.split("[+]");
            for(int i=0;i<numbers.length;i++){
                result = result+Integer.parseInt(numbers[i]);
            }
            String shown = String.valueOf(result);
            textViewResult.setText(shown);
        }else{
            data = data + buttonText;
            textViewResult.setText(data);
        }





    }
}
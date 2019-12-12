package com.example.a13androidapptoancau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText editText1, editText2, editText3;
    Button butTon1;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        butTon1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String hoTen = editText1.getText().toString();
                String gmail = editText2.getText().toString();
                String soDienThoai = editText3.getText().toString();
                String a = getResources().getString(R.string.text_ChaoBan);
                String b = getResources().getString(R.string.text_email);
                String c = getResources().getString(R.string.text_soDienThoai);
                textView2.setText(a + ": " + hoTen + "\n" + b + ": " + gmail + "\n" + c + ": " + soDienThoai);
            }
        });
    }
    private void anhXa()
    {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        butTon1 = findViewById(R.id.butTon1);
        textView2 = findViewById(R.id.textView2);
    }
}

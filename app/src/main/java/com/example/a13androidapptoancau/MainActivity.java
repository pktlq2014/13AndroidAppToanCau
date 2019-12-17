package com.example.a13androidapptoancau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity
{
    EditText editText1, editText2, editText3;
    Button butTon1;
    ImageView imageView1, imageView2;
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
       //         textView2.setText(a + ": " + hoTen + "\n" + b + ": " + gmail + "\n" + c + ": " + soDienThoai);
                textView2.setText
                        (
                                getResources().getString(R.string.text_ChaoBan) + " " + hoTen + "\n"
                                + getResources().getString(R.string.text_email) + " " + gmail + "\n"
                                + getResources().getString(R.string.text_soDienThoai) + " " + soDienThoai + "\n"
                        );
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ngonNgu("vi");
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ngonNgu("en");
            }
        });
    }
    public void ngonNgu(String ngonNgu1)
    {
        Locale locale = new Locale(ngonNgu1);
        Configuration configuration = new Configuration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration
                (
                        configuration,
                        getBaseContext().getResources().getDisplayMetrics()
                );
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }
    private void anhXa()
    {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        butTon1 = findViewById(R.id.butTon1);
        textView2 = findViewById(R.id.textView2);
    }
}

package com.blank.root.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.blank.root.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private String text;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        text = "Hello from SimpleTextActivity";
        binding.setText(text);

        editText = (EditText) findViewById(R.id.simple_edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

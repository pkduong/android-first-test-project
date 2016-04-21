package com.example.duongpk.helloworldempty;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView tvMain = (TextView)findViewById(R.id.tvMain);
        //tvMain.setTextSize(12);

        Button btnSetText;
        btnSetText = (Button) findViewById(R.id.btnSetText);
        btnSetText.setOnClickListener(this);

        Button btnSetSize;
        btnSetSize = (Button) findViewById(R.id.btnSetSize);
        btnSetSize.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText editText1;
        editText1 = (EditText) findViewById(R.id.txtText);

        TextView mainTextView = (TextView)findViewById(R.id.tvMain);
        mainTextView.setText(editText1.getText().toString());
    }

}

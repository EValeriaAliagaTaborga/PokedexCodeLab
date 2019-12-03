package bo.upb.programacion3.codelabpokedex.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bo.upb.programacion3.codelabpokedex.R;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView info;
    private Button logBtn;
    private int atemptcont = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        info = (TextView)findViewById(R.id.lblatempts);
        logBtn = (Button)findViewById(R.id.btnlogin);

        info.setText("Number of attempts remaining: 5");

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(username.getText().toString(), password.getText().toString());
            }
        });
    }

    private void validate(String username, String password){
        if(username.equals("Ash") && password.equals("pikapika")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("name","Ash");
            startActivity(intent);
        } else if(username.equals("Misty") && password.equals("toge1")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("name","Misty");
            startActivity(intent);
        } else if(username.equals("Brock") && password.equals("rock2")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("name","Brock");
            startActivity(intent);
        } else if(username.equals("James") && password.equals("paralibraralmundodeladebastacion")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("name","James");
            startActivity(intent);
        } else if(username.equals("Jessie") && password.equals("blissey1")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("name","Jessie");
            startActivity(intent);
        }  else {
            atemptcont--;

            info.setText("Number of attempts remaining: " + String.valueOf(atemptcont));

            if(atemptcont == 0){
                logBtn.setEnabled(false);
            }
        }
    }
}

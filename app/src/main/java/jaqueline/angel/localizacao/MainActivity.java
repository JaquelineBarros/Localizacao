package jaqueline.angel.localizacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgPessoa;
    ImageView imgLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa = (ImageView) findViewById(R.id.img_pessoa);
        imgLocal = (ImageView) findViewById(R.id.img_local);
    }

    public void pessoaClickAct1(View v) {

        Intent i = new Intent(MainActivity.this, PessoaActivity.class);
        startActivity(i);
    }

    public void localClickAct1(View v) {

        Intent i = new Intent(MainActivity.this, LocalActivity.class);
        startActivity(i);
       }
    }


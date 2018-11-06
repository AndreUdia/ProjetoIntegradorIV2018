package quatro.integrador.projeto.com.projetointegradoriv2018.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import quatro.integrador.projeto.com.projetointegradoriv2018.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);


    }

    private void mudaTela() {
        Intent i = new Intent(MainActivity.this, DadosCadastrais.class);
        startActivity(i);

    }

    public void logar(View view) {
        mudaTela();
    }
}

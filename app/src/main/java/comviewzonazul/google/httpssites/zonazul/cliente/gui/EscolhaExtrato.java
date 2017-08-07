package comviewzonazul.google.httpssites.zonazul.cliente.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comviewzonazul.google.httpssites.zonazul.R;

public class EscolhaExtrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_extrato);
    }

    public void onBackPressed(){
        Intent intent = new Intent();
        intent.setClass(this, PrincipalClienteActivity.class);
        startActivity(intent);
        finish();
    }
}

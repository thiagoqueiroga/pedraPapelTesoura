package com.example.pedrapapel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void pedraSelecionada(View view) {
        escolhaUsuario("pedra");
    }

    public void papelSelecionado(View view) {
        escolhaUsuario("papel");
    }

    public void tesouraSelecionada(View view) {
        escolhaUsuario("tesoura");
    }

    public void escolhaUsuario(String escolha) {
        ImageView imgResult = findViewById(R.id.imgResult);
        String[] opcaoApp = {"pedra", "papel", "tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcaoApp[numero];

        switch (numero) {
            case 0:
                imgResult.setImageResource(R.drawable.pedra);
                escolhaApp = "pedra";
                break;
            case 1:
                imgResult.setImageResource(R.drawable.papel);
                escolhaApp = "papel";
                break;
            case 2:
                imgResult.setImageResource(R.drawable.tesoura);
                escolhaApp = "tesoura";
                break;

        }
        TextView resultado = findViewById(R.id.result);
        switch (escolha) {
            case "pedra":
                switch (escolhaApp) {
                    case "pedra":
                        resultado.setText("Empatou ( ͡❛  ͟ʖ ͡❛)\uD83D\uDC4C");
                        break;
                    case "papel":
                        resultado.setText("Você Perdeu. ¯\\_( ͡❛ ͜ʖ ͡❛)_/¯");
                        break;
                    case "tesoura":
                        resultado.setText("Você Ganhou \uD83D\uDD95( ͡❛ ෴ ͡❛) Sorte!!");
                }
            break;
            case "papel":
                switch (escolhaApp) {
                    case "pedra":
                        resultado.setText("Você Ganhou \uD83D\uDD95( ͡❛ ෴ ͡❛) Sorte!!");
                        break;
                    case "papel":
                        resultado.setText("Empatou ( ͡❛  ͟ʖ ͡❛)\uD83D\uDC4C");
                        break;
                    case "tesoura":
                        resultado.setText("Você Perdeu. ¯\\_( ͡❛ ͜ʖ ͡❛)_/¯");
                        break;
                }
            break;
            case "tesoura":
                switch (escolhaApp) {
                    case "pedra":
                        resultado.setText("Você Perdeu. ¯\\_( ͡❛ ͜ʖ ͡❛)_/¯");
                        break;
                    case "papel":
                        resultado.setText("Você Ganhou \uD83D\uDD95( ͡❛ ෴ ͡❛) Sorte!!");
                        break;
                    case "tesoura":
                        resultado.setText("Empatou ( ͡❛  ͟ʖ ͡❛)\uD83D\uDC4C");
                        break;
                }
            break;


        }
    }


}

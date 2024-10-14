package br.ulbra.jokenpo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int vitorias = 0;
    private int derrotas = 0;
    private int empates = 0;

    private TextView txtPlacar;
    private ImageView imageresultado;
    private TextView txtResultado;

    private static final String[] OPCOES = {"Pedra", "Papel", "Tesoura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView pedra = findViewById(R.id.imageViewPedra);
        ImageView papel = findViewById(R.id.imageViewPapel);
        ImageView tesoura = findViewById(R.id.imageViewTesoura);
        txtPlacar = findViewById(R.id.txtPlacar);
        imageresultado = findViewById(R.id.imageResultado);
        txtResultado = findViewById(R.id.txtResultado);
        Button reiniciar = findViewById(R.id.btnReiniciar);

        pedra.setOnClickListener(view -> opcaoSelecionada("Pedra"));
        papel.setOnClickListener(view -> opcaoSelecionada("Papel"));
        tesoura.setOnClickListener(view -> opcaoSelecionada("Tesoura"));

        reiniciar.setOnClickListener(this::reiniciarJogo);

        atualizarPlacar();
    }

    public void opcaoSelecionada(String opcaoSelecionada) {
        String opcaoApp = OPCOES[new Random().nextInt(OPCOES.length)];
        atualizarImagemResultado(opcaoApp);

        String resultado = verificarResultado(opcaoSelecionada, opcaoApp);
        txtResultado.setText(resultado);

        atualizarPlacar();

        Toast.makeText(this, "Você escolheu: " + opcaoSelecionada, Toast.LENGTH_SHORT).show();
    }

    private String verificarResultado(String opcaoJogador, String opcaoApp) {
        if (opcaoApp.equals(opcaoJogador)) {
            empates++;
            return "Empate!";
        } else if (ganhouDoJogador(opcaoApp, opcaoJogador)) {
            derrotas++;
            return "Você perdeu a rodada!";
        } else {
            vitorias++;
            return "Vitória";
        }
    }

    private boolean ganhouDoJogador(String opcaoApp, String opcaoJogador) {
        return (opcaoApp.equals("Tesoura") && opcaoJogador.equals("Papel")) ||
                (opcaoApp.equals("Papel") && opcaoJogador.equals("Pedra")) ||
                (opcaoApp.equals("Pedra") && opcaoJogador.equals("Tesoura"));
    }

    private void atualizarImagemResultado(String opcaoApp) {
        int imageResource;
        switch (opcaoApp) {
            case "Pedra":
                imageResource = R.drawable.pedra;
                break;
            case "Papel":
                imageResource = R.drawable.papel;
                break;
            case "Tesoura":
                imageResource = R.drawable.tesoura;
                break;
            default:
                imageResource = R.drawable.padrao;
        }
        imageresultado.setImageResource(imageResource);
    }

    private void atualizarPlacar() {
        String placar = String.format(" Vitórias: %d \n Derrotas: %d \n Empates: %d", vitorias, derrotas, empates);
        txtPlacar.setText(placar);
    }

    public void reiniciarJogo(View view) {
        vitorias = 0;
        derrotas = 0;
        empates = 0;

        imageresultado.setImageResource(R.drawable.padrao);
        txtResultado.setText("");
        atualizarPlacar();
    }
}

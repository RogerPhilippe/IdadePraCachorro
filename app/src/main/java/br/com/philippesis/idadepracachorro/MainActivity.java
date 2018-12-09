package br.com.philippesis.idadepracachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idadeCachorro;
    private Button btnConverterIdade;
    private TextView idadeConvertida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeCachorro = (EditText) findViewById(R.id.idInputNumber);
        btnConverterIdade = (Button) findViewById(R.id.idBtnDescobrirIdade);
        idadeConvertida = (TextView) findViewById(R.id.idIdadeConvertida);

        btnConverterIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String entrada = idadeCachorro.getText().toString();

                if ( entrada.isEmpty() ) {
                    idadeConvertida.setText("Digite uma idade para conversão!");
                } else {

                    idadeConvertida.setText("A idade do seu cachorro em anos humanos é: "+Integer.parseInt(entrada)*7+" anos");

                }

            }
        });

    }
}

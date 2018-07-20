package com.example.mateu.api_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String cep = "31872190";

        EnderecoService service = new RetrofitConfig().getEnderecoService();

        Call<Endereco> enderecoCall = service.getEndereco(cep);

        // fazendo a requisição de forma assíncrona
        enderecoCall.enqueue(new Callback<Endereco>() {
            @Override
            public void onResponse(Call<Endereco> call, Response<Endereco> response) {
                Endereco endereco = response.body();

                Toast toast = Toast.makeText(getApplicationContext(), endereco.getLocalidade(), Toast.LENGTH_LONG);
                toast.show();
                // Manipulação do endereço recebido
            }

            @Override
            public void onFailure(Call<Endereco> call, Throwable t) {
                // Tratamento de eventual erro de requisição
            }
        });

    }
}

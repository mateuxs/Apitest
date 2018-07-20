package com.example.mateu.api_test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {
    // Objeto que fará o acesso a API do serviço
    private final Retrofit retrofit;

    public RetrofitConfig() {

        // configura o retrofit para um determinado serviço
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public EnderecoService getEnderecoService() {
        return this.retrofit.create(EnderecoService.class);
    }

}

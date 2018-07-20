package com.example.mateu.api_test;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface EnderecoService {

    @GET("ws/{cep}/json")
    Call<Endereco> getEndereco(@Path("cep") String cep);

    @GET("ws/{estado}/{cidade}/{rua}/json")
    Call<List<Endereco>> getCEP(@Path("estado") String estado,
                                       @Path("cidade") String cidade,
                                       @Path("rua") String rua);
}

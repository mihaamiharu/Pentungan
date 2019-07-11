package com.pentungan.kentungan.Rest;

import com.pentungan.kentungan.Model.Parsing.GetLogin;
import com.pentungan.kentungan.Model.Pesan;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface RetrofitInterface {
    @GET("_getLogin.php")
    Call<GetLogin> getLogin(
            @QueryMap Map<String, String> params
    );

    @GET("_registration.php")
    Call<Pesan> registration(
            @Field("username") String username,
            @Field("password") String password
    );
}

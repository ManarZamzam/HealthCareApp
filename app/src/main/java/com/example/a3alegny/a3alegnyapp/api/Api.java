package com.example.a3alegny.a3alegnyapp.api;

/**import com.example.shafntry.loginapi.models.DefaultResponse;
import com.example.shafntry.loginapi.models.LoginResponse;
import com.example.shafntry.loginapi.models.UsersResponse;
import com.example.shafntry.loginapi.models.specialitiesResponse;**/

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {


  /**  @FormUrlEncoded
    @POST("createuser")
    Call<DefaultResponse> createUser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("name") String name,
            @Field("school") String school
    );


    @FormUrlEncoded
    @POST("login.php")
    Call<LoginResponse> userLogin(
            @Field("phone") String phone,
            @Field("password") String password
    );




    @GET("speciality.php")
    Call<DefaultResponse>getspeciality(
            @Field("Speciality_ID") String Speciality_ID,
            @Field("Name") String Name,
            @Field("Name_Arabic") String Name_Arabic
    );


    @GET("allusers")
    Call<UsersResponse> getUsers();

    @GET("speciality.php")
    Call<specialitiesResponse> getSpecialities();





    @FormUrlEncoded
    @PUT("updateuser/{id}")
    Call<LoginResponse> updateUser(
            @Path("id") int id,
            @Field("email") String email,
            @Field("name") String name,
            @Field("school") String school
    );

    @FormUrlEncoded
    @PUT("updatepassword")
    Call<DefaultResponse> updatePassword(
            @Field("currentpassword") String currentpassword,
            @Field("newpassword") String newpassword,
            @Field("email") String email
    );

    @DELETE("deleteuser/{id}")
    Call<DefaultResponse> deleteUser(@Path("id") int id);
**/
}

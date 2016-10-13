package recycle.highthing.com.retrofttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        IRequest iRequest = retrofit.create(IRequest.class);
        retrofit2.Call<Object> cityCall = iRequest.getCity("小王子", "", 0, 3);
        cityCall.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(retrofit2.Call<Object> call, Response<Object> response) {

            }

            @Override
            public void onFailure(retrofit2.Call<Object> call, Throwable t) {

            }
        });
    }
}

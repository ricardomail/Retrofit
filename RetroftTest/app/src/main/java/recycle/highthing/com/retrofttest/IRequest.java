package recycle.highthing.com.retrofttest;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;


/**
 * Created by Think on 2016/9/12.
 */
public interface IRequest {
    @GET("book/search")
    Call<Object> getCity(@Query("q") String name,
                         @Query("tag") String tag, @Query("start") int start,
                         @Query("count") int count);
    @Multipart()
    @POST("api/files")
    Call<String> upLoadFile(
            @Part("file\";filename=\"test.jpg" )RequestBody  photo
            );
}

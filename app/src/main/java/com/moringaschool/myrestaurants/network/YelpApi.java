package com.moringaschool.myrestaurants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
//define is the HTTP request method like GET, POST, PUT, DELETE,
    //Additionally, you need to add the relative endpoint URL as a String parameter to the annotation, e.g. @GET("businesses/search"). In most cases, you'll pass only a relative URL, and not a full URL (like https://api.yelp.com/v3/businesses/search).
// This has the advantage that Retrofit only has to ask for the base URL once.
    //To add query parameters to our request, we pass them as parameters into our interface method
// annotated with @Query(). The Query annotation accepts a string which should be the name of the query.
// We'll be passing in two query parameters, a location and term. You can find out what other parameters this endpoint can have from the Yelp documentation
    @GET("businesses/search")
    Call<YelpBusinessesSearchResponse> getRestaurants(
            @Query("location") String location,
            @Query("term") String term
    );
}
package com.pickledego.weatherdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{
    private static String TAG = "MainActivity";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button zipSubmit = (Button) findViewById(R.id.main_zipSubmit);
        zipSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Clicked Button");
                String zipCode = ((EditText)findViewById(R.id.main_zipCode)).getText().toString();
                callWeatherAPI(zipCode);
            }
        });
    }

    private void callWeatherAPI(String zipCode) {
        // Get zip code from editText.


        // Make API call.
        
        String jsonData = "{\"forecastHourlyList\":[{\"chancePrecip\":null,\"dateTime\":1282122000000,\"desc\":\n" +
                "\"Thunderstorms\",\"dewPoint\":null,\"feelsLike\":null,\"feelsLikeLabel\":null,\"humidity\":null,\n" +
                "\"icon\":\"cond006\",\"skyCover\":null,\"temperature\":73,\"windDir\":null,\"windSpeed\":null}, \n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "{\"chancePrecip\":null,\"dateTime\":1282680000000,\"desc\":\"Partly Cloudy\",\"dewPoint\":null,\n" +
                "\"feelsLike\":null,\"feelsLikeLabel\":null,\"humidity\":null,\"icon\":\"cond002\",\"skyCover\":null,\n" +
                "\"temperature\":76,\"windDir\":null,\"windSpeed\":null}],\"temperatureUnits\":\"°F\",\n" +
                "\"windUnits\":\"mph\"}";
        
        // Parse Data.

        // Display data in a Toast.
        Toast.makeText(getBaseContext(), "This is great " + zipCode, Toast.LENGTH_LONG).show();

        // Format results in a new Activity.
    }
}

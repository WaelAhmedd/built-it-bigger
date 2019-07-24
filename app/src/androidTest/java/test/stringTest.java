package test;


import android.content.Context;
import android.util.Log;

import androidx.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.EndpointAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.runner.RunWith;

import java.security.AccessControlContext;

import static androidx.test.InstrumentationRegistry.getContext;

import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class stringTest   {



    private static final String LOG_TAG = "NonEmptyStringTest";

    @SuppressWarnings("unchecked")
    public void test() {

        // Testing that Async task successfully retrieves a non-empty string
        // You can test this from androidTest -> Run 'All Tests'
        Log.v("NonEmptyStringTest", "Running NonEmptyStringTest test");
        String result = null;

      EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            Log.d(LOG_TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }


}




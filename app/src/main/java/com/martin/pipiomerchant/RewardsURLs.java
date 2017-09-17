package com.martin.pipiomerchant;

/**
 * Created by Martin on 9/14/2017.
 */

public class RewardsURLs {
    public static final String SERVER_URL = "http://10.0.2.2:80/";
    public static final String POST_DIRECTORY = "rewardscard_php/";
    public static final String ADD_MEMBERS = "customer_register.php";

    public static String GetUrl(String url) {
        return SERVER_URL + POST_DIRECTORY + url;
    }
}

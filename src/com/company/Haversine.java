package com.company;

public class Haversine {

    static double haversine(double lat1, double lon1,
                            double lat2, double lon2)
    {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }

    // Driver Code
    public static void main(String[] args)
    {
        double lat1 = 12.966418;
        double lon1 = 77.523009;
        double lat2 = 12.970548;
        double lon2 = 77.526442;
        System.out.println(haversine(lat1, lon1, lat2, lon2) + " K.M.");
    }
}
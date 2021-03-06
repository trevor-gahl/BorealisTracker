package com.example.trevor.myapplication;

import android.graphics.Color;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;


import java.net.*;
import java.io.*;
import java.sql.*;


import java.util.ArrayList;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.*;
import com.google.android.gms.maps.model.*;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    public void webCall(){
        ArrayList<String> route = new ArrayList<>();
        try {
            URL url = new URL("http://153.90.202.26/php/dontDelete.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("GET");

            InputStream writer = new BufferedInputStream(connection.getInputStream());
            route.add(writer.toString());
            writer.close();

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                // OK
            } else {
                // Server returned HTTP error code.
            }
        } catch (MalformedURLException e) {
            // ...
        } catch (IOException e) {
            // ...
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        String link = "http://153.90.202.26/php/dontDelete.php";

        mMap = googleMap;
            ArrayList<LatLng> route = new ArrayList<>();
        route.add(new LatLng(34.4910833, -104.2220000));
        route.add(new LatLng(34.4911000, -104.2219667));
        route.add(new LatLng(34.4911833, -104.2219000));
        route.add(new LatLng(34.4911333, -104.2219333));
        route.add(new LatLng(34.4911000, -104.2219500));
        route.add(new LatLng(34.4911167, -104.2219667));
        route.add(new LatLng(34.4910667, -104.2220000));
        route.add(new LatLng(34.4911167, -104.2219667));
        route.add(new LatLng(34.4911000, -104.2219833));
        route.add(new LatLng(34.4911000, -104.2219833));
        route.add(new LatLng(34.4910833, -104.2219667));
        route.add(new LatLng(34.4910833, -104.2219667));
        route.add(new LatLng(34.4910667, -104.2220000));
        route.add(new LatLng(34.4908333, -104.2220500));
        route.add(new LatLng(34.4907333, -104.2221167));
        route.add(new LatLng(34.4906833, -104.2221333));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906167, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2222000));
        route.add(new LatLng(34.4906500, -104.2221333));
        route.add(new LatLng(34.4907167, -104.2222000));
        route.add(new LatLng(34.4906000, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4906667, -104.2221500));
        route.add(new LatLng(34.4906667, -104.2221500));
        route.add(new LatLng(34.4906333, -104.2221833));
        route.add(new LatLng(34.4906333, -104.2221500));
        route.add(new LatLng(34.4906333, -104.2221833));
        route.add(new LatLng(34.4906500, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906167, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906333, -104.2221500));
        route.add(new LatLng(34.4906667, -104.2221500));
        route.add(new LatLng(34.4906333, -104.2221333));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4905833, -104.2221333));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221500));
        route.add(new LatLng(34.4906333, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2221667));
        route.add(new LatLng(34.4906500, -104.2221667));
        route.add(new LatLng(34.4905833, -104.2221667));
        route.add(new LatLng(34.4906333, -104.2221500));
        route.add(new LatLng(34.4906500, -104.2221500));
        route.add(new LatLng(34.4906333, -104.2221333));
        route.add(new LatLng(34.4906333, -104.2221333));
        route.add(new LatLng(34.4906500, -104.2221333));
        route.add(new LatLng(34.4906333, -104.2221833));
        route.add(new LatLng(34.4907667, -104.2221500));
        route.add(new LatLng(34.4907667, -104.2220500));
        route.add(new LatLng(34.4906667, -104.2221500));
        route.add(new LatLng(34.4905833, -104.2221667));
        route.add(new LatLng(34.4906500, -104.2221833));
        route.add(new LatLng(34.4906333, -104.2221667));
        route.add(new LatLng(34.4907000, -104.2221833));
        route.add(new LatLng(34.4906500, -104.2221833));
        route.add(new LatLng(34.4906333, -104.2222000));
        route.add(new LatLng(34.4907667, -104.2220833));
        route.add(new LatLng(34.4907833, -104.2221000));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221167));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907500, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907500, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221167));
        route.add(new LatLng(34.4907500, -104.2221167));
        route.add(new LatLng(34.4907667, -104.2221500));
        route.add(new LatLng(34.4907667, -104.2221167));
        route.add(new LatLng(34.4907500, -104.2221167));
        route.add(new LatLng(34.4907667, -104.2221500));
        route.add(new LatLng(34.4907500, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907833, -104.2221667));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221167));
        route.add(new LatLng(34.4907833, -104.2221667));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907833, -104.2220667));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907500, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221333));
        route.add(new LatLng(34.4907833, -104.2221333));
        route.add(new LatLng(34.4907667, -104.2221667));
        route.add(new LatLng(34.4907833, -104.2221333));
        route.add(new LatLng(34.4910333, -104.2218167));
        route.add(new LatLng(34.4915333, -104.2213667));
        route.add(new LatLng(34.4915333, -104.2213833));
        route.add(new LatLng(34.4915333, -104.2213833));
        route.add(new LatLng(34.4916333, -104.2213833));
        route.add(new LatLng(34.4920000, -104.2211667));
        route.add(new LatLng(34.4924333, -104.2210167));
        route.add(new LatLng(34.4931667, -104.2204833));
        route.add(new LatLng(34.4941833, -104.2197667));
        route.add(new LatLng(34.4953000, -104.2189500));
        route.add(new LatLng(34.4979167, -104.2174167));
        route.add(new LatLng(34.5011333, -104.2153333));
        route.add(new LatLng(34.5019333, -104.2146500));
        route.add(new LatLng(34.5026167, -104.2139333));
        route.add(new LatLng(34.5028667, -104.2129833));
        route.add(new LatLng(34.5032833, -104.2111833));
        route.add(new LatLng(34.5037167, -104.2084167));
        route.add(new LatLng(34.5043667, -104.2048000));
        route.add(new LatLng(34.5046833, -104.2040833));
        route.add(new LatLng(34.5048500, -104.2034167));
        route.add(new LatLng(34.5050500, -104.2028333));
        route.add(new LatLng(34.5066167, -104.2001500));
        route.add(new LatLng(34.5070167, -104.1995500));
        route.add(new LatLng(34.5073833, -104.1988833));
        route.add(new LatLng(34.5076500, -104.1982667));
        route.add(new LatLng(34.5078833, -104.1973667));
        route.add(new LatLng(34.5081167, -104.1965167));
        route.add(new LatLng(34.5086333, -104.1948333));
        route.add(new LatLng(34.5088667, -104.1943167));
        route.add(new LatLng(34.5090667, -104.1936833));
        route.add(new LatLng(34.5093000, -104.1930167));
        route.add(new LatLng(34.5094833, -104.1924167));
        route.add(new LatLng(34.5098500, -104.1914500));
        route.add(new LatLng(34.5100833, -104.1906833));
        route.add(new LatLng(34.5102833, -104.1900000));
        route.add(new LatLng(34.5104500, -104.1895833));
        route.add(new LatLng(34.5107000, -104.1886333));
        route.add(new LatLng(34.5109000, -104.1879333));
        route.add(new LatLng(34.5111333, -104.1868833));
        route.add(new LatLng(34.5113000, -104.1861667));
        route.add(new LatLng(34.5114500, -104.1851333));
        route.add(new LatLng(34.5115500, -104.1841333));
        route.add(new LatLng(34.5116500, -104.1832333));
        route.add(new LatLng(34.5118333, -104.1816500));
        route.add(new LatLng(34.5118333, -104.1812667));
        route.add(new LatLng(34.5118833, -104.1810333));
        route.add(new LatLng(34.5120000, -104.1805500));
        route.add(new LatLng(34.5120833, -104.1801500));
        route.add(new LatLng(34.5123667, -104.1791000));
        route.add(new LatLng(34.5126333, -104.1789667));
        route.add(new LatLng(34.5128500, -104.1790167));
        route.add(new LatLng(34.5130000, -104.1789833));
        route.add(new LatLng(34.5131833, -104.1789000));
        route.add(new LatLng(34.5133333, -104.1787000));
        route.add(new LatLng(34.5134000, -104.1785833));
        route.add(new LatLng(34.5134167, -104.1785667));
        route.add(new LatLng(34.5135500, -104.1784667));
        route.add(new LatLng(34.5135833, -104.1758833));
        route.add(new LatLng(34.5136500, -104.1748333));
        route.add(new LatLng(34.5137833, -104.1736833));
        route.add(new LatLng(34.5138833, -104.1729167));
        route.add(new LatLng(34.5141333, -104.1719500));
        route.add(new LatLng(34.5143000, -104.1712333));
        route.add(new LatLng(34.5145000, -104.1707333));
        route.add(new LatLng(34.5164000, -104.1675333));
        route.add(new LatLng(34.5169333, -104.1665667));
        route.add(new LatLng(34.5190667, -104.1632500));
        route.add(new LatLng(34.5194833, -104.1628167));
        route.add(new LatLng(34.5219333, -104.1603500));
        route.add(new LatLng(34.5239000, -104.1583000));
        route.add(new LatLng(34.5258500, -104.1560833));
        route.add(new LatLng(34.5276000, -104.1542333));
        route.add(new LatLng(34.5296500, -104.1525667));
        route.add(new LatLng(34.5317167, -104.1505667));
        route.add(new LatLng(34.5340667, -104.1482667));
        route.add(new LatLng(34.5361000, -104.1461000));
        route.add(new LatLng(34.5381000, -104.1435333));
        route.add(new LatLng(34.5398833, -104.1405833));
        route.add(new LatLng(34.5417667, -104.1374000));
        route.add(new LatLng(34.5435500, -104.1345000));
        route.add(new LatLng(34.5458500, -104.1308333));
        route.add(new LatLng(34.5483500, -104.1266500));
        route.add(new LatLng(34.5505333, -104.1223667));
        route.add(new LatLng(34.5527000, -104.1185500));
        route.add(new LatLng(34.5546833, -104.1146667));
        route.add(new LatLng(34.5566667, -104.1112000));
        route.add(new LatLng(34.5588333, -104.1073333));
        route.add(new LatLng(34.5608167, -104.1035333));
        route.add(new LatLng(34.5629667, -104.0998333));
        route.add(new LatLng(34.5657500, -104.0954333));
        route.add(new LatLng(34.5670667, -104.0914500));
        route.add(new LatLng(34.5694833, -104.0871667));
        route.add(new LatLng(34.5717167, -104.0831333));
        route.add(new LatLng(34.5765167, -104.0720167));
        route.add(new LatLng(34.5779333, -104.0669500));
        route.add(new LatLng(34.5790333, -104.0625833));
        route.add(new LatLng(34.5794500, -104.0581500));
        route.add(new LatLng(34.5795000, -104.0553000));
        route.add(new LatLng(34.5802333, -104.0526333));
        route.add(new LatLng(34.5825000, -104.0482167));
        route.add(new LatLng(34.5851333, -104.0432500));
        route.add(new LatLng(34.5874667, -104.0385000));
        route.add(new LatLng(34.5891667, -104.0343667));
        route.add(new LatLng(34.5901833, -104.0306667));
        route.add(new LatLng(34.5910000, -104.0271000));
        route.add(new LatLng(34.5919000, -104.0255000));
        route.add(new LatLng(34.5926667, -104.0242667));
        route.add(new LatLng(34.5935000, -104.0230167));
        route.add(new LatLng(34.5941333, -104.0220000));
        route.add(new LatLng(34.5945667, -104.0212167));
        route.add(new LatLng(34.5952167, -104.0195500));
        route.add(new LatLng(34.5962333, -104.0176167));
        route.add(new LatLng(34.5966833, -104.0165833));
        route.add(new LatLng(34.5974000, -104.0165333));
        route.add(new LatLng(34.5981833, -104.0166500));
        route.add(new LatLng(34.5986667, -104.0167667));
        route.add(new LatLng(34.5995167, -104.0168000));
        route.add(new LatLng(34.6011500, -104.0173667));
        route.add(new LatLng(34.6032167, -104.0181500));
        route.add(new LatLng(34.6066000, -104.0181000));
        route.add(new LatLng(34.6093667, -104.0168333));
        route.add(new LatLng(34.6115833, -104.0146500));
        route.add(new LatLng(34.6122667, -104.0123333));
        route.add(new LatLng(34.6120500, -104.0107500));
        route.add(new LatLng(34.6119500, -104.0106500));
        route.add(new LatLng(34.6169833, -104.0105667));
        route.add(new LatLng(34.6183333, -104.0094333));
        route.add(new LatLng(34.6194333, -104.0086000));
        route.add(new LatLng(34.6190167, -104.0077333));
        route.add(new LatLng(34.6183833, -104.0101167));
        route.add(new LatLng(34.6181833, -104.0118833));
        route.add(new LatLng(34.6189333, -104.0161167));
        route.add(new LatLng(34.6201833, -104.0161667));
        route.add(new LatLng(34.6207667, -104.0156833));
        route.add(new LatLng(34.6200500, -104.0156500));
        route.add(new LatLng(34.6180333, -104.0164000));
        route.add(new LatLng(34.6152833, -104.0179333));
        route.add(new LatLng(34.6078833, -104.0321167));
        route.add(new LatLng(34.6096500, -104.0437167));
        route.add(new LatLng(34.6106167, -104.0453667));
        route.add(new LatLng(34.6109500, -104.0458167));
        route.add(new LatLng(34.6107833, -104.0470000));
        route.add(new LatLng(34.6106833, -104.0486167));
        route.add(new LatLng(34.6105333, -104.0494667));
        route.add(new LatLng(34.6096167, -104.0498833));
        route.add(new LatLng(34.6083667, -104.0518333));
        route.add(new LatLng(34.6072500, -104.0545167));
        route.add(new LatLng(34.6065167, -104.0582667));
        route.add(new LatLng(34.6067000, -104.0621333));
        route.add(new LatLng(34.6069833, -104.0651333));
        route.add(new LatLng(34.6064167, -104.0679667));
        route.add(new LatLng(34.6055333, -104.0762333));
        route.add(new LatLng(34.6050167, -104.0818667));
        route.add(new LatLng(34.6040000, -104.0846500));
        route.add(new LatLng(34.6025000, -104.0880833));
        route.add(new LatLng(34.6016000, -104.0915667));
        route.add(new LatLng(34.6006500, -104.0950333));
        route.add(new LatLng(34.6001000, -104.0989333));
        route.add(new LatLng(34.5994167, -104.1086167));
        route.add(new LatLng(34.5991667, -104.1118667));
        route.add(new LatLng(34.5985500, -104.1149167));
        route.add(new LatLng(34.5983167, -104.1189167));
        route.add(new LatLng(34.5984000, -104.1228667));
        route.add(new LatLng(34.5982167, -104.1272000));
        route.add(new LatLng(34.5983500, -104.1306833));
        route.add(new LatLng(34.5988333, -104.1340500));
        route.add(new LatLng(34.5991500, -104.1366833));
        route.add(new LatLng(34.5987000, -104.1387167));
        route.add(new LatLng(34.5972167, -104.1466833));
        route.add(new LatLng(34.5964333, -104.1504833));
        route.add(new LatLng(34.5960500, -104.1540500));
        route.add(new LatLng(34.5944333, -104.1560500));
        route.add(new LatLng(34.5951333, -104.1568500));
        route.add(new LatLng(34.5949500, -104.1598333));
        route.add(new LatLng(34.5928333, -104.1617167));
        route.add(new LatLng(34.5925000, -104.1619167));
        route.add(new LatLng(34.5940500, -104.1622500));
        route.add(new LatLng(34.5962167, -104.1597833));
        route.add(new LatLng(34.5980500, -104.1595833));
        route.add(new LatLng(34.5992833, -104.1586500));
        route.add(new LatLng(34.6009167, -104.1573500));
        route.add(new LatLng(34.6058833, -104.1468833));
        route.add(new LatLng(34.6104667, -104.1363000));
        route.add(new LatLng(34.6134667, -104.1316000));
        route.add(new LatLng(34.6176500, -104.1258500));
        route.add(new LatLng(34.6190333, -104.1240833));
        route.add(new LatLng(34.6210000, -104.1203000));
        route.add(new LatLng(34.6227667, -104.1165667));
        route.add(new LatLng(34.6287000, -104.1084833));
        route.add(new LatLng(34.6309000, -104.1054833));
        route.add(new LatLng(34.6331167, -104.1022167));
        route.add(new LatLng(34.6352833, -104.0993167));
        route.add(new LatLng(34.6373333, -104.0969667));
        route.add(new LatLng(34.6404333, -104.0937500));
        route.add(new LatLng(34.6415833, -104.0928500));
        route.add(new LatLng(34.6441167, -104.0905667));
        route.add(new LatLng(34.6464000, -104.0879000));
        route.add(new LatLng(34.6485833, -104.0857000));
        route.add(new LatLng(34.6507833, -104.0836500));
        route.add(new LatLng(34.6525500, -104.0818167));
        route.add(new LatLng(34.6556500, -104.0778167));
        route.add(new LatLng(34.6581833, -104.0750500));
        route.add(new LatLng(34.6584333, -104.0747167));
        route.add(new LatLng(34.6591167, -104.0738833));
        route.add(new LatLng(34.6595667, -104.0732000));
        route.add(new LatLng(34.6598667, -104.0723833));
        route.add(new LatLng(34.6601667, -104.0717500));
        route.add(new LatLng(34.6604833, -104.0710333));
        route.add(new LatLng(34.6609167, -104.0698333));
        route.add(new LatLng(34.6617500, -104.0675500));
        route.add(new LatLng(34.6627500, -104.0631000));
        route.add(new LatLng(34.6628500, -104.0623667));
        route.add(new LatLng(34.6638333, -104.0586833));
        route.add(new LatLng(34.6641167, -104.0585333));
        route.add(new LatLng(34.6643500, -104.0583667));
        route.add(new LatLng(34.6646000, -104.0581833));
        route.add(new LatLng(34.6648833, -104.0578833));
        route.add(new LatLng(34.6652000, -104.0576667));
        route.add(new LatLng(34.6655000, -104.0576000));
        route.add(new LatLng(34.6658833, -104.0575667));
        route.add(new LatLng(34.6662833, -104.0575000));
        route.add(new LatLng(34.6666333, -104.0574833));
        route.add(new LatLng(34.6669333, -104.0573667));
        route.add(new LatLng(34.6671167, -104.0572833));
        route.add(new LatLng(34.6673000, -104.0571000));
        route.add(new LatLng(34.6674667, -104.0569000));
        route.add(new LatLng(34.6676833, -104.0566167));
        route.add(new LatLng(34.6678833, -104.0562667));
        route.add(new LatLng(34.6680333, -104.0555333));
        route.add(new LatLng(34.6680667, -104.0550167));
        route.add(new LatLng(34.6680500, -104.0545167));
        route.add(new LatLng(34.6679333, -104.0540000));
        route.add(new LatLng(34.6678833, -104.0532667));
        route.add(new LatLng(34.6679167, -104.0519333));
        route.add(new LatLng(34.6679500, -104.0503000));
        route.add(new LatLng(34.6680833, -104.0485500));
        route.add(new LatLng(34.6683500, -104.0457833));
        route.add(new LatLng(34.6684833, -104.0444167));
        route.add(new LatLng(34.6686833, -104.0429667));
        route.add(new LatLng(34.6690833, -104.0410000));
        route.add(new LatLng(34.6694500, -104.0395333));
        route.add(new LatLng(34.6697833, -104.0383667));
        route.add(new LatLng(34.6702500, -104.0370000));
        route.add(new LatLng(34.6706500, -104.0359833));
        route.add(new LatLng(34.6711500, -104.0347500));
        route.add(new LatLng(34.6720667, -104.0325167));
        route.add(new LatLng(34.6725000, -104.0314000));
        route.add(new LatLng(34.6733000, -104.0294500));
        route.add(new LatLng(34.6738500, -104.0281500));
        route.add(new LatLng(34.6743500, -104.0270000));
        route.add(new LatLng(34.6748333, -104.0259167));
        route.add(new LatLng(34.6753667, -104.0247167));
        route.add(new LatLng(34.6756833, -104.0240167));
        route.add(new LatLng(34.6761500, -104.0229333));
        route.add(new LatLng(34.6766333, -104.0216500));
        route.add(new LatLng(34.6771000, -104.0204333));
        route.add(new LatLng(34.6773500, -104.0199167));
        route.add(new LatLng(34.6777667, -104.0189833));
        route.add(new LatLng(34.6781000, -104.0181833));
        route.add(new LatLng(34.6784667, -104.0170000));
        route.add(new LatLng(34.6786500, -104.0156500));
        route.add(new LatLng(34.6787500, -104.0144167));
        route.add(new LatLng(34.6791333, -104.0124333));
        route.add(new LatLng(34.6840000, -104.0060167));
        route.add(new LatLng(34.6840333, -104.0059333));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840333, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059667));
        route.add(new LatLng(34.6840333, -104.0059667));
        route.add(new LatLng(34.6840333, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059500));
        route.add(new LatLng(34.6840500, -104.0059500));
        route.add(new LatLng(34.6840500, -104.0059500));
        route.add(new LatLng(34.6840500, -104.0059333));
        route.add(new LatLng(34.6840333, -104.0059500));
        route.add(new LatLng(34.6840500, -104.0059333));
        route.add(new LatLng(34.6840500, -104.0059333));
        route.add(new LatLng(34.6840333, -104.0059500));
        route.add(new LatLng(34.6840333, -104.0059500));
        route.add(new LatLng(34.6840167, -104.0059667));
        route.add(new LatLng(34.6840500, -104.0059167));

            Polyline line = mMap.addPolyline(new PolylineOptions()
                    .addAll(route)
                    .width(10)
                    .color(Color.BLUE));


            LatLng jabs = route.get(route.size() - 1);
            mMap.addMarker(new MarkerOptions()
                    .position(route.get(route.size() - 1))
                    .title("Current Location")
                    .snippet("Current location of the weather balloon")
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.map_marker)));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jabs, 10));
    }

    public void transitionMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

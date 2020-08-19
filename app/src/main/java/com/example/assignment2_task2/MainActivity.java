package com.example.assignment2_task2;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button  btnWifiOn,btnWifiOff,btnBluetoothOn,btnBluetoothOff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWifiOn = (Button) findViewById(R.id.wifiOn);
        btnWifiOff = (Button) findViewById(R.id.wifiOff);
        btnBluetoothOn = (Button) findViewById(R.id.bluetoothOn);
        btnBluetoothOff = (Button) findViewById(R.id.bluetoothOff);

        btnWifiOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager onWifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                onWifi.setWifiEnabled(true);
            }
        });

        btnWifiOff.setOnClickListener(( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager offWifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                offWifi.setWifiEnabled(false);
            }
        }));

        btnBluetoothOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BluetoothAdapter mBluetooth = BluetoothAdapter.getDefaultAdapter();
                Integer bluetooth = 1; // Turn on
                Object nada = (bluetooth == 1 ? mBluetooth.enable() : mBluetooth.disable());
            }
        });

        btnBluetoothOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BluetoothAdapter mBluetooth = BluetoothAdapter.getDefaultAdapter();
                Integer bluetooth = 1; // Turn on
                Object nada = (bluetooth == 1 ? mBluetooth.disable() : mBluetooth.enable() );

            }
        });




    }
}

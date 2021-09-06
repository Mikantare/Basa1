package com.bespalov.basa1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        databaseHandler.addCar(new Car("Toyota", "30000"));
        databaseHandler.addCar(new Car("Chery", "15000"));
        databaseHandler.addCar(new Car("Geely", "20000"));
        databaseHandler.addCar(new Car("Kia", "25000"));

        List<Car> carList = databaseHandler.getAllCars();

        for (Car car: carList) {
            Log.d("Car Info", "Id: " + car.getId() + ", name: " + car.getName() + ", price: " + car.getPrice() + ".");
        }
    }
}
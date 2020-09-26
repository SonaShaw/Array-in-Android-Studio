package com.example.adminsonapc.app_24_array;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtArrayValues = (TextView) findViewById(R.id.txtArrayValues);
        TextView txtAverageValue = (TextView) findViewById(R.id.txtAverageValue);
        String oldArrayValues;

        int array[] = {2,56,2,6,9,6,89,65,34,45,36,35,39,78,52,12,3,0,32,0,50};

        for(int i = 0; i<array.length; i++){
            oldArrayValues = txtArrayValues.getText().toString();
            txtArrayValues.setText(oldArrayValues + array[i] + "   ");
        }


        //txtAverageValue.setText(getAverageValue(array) + "");
        txtAverageValue.setText(getAverageValue(4,5,6,8,90) + "");

        //..........................................
        // ............APP ... 25.......
        //....................................


        TextView txtArrayDouleValues = (TextView) findViewById(R.id.txtArrayDoubleValues);
        TextView txtArrayIntegerNumbers = (TextView) findViewById(R.id.txtArrayIntegerNumbers);
        TextView txtIntArray1 = (TextView) findViewById(R.id.txtIntArray1);
        TextView txtIntArray1Copy = (TextView) findViewById(R.id.txtArray1Copy);
        TextView txtLocationArrayElement  = (TextView) findViewById(R.id.txtLocationArrayElement);
        Switch swtEqual = (Switch) findViewById(R.id.swtEqual);

        double doubleValuesArray[] = {6.3,5.3,69.5,45,78,5.2,4.6,3.1,3.3,9.5,8.5,5.9};

        Arrays.sort(doubleValuesArray);         // sorts the valus of doubleValuesArray in ascending order

        String oldDoubleValues;
        for(int i = 0; i<doubleValuesArray.length; i++){
            oldDoubleValues = txtArrayDouleValues.getText().toString();
            txtArrayDouleValues.setText(oldDoubleValues + doubleValuesArray[i] + "   ");
        }

        int intNumbersArray[] = new int[20];
        Arrays.fill(intNumbersArray,1);
        outputArrayToTheScreen(intNumbersArray,txtArrayIntegerNumbers);

        int integerArray1[] = {200,43,84,562,47,489,45,56,89,752,56,78,564,5667};
        int integerArray1Copy[] = new int[integerArray1.length];
        System.arraycopy(integerArray1,0,integerArray1Copy,0,integerArray1.length);
        outputArrayToTheScreen(integerArray1,txtIntArray1);
        outputArrayToTheScreen(integerArray1Copy,txtIntArray1Copy);


        boolean isEqual = Arrays.equals(integerArray1,integerArray1Copy);
        swtEqual.setChecked(isEqual ? true : false);
        swtEqual.setText(isEqual ? "values are equal" : "value are not equal");


        int a = Arrays.binarySearch(doubleValuesArray,5.9);
        if(a>=0)
            txtLocationArrayElement.setText(String.format("key found at index %d",a));
        else
            txtLocationArrayElement.setText("not fond");


        //................................................................
        //...........APP  26..............................................
        //................................................................



        TextView txtInitialCapacity = (TextView) findViewById(R.id.txtInitialCapacity);
        TextView txtArrayListValues = (TextView) findViewById(R.id.txtArrayListValues);
        TextView txtFinalArrayList = (TextView) findViewById(R.id.txtFinalArrayList);
        TextView txtArrayListAfterAddingValues = (TextView) findViewById(R.id.txtArrayListAfterAddingValues);

        ArrayList<String> animals = new ArrayList<String>();

        txtInitialCapacity.setText(animals.size() + " ");
        animals.add("lion");
        animals.add("tiger");
        animals.add("panther");
        animals.add("cat");
        animals.add("dog");
        animals.add("wolf");
        animals.add("goat");
        animals.add("cow");




        String oldAnimalValue;
        for(int i=0; i<animals.size(); i++){
            oldAnimalValue = txtArrayListValues.getText().toString();
            txtArrayListValues.setText(oldAnimalValue + animals.get(i) + "   ");
        }


        animals.add("girrafe");
        animals.add("leopard");

        animals.add(0,"monkey");
        animals.add(1,"elephant");
        animals.remove(3);
        animals.remove(4);
        outputArrayTotheScren(animals,txtFinalArrayList);



        if(animals.contains("monkey"))
             txtArrayListAfterAddingValues.setText(animals.size() + "    monkey exists");
            //throw new IllegalArgumentException("Monkey is not accepted");
        else
            txtArrayListAfterAddingValues.setText(animals.size() + "     monkey doesn't exists");








    }

    public int getAverageValue(int... num){     // varargs parameter (basically an array of integers)
        int sum = 0;
        for(int a : num)
            sum += a;
        return sum/num.length;          // since it is an array so we can use length function

    }


    //..........
    // ....APP  25 .......
    //...........

    public void outputArrayToTheScreen(int[] array, TextView txt ){
        String oldValue;
        for(int number : array){
            oldValue = txt.getText().toString();
            txt.setText(oldValue + number + "   ");
        }
    }

    //.....................................................
    //.........APP : 26....................................
    //.....................................................

    public void outputArrayTotheScren(ArrayList<String> arr, TextView txt){     // Method Overloading........
        String oldValue;
        for(String value : arr){
            oldValue = txt.getText().toString();
            txt.setText(oldValue + value + "     ");
        }
    }
}

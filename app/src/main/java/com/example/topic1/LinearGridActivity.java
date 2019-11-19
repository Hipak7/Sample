package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LinearGridActivity extends AppCompatActivity {
    Button btnThree, btnFour, btnFive, btnSix, btnSeven, btnOne, btnTwo, btnEight, btnNine, btnZero, btnAdd, btnMinus, btnPoint, btnMul, btnDivide, btnEqual;
    EditText etNumber;
    boolean addition,subtraction,multiplication,division;
    float result;
    float firstnum, secondnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_grid);

//        additionClass add=new additionClass();
//        subtractionClass sub=new subtractionClass();
//        multiplyClass mul=new multiplyClass();
//        divisionClass divide=new divisionClass();

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnZero = findViewById(R.id.btnZero);
        btnAdd = findViewById(R.id.btnAdd);
        btnMinus = findViewById(R.id.btnMinus);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnMul = findViewById(R.id.btnMul);
        btnPoint = findViewById(R.id.btnPoint);
        etNumber = findViewById(R.id.etNumber);

        //click
        //for one
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "1");
            }
        });
        //fortwo
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "2");
            }
        });
        //forthree
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "3");
            }
        });
//              //for four
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "4");
            }
        });
        //forfive
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "5");
            }
        });
        //for six
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "6");
            }
        });
        //forseven
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "7");
            }
        });
        //foreight
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "8");
            }
        });
        //fornine
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "9");
            }
        });
        //forzero
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "0");
            }
        });
        //foradd
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "+");
            }
        });
        //for divide
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "%");
            }
        });
        //for multiply
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "*");
            }
        });//for subtract
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumber.setText(etNumber.getText() + "-");
            }
        });
//additionevent
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etNumber == null) {
                    etNumber.setText("");
                } else {
                    firstnum = Float.parseFloat(etNumber.getText() + "");
                    addition = true;
                    etNumber.setText(null);
                }
            }
        });
        //subtractionevent
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etNumber == null) {
                    etNumber.setText("");
                } else {
                    firstnum = Float.parseFloat(etNumber.getText() + "");
                    subtraction = true;
                    etNumber.setText(null);
                }
            }
        });

        //multiplicationevent
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etNumber == null) {
                    etNumber.setText("");
                } else {
                    firstnum = Float.parseFloat(etNumber.getText() + "");
                    multiplication = true;
                    etNumber.setText(null);
                }
            }
        });

        //additionevent
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etNumber == null) {
                    etNumber.setText("");
                } else {
                    firstnum = Float.parseFloat(etNumber.getText() + "");
                    division = true;
                    etNumber.setText(null);
                }
            }
        });

        //equaltoevent
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //firstnum = Float.parseFloat(etNumber.getText() + "");
                secondnum = Float.parseFloat(etNumber.getText() + "");

                additionClass add=new additionClass();
                if(addition==true){

                    result=add.addition(firstnum,secondnum);
                    etNumber.setText(Float.toString(result));
                    addition=false;


                }

                subtractionClass sub=new subtractionClass();
                if(subtraction==true){

                    result=sub.subtraction(firstnum,secondnum);
                    etNumber.setText(Float.toString(result));
                    subtraction=false;
                }

                multiplyClass mul =new multiplyClass();
                if(multiplication==true){

                    result=mul.subtraction(firstnum,secondnum);
                    etNumber.setText(Float.toString(result));
                    multiplication=false;


                }
                divisionClass divide = new divisionClass();
                if(division==true){

                    result=divide.division(firstnum,secondnum);
                    etNumber.setText(Float.toString(result));
                    division=false;


                }


            }
        });
    }
}

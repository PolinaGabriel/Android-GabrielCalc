package com.example.gabrielcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public double memory = 0;
    public double firstNumber;
    public double secondNumber;
    public char sign = ' ';
    TextView txtFirstEntry, txtSecondEntry;
    Button btnMemorySave, btnMemoryRead, btnMemoryClear, btnMemoryPlus, btnMemoryMinus,
            btnPercent, btnClearEntry, btnClearAll, btnBackspace,
            btnDivision, btnPowerTwo, btnRadixTwo, btnDivide,
            btnSeven, btnEight, btnNine, btnMultiple,
            btnFour, btnFive, btnSix, btnMinus,
            btnOne, btnTwo, btnThree, btnPlus,
            btnNegate, btnZero, btnComma, btnSolve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstEntry = findViewById(R.id.txtFirstEntry);
        txtSecondEntry = findViewById(R.id.txtSecondEntry);

        btnMemorySave = findViewById(R.id.btnMemorySave);
        btnMemoryRead = findViewById(R.id.btnMemoryRead);
        btnMemoryClear = findViewById(R.id.btnMemoryClear);
        btnMemoryPlus = findViewById(R.id.btnMemoryPlus);
        btnMemoryMinus = findViewById(R.id.btnMemoryMinus);

        btnPercent = findViewById(R.id.btnPercent);
        btnClearEntry = findViewById(R.id.btnClearEntry);
        btnClearAll = findViewById(R.id.btnClearAll);
        btnBackspace = findViewById(R.id.btnBackspace);

        btnDivision = findViewById(R.id.btnDivision);
        btnPowerTwo = findViewById(R.id.btnPowerTwo);
        btnRadixTwo = findViewById(R.id.btnRadixTwo);
        btnDivide = findViewById(R.id.btnDivide);

        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnMultiple = findViewById(R.id.btnMultiple);

        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnMinus = findViewById(R.id.btnMinus);

        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnPlus = findViewById(R.id.btnPlus);

        btnNegate = findViewById(R.id.btnNegate);
        btnZero = findViewById(R.id.btnZero);
        btnComma = findViewById(R.id.btnComma);
        btnSolve = findViewById(R.id.btnSolve);

        //Управление вводом
        View.OnClickListener Entry = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.equals(btnClearEntry)) {
                    txtFirstEntry.setText("");
                }
                if(v.equals(btnClearAll)) {
                    txtFirstEntry.setText("");
                    memory = 0;
                }
                if(v.equals(btnBackspace)) {
                    String entry = (String) txtFirstEntry.getText();
                    if(entry.length() == 1) {
                        txtFirstEntry.setText("");
                    }
                    else if(entry.length() > 1) {
                        txtFirstEntry.setText(entry.substring(0, entry.length() - 2));
                    }
                }
            }
        };
        btnClearEntry.setOnClickListener(Entry);
        btnClearAll.setOnClickListener(Entry);
        btnBackspace.setOnClickListener(Entry);

        //Управление памятью
        View.OnClickListener Memory = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.equals(btnMemorySave)) {
                    if (txtFirstEntry.getText() != "") {
                        memory = Double.parseDouble((String) txtFirstEntry.getText());
                    }
                }
                if(v.equals(btnMemoryRead)) {
                    String answer = String.valueOf((double) memory);
                    txtFirstEntry.setText(answer);
                }
                if(v.equals(btnMemoryClear)) {
                    memory = 0;
                }
                if(v.equals(btnMemoryPlus)) {
                    double x = Double.parseDouble((String) txtFirstEntry.getText());
                    String answer = String.valueOf(memory + x);
                    txtFirstEntry.setText(answer);
                }
                if(v.equals(btnMemoryMinus)) {
                    double x = Double.parseDouble((String) txtFirstEntry.getText());
                    String answer = String.valueOf(memory - x);
                    txtFirstEntry.setText(answer);
                }
            }
        };
        btnMemorySave.setOnClickListener(Memory);
        btnMemoryRead.setOnClickListener(Memory);
        btnMemoryClear.setOnClickListener(Memory);
        btnMemoryPlus.setOnClickListener(Memory);
        btnMemoryMinus.setOnClickListener(Memory);

        //Ввод чисел
        View.OnClickListener Numbers = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(v.equals(btnZero)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "0");
                }
                if(v.equals(btnOne)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "1");
                }
                if(v.equals(btnTwo)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "2");
                }
                if(v.equals(btnThree)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "3");
                }
                if(v.equals(btnFour)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "4");
                }
                if(v.equals(btnFive)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "5");
                }
                if(v.equals(btnSix)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "6");
                }
                if(v.equals(btnSeven)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "7");
                }
                if(v.equals(btnEight)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "8");
                }
                if(v.equals(btnNine)) {
                    txtFirstEntry.setText(txtFirstEntry.getText() + "9");
                }
                if(v.equals(btnComma)) {
                    String entry = (String) txtFirstEntry.getText();
                    if(entry.indexOf(",") == -1 && entry != "") {
                        txtFirstEntry.setText(txtFirstEntry.getText() + ",");
                    }
                }
                if(v.equals(btnNegate)) {
                    String entry = (String) txtFirstEntry.getText();
                    if(entry.indexOf("-") == -1) {
                        txtFirstEntry.setText("-" + entry);
                    }
                    else {
                        txtFirstEntry.setText(entry.substring(1));
                    }
                }
            }
        };
        btnZero.setOnClickListener(Numbers);
        btnOne.setOnClickListener(Numbers);
        btnTwo.setOnClickListener(Numbers);
        btnThree.setOnClickListener(Numbers);
        btnFour.setOnClickListener(Numbers);
        btnFive.setOnClickListener(Numbers);
        btnSix.setOnClickListener(Numbers);
        btnSeven.setOnClickListener(Numbers);
        btnEight.setOnClickListener(Numbers);
        btnNine.setOnClickListener(Numbers);
        btnComma.setOnClickListener(Numbers);
        btnNegate.setOnClickListener(Numbers);

        //Действия, выдающие ответ автоматически
        View.OnClickListener SolveNotNeeded = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //только число
                double x = Double.parseDouble((String) txtFirstEntry.getText());
                String answer = "";
                String entry = (String) txtFirstEntry.getText();
                if(v.equals(btnDivision) && entry != "") {
                    answer = String.valueOf((1 / x) + (1 % x));
                }
                if(v.equals(btnPowerTwo) && entry != "") {
                    answer = String.valueOf(Math.pow(x,2));
                }
                if(v.equals(btnRadixTwo) && entry != "") {
                    answer = String.valueOf(Math.sqrt(x));
                }
                txtFirstEntry.setText(answer);
            }
        };
        btnDivision.setOnClickListener(SolveNotNeeded);
        btnPowerTwo.setOnClickListener(SolveNotNeeded);
        btnRadixTwo.setOnClickListener(SolveNotNeeded);

        //Знаки действий
        View.OnClickListener Signs = new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(txtFirstEntry.getText() != "") {
                    firstNumber = Double.parseDouble((String) txtFirstEntry.getText());
                    if(v.equals(btnPlus)) {
                        txtSecondEntry.setText(txtFirstEntry.getText() + "+");
                        sign = '+';
                    }
                    if(v.equals(btnMinus)) {
                        txtSecondEntry.setText(txtFirstEntry.getText() + "-");
                        sign = '-';
                    }
                    if(v.equals(btnMultiple)) {
                        txtSecondEntry.setText(txtFirstEntry.getText() + "*");
                        sign = '*';
                    }
                    if(v.equals(btnDivide)) {
                        txtSecondEntry.setText(txtFirstEntry.getText() + "/");
                        sign = '/';
                    }
                    if(v.equals(btnPercent)) {
                        txtSecondEntry.setText(txtFirstEntry.getText() + "%");
                        sign = '%';
                    }
                    txtFirstEntry.setText("");
                }
            }
        };
        btnPlus.setOnClickListener(Signs);
        btnMinus.setOnClickListener(Signs);
        btnMultiple.setOnClickListener(Signs);
        btnDivide.setOnClickListener(Signs);
        btnPercent.setOnClickListener(Signs);

        //Решение выражения
        View.OnClickListener Solve = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //если firstNumber имеет значение
                if(txtFirstEntry.getText() != "") {
                    secondNumber = Double.parseDouble((String) txtFirstEntry.getText());
                    txtSecondEntry.setText("");
                    String answer = "";
                    if(sign == '+') {
                        answer = String.valueOf(firstNumber + secondNumber);
                    }
                    if(sign == '-') {
                        answer = String.valueOf(firstNumber - secondNumber);
                    }
                    if(sign == '*') {
                        answer = String.valueOf(firstNumber * secondNumber);
                    }
                    if(sign == '/') {
                        answer = String.valueOf((firstNumber / secondNumber) + (firstNumber % secondNumber));
                    }
                    if(sign == '%') {
                        answer = String.valueOf(((firstNumber / 100) + (firstNumber % 100)) * secondNumber);
                    }
                    txtFirstEntry.setText(answer);
                    sign = ' ';
                }
            }
        };
        btnSolve.setOnClickListener(Solve);
    }
}
package com.example.guess_the_symbol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {
    private EditText edNum1;
    private EditText edNum2;
    private EditText edNum3;
    private EditText edNum4;
    private EditText edNum5;
    private TextView tvAnswer;
    private TextView textView3;

    private Button click;

 //   int n1=0,n2,n3,n4,n5;
//    Thread k = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            if(n1!=0 && n2!=0){
//                click.setEnabled(true);
//            }
//            else{
//                click.setEnabled(false);
//            }
//        }
//    });
//    k.start();




    public String solve(int a,int b,int c,int d,int res) {


        //1st place can have 4 symbols  2nd = have 3 symbols and 3rd = have 2 symbols
    try {
        if ((((a + b) - c) * d) == res)   //start with  +
            return "" + a + " + " + b + " - " + c + " * " + d + " = "+res;
        else if ((((a + b) - c) / d) == res)
            return "" + a + " + " + b + " - " + c + " / " + d + " = "+res;
        else if ((((a + b) * c) - d) == res)
            return "" + a + " + " + b + " * " + c + " - " + d + " = "+res;
        else if ((((a + b) * c) / d) == res)
            return "" + a + " + " + b + " * " + c + " / " + d + " = "+res;
        else if ((((a + b) / c) * d) == res)
            return "" + a + " + " + b + " / " + c + " * " + d + " = "+res;
        else if ((((a + b) / c) - d) == res)
            return "" + a + " + " + b + " / " + c + " - " + d + " = "+res;

        else if ((((a - b) + c) * d) == res)   //start with  -
            return "" + a + " - " + b + " + " + c + " * " + d + " = "+res;
        else if ((((a - b) + c) / d) == res)
            return "" + a + " - " + b + " + " + c + " / " + d + " = "+res;
        else if ((((a - b) * c) + d) == res)
            return "" + a + " - " + b + " * " + c + " + " + d + " = "+res;
        else if ((((a - b) * c) / d) == res)
            return "" + a + " - " + b + " * " + c + " / " + d + " = "+res;
        else if ((((a - b) / c) * d) == res)
            return "" + a + " - " + b + " / " + c + " * " + d + " = "+res;
        else if ((((a - b) / c) + d) == res)
            return "" + a + " - " + b + " / " + c + " |+ " + d + " = "+res;


        else if ((((a * b) + c) - d) == res)   //start with  *
            return "" + a + " * " + b + " + " + c + " - " + d + " = "+res;
        else if ((((a * b) + c) / d) == res)
            return "" + a + " * " + b + " + " + c + " / " + d + " = "+res;
        else if ((((a * b) - c) + d) == res)
            return "" + a + " * " + b + " - " + c + " + " + d + " = "+res;
        else if ((((a * b) - c) / d) == res)
            return "" + a + " * " + b + " - " + c + " / " + d + " = "+res;
        else if ((((a * b) / c) + d) == res)
            return "" + a + " * " + b + " / " + c + " + " + d + " = "+res;
        else if ((((a * b) / c) - d) == res)
            return "" + a + " * " + b + " / " + c + " - " + d + " = "+res;

        else if ((((a / b) + c) * d) == res)   //start with  /
            return "" + a + " / " + b + " + " + c + " * " + d + " = "+res;
        else if ((((a / b) + c) - d) == res)
            return "" + a + " / " + b + " + " + c + " - " + d + " = "+res;
        else if ((((a / b) - c) + d) == res)
            return "" + a + " / " + b + " - " + c + " + " + d + " = "+res;
        else if ((((a / b) - c) * d) == res)
            return "" + a + " / " + b + " - " + c + " * " + d + " = "+res;
        else if ((((a / b) * c) + d) == res)
            return "" + a + " / " + b + " * " + c + " + " + d + " = "+res;
        else if ((((a / b) * c) - d) == res)
            return "" + a + " / " + b + " * " + c + " - " + d + " = "+res;
            return "nothing";
    }
    catch (Exception e){
        return "Something gone wrong";
    }


    }







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum1=(EditText) findViewById(R.id.edNum1);
        edNum2=(EditText) findViewById(R.id.edNum2);
        edNum3=(EditText) findViewById(R.id.edNum3);
        edNum4=(EditText) findViewById(R.id.edNum4);
        edNum5=(EditText) findViewById(R.id.edNum5);
        tvAnswer=(TextView) findViewById(R.id.tvAnswer);
        textView3=(TextView) findViewById(R.id.textView3);


        click =(Button) findViewById(R.id.btnSolve);

     //   click.setEnabled(false);
//
//        if(edNum1.getText().toString().isEmpty()){
//            click.setEnabled(false);
//        }
//        else{
//            click.setEnabled(true);
//        }

//        edNum1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if(!charSequence.toString().isEmpty()){
//                    n1=12;
//                }
//                else{
//                    n1=0;
//                }
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//
//        edNum2.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if(!charSequence.toString().isEmpty()){
//                    n2=12;
//                }
//                else{
//                    n2=0;
//                }
//
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
//
//
//        if(!edNum1.getText().toString().isEmpty() &&  !edNum2.getText().toString().isEmpty()){
//            click.setEnabled(true);
//        }
//        else{
//            click.setEnabled(false);
//        }




        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                int n1=Integer.parseInt(edNum1.getText().toString());
                int n2=Integer.parseInt(edNum2.getText().toString());
                int n3=Integer.parseInt(edNum3.getText().toString());
                int n4=Integer.parseInt(edNum4.getText().toString());
                int n5=Integer.parseInt(edNum5.getText().toString());



                String ans= solve(n1,n2,n3,n4,n5);
                String result="Symbol :- \n "+ans;
               // show_ans.setText(ans);

                tvAnswer.setText(result);
                try{close();}catch(Exception e){}}
                catch (Exception e){
                    tvAnswer.setText("Fill the remaining blocks");
                    try{close();}catch(Exception e1){}
                }



            }
            private void close(){
                InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

            }
        });
    }
}

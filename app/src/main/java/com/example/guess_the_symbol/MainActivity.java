package com.example.guess_the_symbol;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText edNum1;
    EditText edNum2;
    EditText edNum3;
    EditText edNum4;
    EditText edNum5;
    TextView tvAnswer;
    TextView textView3;
    TextView show_ans;

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
        show_ans =(TextView) findViewById(R.id.show_ans);

        Button click =(Button) findViewById(R.id.btnSolve);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(edNum1.getText().toString());
                int n2=Integer.parseInt(edNum2.getText().toString());
                int n3=Integer.parseInt(edNum3.getText().toString());
                int n4=Integer.parseInt(edNum4.getText().toString());
                int n5=Integer.parseInt(edNum5.getText().toString());


                String ans= solve(n1,n2,n3,n4,n5);
                String result="Symbol :- \n "+ans;
               // show_ans.setText(ans);

                tvAnswer.setText(result);



            }
        });
    }
}

package com.example.calculadora2;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	
	EditText ednumero1, ednumero2;
	Button btsubtrair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        
        btsubtrair.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				
				double res = num1 - num2;

				AlertDialog.Builder  diag_resultado;
				diag_resultado = new AlertDialog.Builder(MainActivity.this);
				
				diag_resultado.setTitle("Calculadora");
				diag_resultado.setMessage("O resultado é:" + res);
				diag_resultado.setNeutralButton("Ok", null);
				
				diag_resultado.show();
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

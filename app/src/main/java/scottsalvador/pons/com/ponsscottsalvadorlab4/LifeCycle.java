package scottsalvador.pons.com.ponsscottsalvadorlab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);
        Log.d("4itf","onCreate has executed...");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("4itf","onStart has executed...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4itf","onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","onPause runs");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf","onRestart has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","object is deallocated");
    }

    public void display(View v){
        Snackbar.make(v,"this is Snackbar",Snackbar.LENGTH_LONG).show();
    }

    public void display2(View v){
        Toast.makeText(this, "Button is clicked..", Toast.LENGTH_LONG).show();
    }
}

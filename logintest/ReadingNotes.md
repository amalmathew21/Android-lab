====================================================================
MainActivity.java
=====================================================================

public class MainActivity extends AppCompatActivity {
    private int counter=5;
    EditText name,password;
    Button login;
    TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        name=findViewById(R.id.email);
        password=findViewById(R.id.pass);
        login=findViewById(R.id.btn1);
        message=findViewById(R.id.failres);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });

    }
    private void validate(String username,String password){
        if(username.equals("likki@gmail.com") && password.equals("u2117033") ) {
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            if(counter==0)
            {
                message.setText("too many unsuccessfull attempts\n login disabled");
                login.setEnabled(false);
            }
            else {
                message.setText(counter + " tries left");
            }
        }
    }

}
-----------------------------------------------------------------------
======================================================================
second.java
======================================================================

public class second extends AppCompatActivity {
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent back=new Intent(second.this,MainActivity.class);
                startActivity(back);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(second.this,thirdActv.class);
                startActivity(in);
            }
        });

    }
}


---------------------------------------------------------------
=======================================================================
activity_main.xml
====================================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="95dp"
        android:layout_height="27dp"
        android:text="PASSWORD"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        app:layout_constraintVertical_bias="0.105" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="95dp"
        android:layout_height="27dp"
        android:text="EMAIL"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.088"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.328" />

    <EditText
        android:id="@+id/email"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="johndoe@mail.com"
        android:inputType="textEmailAddress"
        android:minHeight="48dp"
        android:textColorHighlight="#465EE3"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.512"
        app:layout_constraintStart_toEndOf="@+id/textView"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.31" />

    <EditText
        android:id="@+id/pass"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="8 min char"
        android:inputType="textPassword"
        android:minHeight="48dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.512"
        app:layout_constraintStart_toEndOf="@+id/textView3"
        app:layout_constraintTop_toBottomOf="@+id/email"
        app:layout_constraintVertical_bias="0.067" />

    <Button
        android:id="@+id/btn1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Login"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="@+id/pass"
        app:layout_constraintHorizontal_bias="0.449"
        app:layout_constraintStart_toStartOf="@+id/textView3"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.565" />

    <TextView
        android:id="@+id/failres"
        android:layout_width="337dp"
        android:layout_height="186dp"
        android:layout_marginBottom="92dp"
        android:textAlignment="center"
        android:textColor="#DF0707"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="@+id/btn1"
        app:layout_constraintHorizontal_bias="0.461"
        app:layout_constraintStart_toStartOf="@+id/btn1" />

</androidx.constraintlayout.widget.ConstraintLayout>

=====================================================================
activity_second.xml
========================================================================
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".second">

    <Button
        android:id="@+id/btn2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="logout"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.59" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="214dp"
        android:layout_height="51dp"
        android:text="2nd page"
        android:textAlignment="center"
        android:textSize="34sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.377" />

    <Button
        android:id="@+id/btn3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="next page"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.736" />
</androidx.constraintlayout.widget.ConstraintLayout>
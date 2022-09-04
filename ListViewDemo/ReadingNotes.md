====================================================================
MainActivity.java
=====================================================================

public class MainActivity extends AppCompatActivity {
    ListView ls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            ls=findViewById(R.id._listview1);

            ArrayList<String> fruits=new ArrayList<String>();
            fruits.add("Apple");
            fruits.add("Mango");
            fruits.add("Pineapple");
            fruits.add("watermelon");
            fruits.add("grapes");
            fruits.add("banana");
            fruits.add("blueberry");
            fruits.add("blackberry");
            fruits.add("strawberry");
            fruits.add("pomegranate");
            fruits.add("muskmelon");
            fruits.add("dragon fruit");
            fruits.add("orange");
            fruits.add("tangerine");
            fruits.add("guava");
            fruits.add("cashew nut");

            ArrayAdapter<String> Ap=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits);
            ls.setAdapter(Ap);

            ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity.this, ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
                }
            });
    }
}



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

    <ListView
        android:id="@+id/_listview1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="1.0" />
</androidx.constraintlayout.widget.ConstraintLayout>
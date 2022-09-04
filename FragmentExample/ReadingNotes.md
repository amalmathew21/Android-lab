====================================================================
MainActivity.java
=====================================================================

public class MainActivity extends AppCompatActivity {
    Button b1,b2;

    public void replaceFragement(Fragment fragment)
    {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.FramLayoutview,fragment)
                .addToBackStack("")
                .commit();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragement(new FirstFragment());
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragement(new FragmentSecond());
            }
        });
    }
}

===================================================================
Fragmentsecond.java
===================================================================
public class FragmentSecond extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }
}

=======================================================================
activity_main.xml
====================================================================
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    >

    <FrameLayout
        android:id="@+id/FramLayoutview"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

    </FrameLayout>


    <Button
        android:id="@+id/btn1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_marginStart="50dp"
        android:layout_marginBottom="50dp"
        android:text="fragment1"
        android:textAlignment="center">

    </Button>

    <Button
        android:id="@+id/btn2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentEnd="true"
        android:layout_alignParentBottom="true"
        android:layout_marginEnd="50dp"
        android:layout_marginBottom="50dp"
        android:text="fragment2"
        android:textAlignment="center">

    </Button>

</RelativeLayout>
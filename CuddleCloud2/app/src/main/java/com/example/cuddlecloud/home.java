package com.example.cuddlecloud;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
// ...

public class home extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ...
        setContentView(R.layout.activity_home);

        drawerLayout=findViewById(R.id.drawerlayout);
        toolbar=findViewById(R.id.toolbar);
        navigationView=findViewById(R.id.navview);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_nav,R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        ImageView img = findViewById(R.id.imageView); // Gets the specific ImageView from your layou
        if (img != null) {
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g1.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }

        ImageView img1 = findViewById(R.id.imageView1); // Gets the specific ImageView from your layou
        if (img1 != null) {
            img1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b1.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img3 = findViewById(R.id.imageView3); // Gets the specific ImageView from your layou
        if (img3 != null) {
            img3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b2.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img2 = findViewById(R.id.imageView2); // Gets the specific ImageView from your layou
        if (img2 != null) {
            img2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g2.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img4 = findViewById(R.id.imageView4); // Gets the specific ImageView from your layou
        if (img4 != null) {
            img4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g3.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img5 = findViewById(R.id.imageView5); // Gets the specific ImageView from your layou
        if (img5 != null) {
            img5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b3.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img6 = findViewById(R.id.imageView6); // Gets the specific ImageView from your layou
        if (img6 != null) {
            img6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b4.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img7 = findViewById(R.id.imageView7); // Gets the specific ImageView from your layou
        if (img7 != null) {
            img7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g4.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img8 = findViewById(R.id.imageView8); // Gets the specific ImageView from your layou
        if (img8 != null) {
            img8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g5.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img9 = findViewById(R.id.imageView9); // Gets the specific ImageView from your layou
        if (img9 != null) {
            img9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b5.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img10 = findViewById(R.id.imageView10); // Gets the specific ImageView from your layou
        if (img10 != null) {
            img10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b6.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img11 = findViewById(R.id.imageView11); // Gets the specific ImageView from your layou
        if (img11 != null) {
            img11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g6.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img12 = findViewById(R.id.imageView12); // Gets the specific ImageView from your layou
        if (img12 != null) {
            img12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g7.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img13 = findViewById(R.id.imageView13); // Gets the specific ImageView from your layou
        if (img13 != null) {
            img13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b7.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img14 = findViewById(R.id.imageView14); // Gets the specific ImageView from your layou
        if (img14 != null) {
            img14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b8.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img15 = findViewById(R.id.imageView15); // Gets the specific ImageView from your layou
        if (img15 != null) {
            img15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g8.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img16 = findViewById(R.id.imageView16); // Gets the specific ImageView from your layou
        if (img16 != null) {
            img16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g9.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img17 = findViewById(R.id.imageView17); // Gets the specific ImageView from your layou
        if (img17 != null) {
            img17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b9.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img18 = findViewById(R.id.imageView18); // Gets the specific ImageView from your layou
        if (img18 != null) {
            img18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b10.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img19 = findViewById(R.id.imageView19); // Gets the specific ImageView from your layou
        if (img19 != null) {
            img19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g10.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img20 = findViewById(R.id.imageView20); // Gets the specific ImageView from your layou
        if (img20!= null) {
            img20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g11.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img21 = findViewById(R.id.imageView21); // Gets the specific ImageView from your layou
        if (img21 != null) {
            img21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b11.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img22 = findViewById(R.id.imageView22); // Gets the specific ImageView from your layou
        if (img22 != null) {
            img22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b12.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img23 = findViewById(R.id.imageView23); // Gets the specific ImageView from your layou
        if (img23 != null) {
            img23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g12.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img24 = findViewById(R.id.imageView24); // Gets the specific ImageView from your layou
        if (img24 != null) {
            img24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g13.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img25 = findViewById(R.id.imageView25); // Gets the specific ImageView from your layou
        if (img25 != null) {
            img25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b13.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img26 = findViewById(R.id.imageView26); // Gets the specific ImageView from your layou
        if (img26 != null) {
            img26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, b14.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }
        ImageView img27 = findViewById(R.id.imageView27); // Gets the specific ImageView from your layou
        if (img27 != null) {
            img27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // This is the crucial part for navigation
                    Intent i = new Intent(home.this, g14.class); // 1. Create an Intent to go from 'home' to 'g1'
                    startActivity(i);                                     // 3. (Optional) Close the 'home' Activity
                }
            });
        }

        TextView tv=findViewById(R.id.textView2);
        if (tv != null) {
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g1.class);
                    startActivity(i);
                }
            });
        }

        TextView tv3=findViewById(R.id.textView3);
        if (tv3 != null) {
            tv3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b1.class);
                    startActivity(i);
                }
            });
        }

        TextView tv5=findViewById(R.id.textView5);
        if (tv5 != null) {
            tv5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b2.class);
                    startActivity(i);
                }
            });
        }
        TextView tv4=findViewById(R.id.textView4);
        if (tv4 != null) {
            tv4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g2.class);
                    startActivity(i);
                }
            });
        }

        TextView tv6=findViewById(R.id.textView6);
        if (tv6 != null) {
            tv6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g3.class);
                    startActivity(i);
                }
            });
        }
        TextView tv7=findViewById(R.id.textView7);
        if (tv7 != null) {
            tv7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b3.class);
                    startActivity(i);
                }
            });
        }
        TextView tv8=findViewById(R.id.textView8);
        if (tv8 != null) {
            tv8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b4.class);
                    startActivity(i);
                }
            });
        }
        TextView tv9=findViewById(R.id.textView9);
        if (tv9 != null) {
            tv9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g4.class);
                    startActivity(i);
                }
            });
        }
        TextView tv10=findViewById(R.id.textView10);
        if (tv10 != null) {
            tv10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g5.class);
                    startActivity(i);
                }
            });
        }
        TextView tv11=findViewById(R.id.textView11);
        if (tv11 != null) {
            tv11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b5.class);
                    startActivity(i);
                }
            });
        }
        TextView tv12=findViewById(R.id.textView12);
        if (tv12 != null) {
            tv12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b6.class);
                    startActivity(i);
                }
            });
        }
        TextView tv13=findViewById(R.id.textView13);
        if (tv13 != null) {
            tv13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g6.class);
                    startActivity(i);
                }
            });
        }
        TextView tv14=findViewById(R.id.textView14);
        if (tv14 != null) {
            tv14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g7.class);
                    startActivity(i);
                }
            });
        }
        TextView tv15=findViewById(R.id.textView15);
        if (tv15 != null) {
            tv15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b7.class);
                    startActivity(i);
                }
            });
        }
        TextView tv16=findViewById(R.id.textView16);
        if (tv16 != null) {
            tv16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b8.class);
                    startActivity(i);
                }
            });
        }
        TextView tv17=findViewById(R.id.textView17);
        if (tv17 != null) {
            tv17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g8.class);
                    startActivity(i);
                }
            });
        }
        TextView tv18=findViewById(R.id.textView18);
        if (tv18 != null) {
            tv18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g9.class);
                    startActivity(i);
                }
            });
        }
        TextView tv19=findViewById(R.id.textView19);
        if (tv19 != null) {
            tv19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b9.class);
                    startActivity(i);
                }
            });
        }
        TextView tv20=findViewById(R.id.textView20);
        if (tv20 != null) {
            tv20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b10.class);
                    startActivity(i);
                }
            });
        }
        TextView tv21=findViewById(R.id.textView21);
        if (tv21 != null) {
            tv21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g10.class);
                    startActivity(i);
                }
            });
        }
        TextView tv22=findViewById(R.id.textView22);
        if (tv22 != null) {
            tv22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g11.class);
                    startActivity(i);
                }
            });
        }
        TextView tv23=findViewById(R.id.textView23);
        if (tv23 != null) {
            tv23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b11.class);
                    startActivity(i);
                }
            });
        }
        TextView tv24=findViewById(R.id.textView24);
        if (tv24 != null) {
            tv24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b12.class);
                    startActivity(i);
                }
            });
        }
        TextView tv25=findViewById(R.id.textView25);
        if (tv25 != null) {
            tv25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g12.class);
                    startActivity(i);
                }
            });
        }
        TextView tv26=findViewById(R.id.textView26);
        if (tv26 != null) {
            tv26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g13.class);
                    startActivity(i);
                }
            });
        }
        TextView tv27=findViewById(R.id.textView27);
        if (tv27 != null) {
            tv27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b13.class);
                    startActivity(i);
                }
            });
        }
        TextView tv28=findViewById(R.id.textView28);
        if (tv28 != null) {
            tv28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, b14.class);
                    startActivity(i);
                }
            });
        }
        TextView tv29=findViewById(R.id.textView29);
        if (tv29 != null) {
            tv29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(home.this, g14.class);
                    startActivity(i);
                }
            });
        }
    }
}
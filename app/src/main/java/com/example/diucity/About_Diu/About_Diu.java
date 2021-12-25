package com.example.diucity.About_Diu;

import androidx.appcompat.app.ActionBar;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.diucity.R;

public class About_Diu extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_diu);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "About Diu";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.about_diu_text);
        Spannable text1 = new SpannableString("Diu is a coastal town at the eastern end of Diu Island, India. A bridge connects the island to the state of Gujarat. " +
                "Diu was established by Portuguese Empire in 16th century. Diu is mainly known for its white sand beaches. The population of Diu is around 52 thousands (in 2011) and the area of Diu is around 40 km square. " +
                "The 'Diu Indo-Portuguese or Diu Portuguese' language is mainly spoken in Diu district. it is creole language based mainly on Portuguese and Gujarati. Gujarati language is also spoken in Diu. " +
                "Nagoa Beach is one of the most famous beach of Diu. Overlooking the Arabian Sea, Diu Fort, 16th century Portuguese citadel, features a lighthouse and cannons. " +
                "Inland, centuries-old St. Paul's Church was built in elaborate baroque style. Nearby, whitewashed S. Thomas Church is now home to the Diu Museum, with wooden carvings and religious artifacts. " +
                "Diu is connected with all big cities of Gujarat by road and also connected with Mumbai by air. DIu is very beautiful city and everyone can enjoy the vacations or holidays. Diu feature a subtropical climate. Being closely located to the sea the weather of Diu is cool, calm and breezy. the weather of Diu is almost moderate.");
        //text1.setSpan(new ForegroundColorSpan(Color.WHITE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);
        textView1.setTextIsSelectable(true);
    }
}
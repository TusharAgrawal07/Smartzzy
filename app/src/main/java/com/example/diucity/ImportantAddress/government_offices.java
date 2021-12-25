package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.diucity.R;

public class government_offices extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government_offices);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Government Blocks";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.government_office_text1);
        Spannable text1 = new SpannableString("Information About Government Blocks");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.government_office_text2);
        Spannable text2 = new SpannableString("1.Diu Collectorate Office\nAddress: PX9Q+5VW, Diu, 362520\nPhone: 02875 252 444\nMap: https://goo.gl/maps/Fyg7yPb2ukVEhUB56\nMore Info.: http://diu.gov.in/collector-profile.php" +
                "\n\n2.DIU MUNICIPAL COUNCIL\nAddress: Fort Road Diu Daman and Diu, 362520\nPhone: 02875 252 126\nRating: 4.0/5\nMap: https://goo.gl/maps/Fqvrvbns5Zf8JfJe6\nMore Info.: https://diumunicipalcouncil.in/" +
                "\n\n3.Mamlatdar Diu\nAddress: St.Paul Church Rd, Diu, 362520\nMap: https://goo.gl/maps/wYiH25J8kua7JxHf6\nMore Info.: http://diu.gov.in/mamlatdar-office-diu.php" +
                "\n\n4.District Magistrate Diu\nAddress: PX8Q+PPH, Diu, 362520\nMap: https://goo.gl/maps/VA6oVYxgVrJ1kJUp6\nMore Info.: http://diu.gov.in/collector-profile.php" +
                "\n\n5.Public Works Department Diu\nAddress:  PX8V+F2H, Diu, 362520\nMap: https://goo.gl/maps/aQ8tA3qvDpxG8Wev6\nMore Info.: http://diu.gov.in/public-works-department-diu.php" +
                "\n\n6.City Survey Office - Diu\nAddress: St.Paul Church Rd, Diu, 362520\nHours: 10am-5pm, Sunday Closed\nMap: https://goo.gl/maps/acnTjcGAGiAhCDBx7\nMore Info.: http://diu.gov.in/city-survey-office-diu.php" +
                "\n\n7.District Panchayat\nAddress: PX6H+G4 Diu, Dadra and Nagar Haveli and Daman and Diu\nHours: 10am-5pm, Sunday Close\nMap: https://goo.gl/maps/cc4KWp3g545d6rTL6\nMore Info.: https://www.daman.nic.in/district-panchayat.aspx" +
                "\n\n8.VAT & GST Office Diu\nAddress: PX8Q+JCC, Diu, 362520\nHours: 10am-5pm, Sunday Closed\nMap: https://goo.gl/maps/z6NUy2J4ccYAuXVM\nMore Info.: http://diu.gov.in/value-added-tax-office-diu.php" +
                "\n\n9.Port Office Diu\nAddress: Fort Rd, Diu, 362520\nMap: https://goo.gl/maps/ynVWKTZAkmy1hqeH6\nMore Info.: https://www.daman.nic.in/port-office.aspx" +
                "\n\n10.Excise Department\nAddress: St.Paul Church Rd, Diu, 362520\nHours: 10am-5pm, Sunday Closed\nMap: https://goo.gl/maps/Z6oV2JtqLQU8Qxag6\nMore Info.: https://ddnexcise.gov.in/" +
                "\n\n11.Diu Sub Post Office\nAddress:  PX9P+G7G, Diu, 362520\nHours: 9am-5pm, Sunday Closed\nPhone: 02875 253 200\nMap: https://goo.gl/maps/F4bjRarYwvEcwQ8g8\nMore Info.: https://www.postoffices.co.in/daman-diu-dd/daman-10/" +
                "\n\n12.Mini Government Printing Press Diu\nAddress: Fort Rd, Diu, 362520\nHours: 9am-6pm, Saturday & Sunday Closed\nPhone: 02875 253 898\nMap: https://goo.gl/maps/UDS53yjwt8u2VMin9\nMore Info.: http://diu.gov.in/government-printing-press-diu.php" +
                "\n\n13.Public Works Department Water Pump\nAddress: PX7F+V3Q, Diu, 362520\nMap: https://goo.gl/maps/TJ3M24HTJZBUB8V8A\nMore Info.: http://diu.gov.in/public-works-department-diu.php" +
                "\n\n14.Electricity Department Complain Cum Cash Collection Centre Diu\nAddress: PX9P+577, Diu, 362520\nHours: Open 24 Hours\nPhone: 02875 252 246\nMap: https://goo.gl/maps/wewmDeakBpjf4eTj9\nMore Info.: https://in.worldorgs.com/catalog/diu/electric-utility-company/electricity-department-complain-cum-cash-collection-centre"
                );
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);
    }
    protected void onDestroy()
    {
        super.onDestroy();
    }
}
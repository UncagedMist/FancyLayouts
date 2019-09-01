package kk.techbytecare.fancylayouts.Toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;
import kk.techbytecare.fancylayouts.R;

import static android.graphics.Typeface.BOLD_ITALIC;

public class ToastyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty);
    }

    public void onError(View view) {
        Toasty.error(this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
    }

    public void onSuccess(View view) {
        Toasty.success(this, "Success!", Toast.LENGTH_SHORT, true).show();
    }

    public void onInfo(View view) {
        Toasty.info(this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
    }

    public void onInfoFormat(View view) {
        Toasty.info(this, getFormattedMessage()).show();
    }

    public void onWarning(View view) {
        Toasty.warning(this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
    }

    public void onNormalIconLess(View view) {
        Toasty.normal(this, "Normal toast w/o icon").show();
    }

    public void onNormalWithIcon(View view) {
        Toasty.normal(this, "Normal toast w/ icon", R.drawable.ic_launcher_foreground).show();
    }

    public void onCustom(View view) {
        Toasty.custom(this, "I'm a custom Toast", R.drawable.ic_launcher_foreground, android.R.color.background_dark, Toasty.LENGTH_SHORT, true,
                true).show();
    }

    private CharSequence getFormattedMessage() {
        final String prefix = "Formatted ";
        final String highlight = "bold italic";
        final String suffix = " text";
        SpannableStringBuilder ssb = new SpannableStringBuilder(prefix).append(highlight).append(suffix);
        int prefixLen = prefix.length();
        ssb.setSpan(new StyleSpan(BOLD_ITALIC),
                prefixLen, prefixLen + highlight.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return ssb;
    }



}

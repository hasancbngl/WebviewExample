package com.cobanogluhasan.webviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);

        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
      //  webView.loadUrl("https://twitter.com/Hasancbngl");

        webView.loadData("<html><body> <head>\n" +
                        "<style>\n" +
                        ".serif {\n" +
                        "  font-family: \"Times New Roman\", Times, serif;\n" +
                        "}\n" +
                        "\n" +
                        ".sansserif {\n" +
                        "  font-family: Arial, Helvetica, sans-serif;\n" +
                        "}\n" +
                        "\n" +
                        ".monospace {\n" +
                        "  font-family: \"Lucida Console\", Courier, monospace;\n" +
                        "}\n" +
                        "</style>\n" +
                        "</head> <h1>Yo!  How's going on there'!</h1><p class=\"monospace\" style=\"color:blue\"> That's my test app bit*h </p> </body></html>",
                "text/html","UTF-8");

    }
}
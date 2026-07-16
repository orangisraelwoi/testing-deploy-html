package com.dts.garenatore.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
private WebView myWebView;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
myWebView = new WebView(this);
WebSettings ws = myWebView.getSettings();
ws.setJavaScriptEnabled(true);
ws.setDomStorageEnabled(true);
myWebView.setWebViewClient(new WebViewClient());
myWebView.loadUrl("file:///android_asset/www/index.html");
setContentView(myWebView);
}
}
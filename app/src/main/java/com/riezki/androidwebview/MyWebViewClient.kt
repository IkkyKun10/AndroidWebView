package com.riezki.androidwebview

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.core.content.ContextCompat.startActivity

/**
 * @author riezkymaisyar
 */

class MyWebViewClient(
    private val context: Context
) : WebViewClient() {
//    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
//        if (Uri.parse(request?.url?.host).host == "www.youtube.com") {
//            // This is your website, so don't override. Let your WebView load
//            // the page.
//            return false
//        }
//        // Otherwise, the link isn't for a page on your site, so launch another
//        // Activity that handles URLs.
//        Intent(Intent.ACTION_VIEW, Uri.parse(request?.url.toString())).apply {
//            startActivity(context, this, null)
//        }
//        return true
//    }

}
// Generated code from Butter Knife. Do not modify!
package io.pslab.fragment;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  @UiThread
  public HomeFragment_ViewBinding(HomeFragment target, View source) {
    this.target = target;

    target.tvDeviceStatus = Utils.findRequiredViewAsType(source, R.id.tv_device_status, "field 'tvDeviceStatus'", TextView.class);
    target.tvVersion = Utils.findRequiredViewAsType(source, R.id.tv_device_version, "field 'tvVersion'", TextView.class);
    target.imgViewDeviceStatus = Utils.findRequiredViewAsType(source, R.id.img_device_status, "field 'imgViewDeviceStatus'", ImageView.class);
    target.deviceDescription = Utils.findRequiredViewAsType(source, R.id.tv_device_description, "field 'deviceDescription'", TextView.class);
    target.tvConnectMsg = Utils.findRequiredViewAsType(source, R.id.tv_connect_msg, "field 'tvConnectMsg'", LinearLayout.class);
    target.webView = Utils.findRequiredViewAsType(source, R.id.pslab_web_view, "field 'webView'", WebView.class);
    target.svHomeContent = Utils.findRequiredViewAsType(source, R.id.home_content_scroll_view, "field 'svHomeContent'", ScrollView.class);
    target.wvProgressBar = Utils.findRequiredViewAsType(source, R.id.web_view_progress, "field 'wvProgressBar'", ProgressBar.class);
    target.stepsHeader = Utils.findRequiredViewAsType(source, R.id.steps_header_text, "field 'stepsHeader'", TextView.class);
    target.bluetoothButton = Utils.findRequiredViewAsType(source, R.id.bluetooth_btn, "field 'bluetoothButton'", Button.class);
    target.wifiButton = Utils.findRequiredViewAsType(source, R.id.wifi_btn, "field 'wifiButton'", Button.class);
    target.bluetoothWifiOption = Utils.findRequiredViewAsType(source, R.id.bluetooth_wifi_option_tv, "field 'bluetoothWifiOption'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDeviceStatus = null;
    target.tvVersion = null;
    target.imgViewDeviceStatus = null;
    target.deviceDescription = null;
    target.tvConnectMsg = null;
    target.webView = null;
    target.svHomeContent = null;
    target.wvProgressBar = null;
    target.stepsHeader = null;
    target.bluetoothButton = null;
    target.wifiButton = null;
    target.bluetoothWifiOption = null;
  }
}

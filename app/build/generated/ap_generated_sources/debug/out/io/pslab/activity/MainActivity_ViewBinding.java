// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.navigation.NavigationView;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.navigationView = Utils.findRequiredViewAsType(source, R.id.nav_view, "field 'navigationView'", NavigationView.class);
    target.drawer = Utils.findOptionalViewAsType(source, R.id.drawer_layout, "field 'drawer'", DrawerLayout.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationView = null;
    target.drawer = null;
    target.toolbar = null;
  }
}
